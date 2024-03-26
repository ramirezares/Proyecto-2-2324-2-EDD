package _02_EDD;

/**
 *
 * @author Daniela Zambrano 30956881
 */
public class SimpleList {
    private  Node head;
    private Node tail;
    private  int size;
   
    /*Constructor*/
    public SimpleList() {
        head = null;
        tail=null;
        size = 0;
    }

    public SimpleList(Node head) {
        this.head = head;
        this.tail = this.head;
    }
   /**
     * Resetea la lista
     */
    public void resetList(){
        head=null;
        tail=null;
        size=0;
    }
   
    /*Booleans*/
    /**
     * Consulta si la lista esta vacia.
     * @return true si el primer nodo (inicio), no apunta a otro nodo.
     */
    public boolean isEmpty(){
        return (head == null);
    }
/**
     * Consulta si el elemento existe dentro de la lista.
     * @param obj 
     * @return true si el objeto existe dentro de la lista
     */  
    public boolean isInList(Object obj){
        Node aux=head;
        for (int i = 0; i < this.size; i++) {
            if (aux.getContent()==obj){
                return true;
            }else{aux=aux.getpNext();}
        }
        return false;
    }

    /*Add*/
    /**
     * Agrega un elemento al principio de la lista.
     * @param obj a agregar.
     */ 
    public void addFirst(Object obj){
        if (this.isEmpty()){
            head= new SimpleNode(obj);
        }else{
            Node aux= head;
            head= new SimpleNode(obj,aux);
        }
        size++;
    }
   /**
     * Agrega un elemento al final de la lista.
     * @param obj a agregar.
     */  
    public void addEnd(Object obj){
        if (this.isEmpty()){
            head= new SimpleNode(obj);
            tail= head;
        }else{
            Node aux= new SimpleNode(obj);
            tail.setpNext(aux);
            tail=aux;
        }
        size++;
           
        }
     
/**
     * Agrega un elemento antes del elemento en el indice dado de la lista.
     * @param obj a agregar. si se le agrega un indice mayor al de la lista explota
     * @param index el indice a verificar
     */     
    public void addBeforeElem(Object obj, int index){
        if (this.indexExist(index)) {
            if (index == 0 ) {
                this.addFirst(obj);
            } else {
            Node aux=head;

            for (int i = 0; i < index-1; i++) {
                aux=aux.getpNext();
            }
            Node nuevo = new SimpleNode(obj,aux.getpNext());

            aux.setpNext(nuevo);
            size++;
            }
        }
    }
   
/**
     * Agrega un elemento despues del elemento en el indice dado de la lista.
     * @param obj a agregar. si se le agrega un indice mayor al de la lista explota
     * @param index el indice a verificar
     */      
    public void addAfterElem(Object obj, int index){
       if (this.indexExist(index)) {
        Node aux=head;
       
        for (int i = 0; i < index; i++) {
            aux=aux.getpNext();
        }
        Node nuevo = new SimpleNode(obj,aux.getpNext());
       
        aux.setpNext(nuevo);
        size++;
       
       }
    }      
   
    /*Getters*/
    public int getSize(){
        return size;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }
   
   
    /*Delete*/
/**
     * Borra la cabeza de la lista.
     */     
    public void deleteHead(){
        head=head.getpNext();
        size--;
    }
   
/**
     * Borra el ultimo elemento de la lista.
     */     
    public void deleteTail(){
        if(this.size==1){
            deleteHead();
           
        }else{
        Node aux=head;  
        int counter=0;
        while(counter<this.size-1){
            aux=aux.getpNext();
            counter++;}
        tail=aux;
        size--;
        }
    }
   
/**
     * Borra un elemento de la lista a traves de un indice
     * @param index indice del elemento a borrar.
     */ 
    public void deleteElemI(int index){
        if (this.indexExist(index)) {
            if (index==0){
            head=head.getpNext();
            size--;
            }else{
            int contador=0;
            Node anterior=head;
            while(contador <index-1){
                anterior=anterior.getpNext();
                contador++;
            }
            anterior.setpNext(anterior.getpNext().getpNext());
            size--;
            }
        }  
    }
   
/**
     * Borra un elemento de la lista a traves de una referencia
     * @param content contenido del elemento a borrar
     */     
    public void deleteElemC(Object content){      
        if (this.isInList(content)){
            Node anterior=head;
            Node nodito =head.getpNext();
            if (anterior.getContent()==content){
                this.deleteHead();}
            else{
                for (int i = 0; i < this.size; i++) {
                    if (nodito.getContent()==content){
                        anterior.setpNext(nodito.getpNext());}
                    else{
                    anterior=nodito;
                    nodito=nodito.getpNext();}
                }
            size--;
            }
        }
    }
   
   
    /*Print*/
    /** 
     * Imprime la lista.
     */   
    public void printList(){
        Node aux=head;
        for (int i = 0; i < this.size; i++) {
            System.out.println("Elemento N."+(i+1)+": "+aux.getContent());
            aux=aux.getpNext();
           
        }
   
    }
   
