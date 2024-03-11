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

    // Pertenece
    
    // Determinar altura
    
    // Determinar numero de elementos
    
    // Hacer una copia
    
    //Determinar si dos arboles son identicos
    
    //Borrar (Hacer null?)

    public NodeBST SearchNodeInBST(NodeBST NodeOfCurrentOperation) {

        if (this.pRoot == null) {
            return null;
        } else if (this.pRoot.isEqual(NodeOfCurrentOperation)) {
            return this.getRoot();
        } else if (this.pRoot.isGreaterThan(NodeOfCurrentOperation)) {
            BinarySearchTree SubTreeLeft = new BinarySearchTree();
            SubTreeLeft.setRoot(this.pRoot.getLeftSong());
            return SubTreeLeft.SearchNodeInBST(NodeOfCurrentOperation);
        } else {
            BinarySearchTree SubTreeRight = new BinarySearchTree();
            SubTreeRight.setRoot(this.pRoot.getLeftSong());
            return SubTreeRight.SearchNodeInBST(NodeOfCurrentOperation);
        }
    }

    public boolean insertNodeInBST(NodeBST NodeOfCurrentOperation) {
        boolean val = false;

        if (this.pRoot == null) {
            this.pRoot = NodeOfCurrentOperation;
        } else {
            if (this.pRoot.isGreaterThan(NodeOfCurrentOperation)) {
                BinarySearchTree SubTreeLeft = new BinarySearchTree();
                SubTreeLeft.setRoot(this.pRoot.getLeftSong());
                SubTreeLeft.insertNodeInBST(NodeOfCurrentOperation);
                this.pRoot.setLeftSong(SubTreeLeft.getRoot());
                val = true;
            } else if (this.pRoot.isLessThan(NodeOfCurrentOperation)) {
                BinarySearchTree SubTreeRight = new BinarySearchTree();
                SubTreeRight.setRoot(this.pRoot.getRightSong());
                SubTreeRight.insertNodeInBST(NodeOfCurrentOperation);
                this.pRoot.setRightSong(SubTreeRight.getRoot());
                val = true;
            }
        }
        return val;
    }

    public boolean deleteNodeInBST(NodeBST NodeOfCurrentOperation) {
        boolean val = false;

        if (this.pRoot == null) {
            return val;
        } else {
            if (this.pRoot.isGreaterThan(NodeOfCurrentOperation)) {
                BinarySearchTree SubTreeLeft = new BinarySearchTree();
                SubTreeLeft.setRoot(this.pRoot.getLeftSong());
                SubTreeLeft.deleteNodeInBST(NodeOfCurrentOperation);
                this.pRoot.setLeftSong(SubTreeLeft.getRoot());

            } else {
                if (this.pRoot.isLessThan(NodeOfCurrentOperation)) {
                    BinarySearchTree SubTreeRight = new BinarySearchTree();
                    SubTreeRight.setRoot(this.pRoot.getRightSong());
                    SubTreeRight.insertNodeInBST(NodeOfCurrentOperation);
                    this.pRoot.setRightSong(SubTreeRight.getRoot());
                }
                else {
                    if (this.pRoot.getLeftSong()==null){
                        this.pRoot = this.pRoot.getRightSong();
                    }
                    else{
                        if(this.pRoot.getRightSong()==null){
                            this.pRoot = this.pRoot.getLeftSong();
                        }
                        else{
                            NodeBST aux = searchMin(this.pRoot.getRightSong());
                            this.pRoot.setData(aux.getData());
                            this.deleteNodeInBST(this.pRoot.getRightSong());
                        }
                    }
                    
                }
            }
        }
        return val;
    }
    
    public NodeBST searchMin(NodeBST pRootOfCurrentOperation){
        NodeBST nodeToReturn;
        
        NodeBST nodeLeft = pRootOfCurrentOperation.getLeftSong();
        NodeBST nodeRight = pRootOfCurrentOperation.getRightSong();
        
        if(nodeLeft.getNumberOfNode()<nodeRight.getNumberOfNode()){
            nodeToReturn = nodeLeft;
        } else{
            nodeToReturn = nodeRight;
        }
        
        return nodeToReturn;
    }
    
    public NodeBST getRoot() {
        return pRoot;
    }

    public void setRoot(NodeBST Root) {
        this.pRoot = Root;
    }
    
    // Obtener la data con el numero del nodo. data es la reservacion o la habitacion
    
    // Obtener 
}
