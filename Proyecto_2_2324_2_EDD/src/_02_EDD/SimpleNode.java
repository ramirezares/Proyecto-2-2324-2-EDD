package _02_EDD;

/**
 *
 * @author Daniela Zambrano
 */
public class SimpleNode extends Node{
 
 /**
 *
 * Constructores por defecto
 */
    public SimpleNode() {
    }

    public SimpleNode(Object contenido) {
        super(contenido);
    }

    public SimpleNode(Object contenido, Node pNext) {
        super(contenido, pNext);
    }
   
   
}