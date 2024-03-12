package _02_EDD;

import _03_Classes.ClientStatus;

/**
 *
 * @author Danna Star
 */
public class HashTable {
    
    private final int size = 307; //primo no necesariamente cercano a una potencia de 2
    private int numElements;
    private double loadFactor;
    private ClientStatus[] table;
    
    public HashTable (){
        table =  new ClientStatus[this.size];
        numElements=0;
        loadFactor=0.0;
        for (int i = 0; i < this.size; i++) {
            table[i]=null;
        }
    }
    
    //
    /**
     *
     * @param key la clave que representa al objeto (nombre y apellido juntos)
     * @return la posicion de un elemento
     */
    public int index(String key){
         int i =0,p;
         long d;
         d=convertString(key);
         //aplica aritmetica modular para obetener direccion base 
        p=(int)(d % this.size);         
        //bucle de exploracion
        while(table[p]!=null && !table[p].getFullName().equals(key)){
        i++;
        p=p+i*i;
        p=p%size; //considera el array como circular 
        }
        return p;
    }

    /**
     *
     * @param key clave que identifica de manera unica al objeto que se agrega en el hashtable
     * @return el indice donde se debe agregar 
     */
    public long convertString(String key){
        long d;
        d=0;
        for (int i = 0; i < Math.min(10, key.length()); i++) {
            d = d * 27 + (int)(key.charAt(i));
        }
        if(d<0) d=-d;
        
        return d;
    
    }
    
    //Insetar un elemento en la tabla 

    /**
     *
     * @param s el status que se quiere insertar
     */
    public void insert(ClientStatus s){
    
    int position;
    position = index(s.getFullName());
    table[position]=s;
    this.numElements++;
    this.loadFactor= (double) (this.numElements/this.size);
    if (this.loadFactor>0.5){
        System.out.println("""
                           !! Factor de carga supera el 50%.!! 
                           Conviene aumentar el tama\u00f1o.""");
    }
    
    
    }
    
    //Busqueda de un elemento

    /**
     *
     * @param key
     * @return
     */
    public ClientStatus  search(String key){
    ClientStatus c;
    int position;
    position = index(key);
    c= table[position];
    return c;
    }
    
    
    //ELiminar un elemento
    
    public void delete (String key){
    int position;
    position = index(key);
    if (table[position]!=null){
        table[position]=null;
    }
    
    }
    
    //No hay metodo de eliminar pero se hace basicamente lo  mismo que arriba
    
    
    public void print(){
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.table[i]);
        }
}
    
    
}
