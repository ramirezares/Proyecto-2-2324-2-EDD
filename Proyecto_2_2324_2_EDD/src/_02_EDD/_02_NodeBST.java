/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _02_EDD;

/**
 * Clase NodeBST: esta clase define el objeto nodo para un árbol binario de
 * búsqueda y su comportamiento con sus atributos correspondientes para el
 * número identificador del nodo, el objeto que almacena y las referencias a los
 * nodos hijos izquierdo y derecho. Implementa la interfaz Comparator para
 * comparar nodos según su número identificador.
 *
 * @author AresR
 * @version 18/03/2024 (v1)
 */
public class NodeBST implements Comparator {

    private int numberOfNode;       // Numero identificador del objeto para ordenarlo
    private Object Data;            // Objeto a almacenar
    private NodeBST leftSong;       // Hijo izquierdo
    private NodeBST rightSong;      // Hijo Derecho

    /**
     * Constructor de la clase NodeBST. Inicializa el nodo con un número
     * identificador y un objeto, sin hijos.
     *
     * @param numberToNode Número identificador del nodo.
     * @param data Objeto a almacenar en el nodo.
     */
    public NodeBST(int numberToNode, Object data) {
        this.numberOfNode = numberToNode;
        this.Data = data;
        this.leftSong = this.rightSong = null;
    }

    /**
     * Constructor de la clase NodeBST. Inicializa el nodo con un número
     * identificador, un objeto y referencias a nodos hijos.
     *
     * @param numberToNode Número identificador del nodo.
     * @param data Objeto a almacenar en el nodo.
     * @param nLeft Nodo hijo izquierdo.
     * @param nRight Nodo hijo derecho.
     */
    public NodeBST(int numberToNode, Object data, NodeBST nLeft, NodeBST nRight) {
        this.numberOfNode = numberToNode;
        this.Data = data;
        this.leftSong = nLeft;
        this.rightSong = nRight;
    }

    /**
     * Obtiene el número identificador del nodo.
     *
     * @return Número identificador del nodo.
     */
    public int getNumberOfNode() {
        return numberOfNode;
    }

    /**
     * Establece el número identificador del nodo.
     *
     * @param numberOfNode Número identificador a establecer.
     */
    public void setNumberOfNode(int numberOfNode) {
        this.numberOfNode = numberOfNode;
    }

    /**
     * Obtiene el objeto almacenado en el nodo.
     *
     * @return Objeto almacenado en el nodo.
     */
    public Object getData() {
        return Data;
    }

    /**
     * Establece el objeto a almacenar en el nodo.
     *
     * @param Data Objeto a almacenar.
     */
    public void setData(Object Data) {
        this.Data = Data;
    }

    /**
     * Obtiene el nodo hijo izquierdo.
     *
     * @return Nodo hijo izquierdo.
     */
    public NodeBST getLeftSong() {
        return leftSong;
    }

    /**
     * Establece el nodo hijo izquierdo.
     *
     * @param leftSong Nodo hijo izquierdo a establecer.
     */
    public void setLeftSong(NodeBST leftSong) {
        this.leftSong = leftSong;
    }

    /**
     * Obtiene el nodo hijo derecho.
     *
     * @return Nodo hijo derecho.
     */
    public NodeBST getRightSong() {
        return rightSong;
    }

    /**
     * Establece el nodo hijo derecho.
     *
     * @param rightSong Nodo hijo derecho a establecer.
     */
    public void setRightSong(NodeBST rightSong) {
        this.rightSong = rightSong;
    }

    /**
     * Compara si el número identificador del nodo es igual al número dado.
     *
     * @param numNodeOfCurrentOperation Número para comparar.
     * @return true si los números son iguales, false en caso contrario.
     */
    @Override
    public boolean isEqual(int numNodeOfCurrentOperation) {
        boolean val = false;
        if (numNodeOfCurrentOperation == this.numberOfNode) {
            val = true;
        }
        return val;
    }

    /**
     * Compara si el número identificador del nodo es menor al número dado.
     *
     * @param numNodeOfCurrentOperation Número para comparar.
     * @return true si el número del nodo es menor, false en caso contrario.
     */
    @Override
    public boolean isLessThan(int numNodeOfCurrentOperation) {
        boolean val = false;
        if (this.numberOfNode < numNodeOfCurrentOperation) {
            val = true;
        }
        return val;
    }

    /**
     * Compara si el número identificador del nodo es mayor al número dado.
     *
     * @param numNodeOfCurrentOperation Número para comparar.
     * @return true si el número del nodo es mayor, false en caso contrario.
     */
    @Override
    public boolean isGreaterThan(int numNodeOfCurrentOperation) {
        boolean val = false;
        if (this.numberOfNode > numNodeOfCurrentOperation) {
            val = true;
        }
        return val;
    }

}
