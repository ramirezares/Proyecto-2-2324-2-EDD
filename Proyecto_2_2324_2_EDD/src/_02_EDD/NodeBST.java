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
public class NodeBST implements Comparator {

    private int numberOfNode;       // Numero identificador del objeto para ordenarlo
    private Object Data;                 // Objeto a almacenar
    private NodeBST leftSong;       // Hijo izquierdo
    private NodeBST rightSong;      // Hijo Derecho

    public NodeBST(int numberToNode, Object data) {
        this.numberOfNode = numberToNode;
        this.Data = data;
        this.leftSong = this.rightSong = null;
    }

    public NodeBST(int numberToNode, Object data, NodeBST nLeft, NodeBST nRight) {
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
    
    public Object getData() {
        return Data;
    }

    public void setData(Object Data) {
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
    public boolean isEqual(int numNodeOfCurrentOperation) {
        boolean val = false;
        if (numNodeOfCurrentOperation == this.numberOfNode) {
            val = true;
        }
        return val;
    }

    @Override
    public boolean isLessThan(int numNodeOfCurrentOperation) {
        boolean val = false;
        if (this.numberOfNode < numNodeOfCurrentOperation) {
            val = true;
        }
        return val;
    }

    @Override
    public boolean isGreaterThan(int numNodeOfCurrentOperation) {
        boolean val = false;
        if (this.numberOfNode > numNodeOfCurrentOperation) {
            val = true;
        }
        return val;
    }
    
}
