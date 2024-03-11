/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _02_EDD;

/**
 *
 * @author AresR
 * @param <E>
 */
public class NodeBST<E> implements Comparator {

    private int numberOfNode;       // Numero identificador del objeto para ordenarlo
    private E Data;                 // Objeto a almacenar
    private NodeBST leftSong;       // Hijo izquierdo
    private NodeBST rightSong;      // Hijo Derecho

    public void NodeBST(int numberToNode, E data) {
        this.numberOfNode = numberToNode;
        this.Data = data;
        this.leftSong = this.rightSong = null;
    }

    public void NodeBST(int numberToNode, E data, NodeBST nLeft, NodeBST nRight) {
        this.numberOfNode = numberToNode;
        this.Data = data;
        this.leftSong = nLeft;
        this.rightSong = nRight;
    }

    public int getNumberOfNode() {
        return numberOfNode;
    }

    public void setNumberOfNode(int numberOfNode) {
        this.numberOfNode = numberOfNode;
    }
    
    public E getData() {
        return Data;
    }

    public void setData(E Data) {
        this.Data = Data;
    }

    public NodeBST getLeftSong() {
        return leftSong;
    }

    public void setLeftSong(NodeBST leftSong) {
        this.leftSong = leftSong;
    }

    public NodeBST getRightSong() {
        return rightSong;
    }

    public void setRightSong(NodeBST rightSong) {
        this.rightSong = rightSong;
    }

    @Override
    public boolean isEqual(NodeBST NodeOfCurrentOperation) {
        boolean val = false;
        if (NodeOfCurrentOperation.numberOfNode == this.numberOfNode) {
            val = true;
        }
        return val;
    }

    @Override
    public boolean isLessThan(NodeBST NodeOfCurrentOperation) {
        boolean val = false;
        if (this.numberOfNode < NodeOfCurrentOperation.numberOfNode) {
            val = true;
        }
        return val;
    }

    @Override
    public boolean isGreaterThan(NodeBST NodeOfCurrentOperation) {
        boolean val = false;
        if (this.numberOfNode > NodeOfCurrentOperation.numberOfNode) {
            val = true;
        }
        return val;
    }
}
