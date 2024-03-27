package _02_EDD;

/**
 *
 * @author Daniela Zambrano 30956881
 */
public abstract class Node {
    private Node pNext;
    private Object content;
 
//getters and setters    
    
/**
 *
 * @return El nodo siguiente
 */
    public Node getpNext() {
        return pNext;
    }
   
    public void setpNext(Node pNext) {
        this.pNext = pNext;
    }

 /**
 *
 * @return El contenido del nodo
 */
    public Object getContent() {
        return content;
    }

    public void setContent(Object contenido) {
        this.content = contenido;
    }
    
 /**
 *
 * Constructores por defecto
 */
    public Node() {
        this.pNext = null;
        this.content = null;
    }
   
    public Node(Object contenido) {
        this.pNext = null;
        this.content = contenido;
    }
   
    public Node(Object contenido,Node pNext) {
        this.pNext = pNext;
        this.content = contenido;
    }
   
   
}
