package _02_EDD;

/**
 * Interfaz para implementar la comparacion en los nodos de los arboles en caso
 * de realizar dos tipos de arbol.
 *
 * @author AresR
 */
public interface Comparator {

    /**
     * Funcion a construir para comparar si el numero de un nodo igual a un
     * numero dado.
     *
     * @param numNodeOfCurrentOperation numero a comparar con el numero del
     * nodo.
     * @return true si la premisa es correcta, false en caso de que no lo sea.
     */
    public boolean isEqual(int numNodeOfCurrentOperation);

    /**
     * Funcion a construir para comparar si el numero de un nodo es menor a un
     * numero dado.
     *
     * @param numNodeOfCurrentOperation numero a comparar con el numero del
     * nodo.
     * @return true si la premisa es correcta, false en caso de que no lo sea.
     */
    public boolean isLessThan(int numNodeOfCurrentOperation);

    /**
     * Funcion a construir para comparar si el numero de un nodo es mayor a un
     * numero dado.
     *
     * @param numNodeOfCurrentOperation numero a comparar con el numero del
     * nodo.
     * @return true si la premisa es correcta, false en caso de que no lo sea.
     */
    public boolean isGreaterThan(int numNodeOfCurrentOperation);
}
