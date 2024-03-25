package _02_EDD;

/**
 *
 * @author Daniela Zambrano
 */
public class NodoSimpleP extends Nodo{
 
 /**
 *
 * Constructores por defecto
 */
    public NodoSimpleP() {
    }

    public NodoSimpleP(Object contenido) {
        super(contenido);
    }

    public NodoSimpleP(Object contenido, Nodo pNext) {
        super(contenido, pNext);
    }
   
   
}