    public void printListBooking(){
        Node aux=head;
        for (int i = 0; i < this.size; i++) {
            System.out.println("Elemento N."+(i+1)+": "+aux.getContent());
            aux=aux.getpNext();
           
        }
   
    }
   
    /*Buscadores*/
/**
     * Retorna el contenido de un elemento a traves de un indice
     * @return retorna el contenido del elemento
     * @param index indice del elemento a buscar
     */     
    public Object getContentByIndex(int index){
        int contador=0;
        Node temporal = head;
        if (index==(this.getSize()-1)){
            return this.getTail().getContent();}
        else if(index==0){
        return this.getHead().getContent();}
        else if(index!=0){
            while(contador<index-1){
            temporal=temporal.getpNext();
            contador++;}
            return temporal.getpNext().getContent();}
        else{return null;}
    }
   
   
/**
     * Retorna el indice de un elemento a traves de una referencia
     * @return retorna el indice del elemento
     * @param obj indice del elemento a buscar
     */     
    public Integer getIndex(Object obj){ //devuelve el indice  del primero que encuentra
        Node aux= head;
        if (this.isInList(obj)){
            for (int i = 0; i < this.size; i++){
                if(aux.getContent()==obj){return i;}
                else{aux=aux.getpNext();}
            }
        }
        return null;
    }
   
   
    /*Changers*/
    //Por contenido
/**
     * Cambio el elemento por otro a traves de una referencia, lo cambia en todos los elementos iguales que encuentre
     * @param objRef elemento a cambiar
     * @param objNew contenido que reemplaza al contenido anterior
     */    
    public void changeAllContent(Object objRef, Object objNew){  //editar referencia solo el primero que tenga el valor igual lo cambia
        Node aux= head;
        if (this.isInList(objRef)){
            for (int i = 0; i < this.size; i++){
                if(aux.getContent()==objRef){
                    aux.setContent(objNew);
                    aux=aux.getpNext();}
                else{aux=aux.getpNext();}
            }
        }
    }
/**
     * Cambio el elemento por otro a traves de una referencia, solo toma el primer elemento que encuentre
     * @param objRef contenido del elemento a cambiar
     * @param objNew contenido que reemplaza al contenido anterior
     */    
    public void changeFirstContent(Object objRef, Object objNew){
        Node aux= head;
        if (this.isInList(objRef)){
            while (aux.getContent()!=objRef){
                aux=aux.getpNext();
            }
            aux.setContent(objNew);
        }
    }

    //por indice
    /**
     * Cambio el elemento por otro a traves de un indice, solo toma el primer elemento que encuentre
     * @param indexRef indice del elemento a cambiar.
     * @param objNew contenido que reemplaza al contenido anterior
     */    
    public void changeContent(int indexRef, Object objNew){//editar por posicion, cambiar el valor del nodo que esta en una posicion
        Node aux= head;
           
            if (indexRef>=0) {
                for (int i = 0; i < this.size; i++){
                    if(i==indexRef){
                        aux.setContent(objNew);}
                    else{aux=aux.getpNext();}
                }
            }
         
    }    
    
    /**
     * Revisa que el indice pertenezca al rango de la lista
     * @param index indice a verificar
     * @return true si el indice entra dentro del rango de la lista
     */    
    public boolean indexExist(int index) {
    return !(index<0 || index>this.size-1);    
   }
    
    //Convierte una lista de ciudades en un texto y las separa por coma
    public String toStringCities(){
        String texto ="";
        if(!this.isEmpty()){
            for (int i = 0; i < this.size; i++) {
                texto+=(String) this.getContentByIndex(i)+",";}
        return texto;}
        
        return "La lista es vacia";
    }
    
    ///Devuelve un String con una lista de los elementos de la lista
    public String toString(){
        String texto ="";
        if(!this.isEmpty()){
            for (int i = 0; i < this.size; i++) {
                texto+=(String) this.getContentByIndex(i)+",";}
        return texto;}
        
        return "La lista es vacia";
    }
    
    public void eliminarDuplicado() {
    Node p = head;
    while(p!=null) {
        Node q = p;
        while(q.getpNext()!= null) {
            if(p.getContent()== q.getpNext().getContent()) {
                q.setpNext(q.getpNext().getpNext());
            } else {
                q = q.getpNext();
            }
        }
        p = p.getpNext();
    }
}
}