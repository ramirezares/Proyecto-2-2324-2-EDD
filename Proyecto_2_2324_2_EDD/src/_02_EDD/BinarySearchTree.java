/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _02_EDD;

/**
 *
 * @author AresR
 */
public class BinarySearchTree {

    private NodeBST pRoot;

    public void BinarySearchTree() {
        this.pRoot = null;
    }

    public boolean isEmpty() {
        return this.pRoot == null;
    }

    public NodeBST SearchNodeInBST(NodeBST pRoot, int numNodeOfCurrentOperation) {

        if (pRoot == null) {
            return null;
        } else if (pRoot.isEqual(numNodeOfCurrentOperation)) {
            return pRoot;
        } else if (pRoot.isGreaterThan(numNodeOfCurrentOperation)) {
            return SearchNodeInBST(pRoot.getLeftSong(), numNodeOfCurrentOperation);
        } else {
            return SearchNodeInBST(pRoot.getRightSong(), numNodeOfCurrentOperation);
        }
    }

    public boolean insertNodeInBST(NodeBST pRoot, int numNodeOfCurrentOperation, Object Data) {
        boolean val = false;

        if (pRoot == null) {
            NodeBST nNodeBST = new NodeBST(numNodeOfCurrentOperation, Data);
            pRoot = nNodeBST;
            val = true;
        } else {
            if (pRoot.isGreaterThan(numNodeOfCurrentOperation)) {
                insertNodeInBST(pRoot.getLeftSong(), numNodeOfCurrentOperation, Data);
            } else if (pRoot.isLessThan(numNodeOfCurrentOperation)) {
                insertNodeInBST(pRoot.getRightSong(), numNodeOfCurrentOperation, Data);
            }
        }
        return val;
    }

    public boolean deleteNodeInBST(NodeBST pRoot, int numNodeOfCurrentOperation) {
        boolean val = false;

        if (pRoot == null) {
            return val;
        } else {
            if (pRoot.isGreaterThan(numNodeOfCurrentOperation)) {
                deleteNodeInBST(pRoot.getLeftSong(), numNodeOfCurrentOperation);
            } else {
                if (pRoot.isLessThan(numNodeOfCurrentOperation)) {
                    deleteNodeInBST(pRoot.getRightSong(), numNodeOfCurrentOperation);
                } else {
                    if (pRoot.getLeftSong() == null) {
                        pRoot = pRoot.getRightSong();
                    } else {
                        if (pRoot.getRightSong() == null) {
                            pRoot = pRoot.getLeftSong();
                        } else if (pRoot.isEqual(numNodeOfCurrentOperation)) {
                            pRoot = replace(pRoot);
                        }
                    }

                }
            }
        }
        return val;
    }

    protected NodeBST replace(NodeBST pRootOfCurrentOperation) {
        NodeBST nodeToReturn, aux;

        aux = pRootOfCurrentOperation;
        nodeToReturn = pRootOfCurrentOperation.getLeftSong();
        while (nodeToReturn.getRightSong() != null) {
            aux = nodeToReturn;
            nodeToReturn = nodeToReturn.getRightSong();
        }
        pRootOfCurrentOperation.setData(nodeToReturn.getData());
        if (aux == pRootOfCurrentOperation) {
            aux.setLeftSong(nodeToReturn.getLeftSong());
        } else {
            aux.setRightSong(nodeToReturn.getLeftSong());
        }
        return nodeToReturn;
    }

    // Determinar numero de elementos
    public int countNumberOfNodes() {
        NodeBST pRootAux = this.pRoot;
        int count = 0;

        count = inOrden(pRootAux, count);

        return count;
    }

    public int inOrden(NodeBST pRoot, int count) {
        if (pRoot != null) {
            inOrden(pRoot.getLeftSong(), count);
            count++;
            inOrden(pRoot.getRightSong(), count);
        }
        return count;
    }

    public NodeBST getRoot() {
        return pRoot;
    }

    public void setRoot(NodeBST Root) {
        this.pRoot = Root;
    }

}
