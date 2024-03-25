/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _02_EDD;

/**
 * Clase Arbol Binario de Busqueda. Esta clase define el objeto Arbol binario de
 * busqueda y su comportamiento, con su atributo pRoot (raiz)
 *
 * @author AresR
 * @version 25/03/2024 (v3)
 *
 */
public class BinarySearchTree {

    private NodeBST pRoot;

    /**
     * Constructor de la clase. Inicializa el arbol sin nodos, vacio.
     */
    public void BinarySearchTree() {
        this.pRoot = null;
    }

    public boolean isEmpty() {
        return this.pRoot == null;
    }

    public NodeBST SearchNodeInBST(NodeBST pRoot, int numNodeOfCurrentOperation) throws Exception {

        if (pRoot == null) {
            throw new Exception("No se encuentra.");
        } else if (pRoot.isEqual(numNodeOfCurrentOperation)) {
            return pRoot;
        } else if (pRoot.isGreaterThan(numNodeOfCurrentOperation)) {
            return SearchNodeInBST(pRoot.getLeftSong(), numNodeOfCurrentOperation);
        } else {
            return SearchNodeInBST(pRoot.getRightSong(), numNodeOfCurrentOperation);
        }
    }

    public boolean insertNodeInBST(NodeBST pRoot, int numNodeOfCurrentOperation, Object Data) {
        boolean val = true;
        try {
            this.pRoot = insertNodeRecursively(pRoot, numNodeOfCurrentOperation, Data);
        } catch (Exception E) {
            val = false;
        }
        return val;
    }

    protected NodeBST insertNodeRecursively(NodeBST pCurrentRoot, int numNodeOfCurrentOperation, Object Data) throws Exception {
        if (pCurrentRoot == null) {
            pCurrentRoot = new NodeBST(numNodeOfCurrentOperation, Data);
        } else if (pCurrentRoot.isGreaterThan(numNodeOfCurrentOperation)) {
            pCurrentRoot.setLeftSong(insertNodeRecursively(pCurrentRoot.getLeftSong(), numNodeOfCurrentOperation, Data));
        } else if (pCurrentRoot.isLessThan(numNodeOfCurrentOperation)) {
            pCurrentRoot.setRightSong(insertNodeRecursively(pCurrentRoot.getRightSong(), numNodeOfCurrentOperation, Data));
        } else {
            throw new Exception("El nodo ya existe.");
        }

        return pCurrentRoot;
    }

    public boolean deleteNodeInBST(NodeBST pRoot, int numNodeOfCurrentOperation) {
        boolean val = false;

        try {
            this.pRoot = deleteNodeInBSTRecursively(pRoot, numNodeOfCurrentOperation);
            val = true;
        } catch (Exception e) {
            return val;
        }
        return val;
    }

    protected NodeBST deleteNodeInBSTRecursively(NodeBST pRoot, int numNodeOfCurrentOperation) throws Exception {
        if (pRoot == null) {
            throw new Exception("El nodo no existe.");

        } else if (pRoot.isGreaterThan(numNodeOfCurrentOperation)) {
            pRoot.setLeftSong(deleteNodeInBSTRecursively(pRoot.getLeftSong(), numNodeOfCurrentOperation));

        } else if (pRoot.isLessThan(numNodeOfCurrentOperation)) {
            pRoot.setRightSong(deleteNodeInBSTRecursively(pRoot.getRightSong(), numNodeOfCurrentOperation));

        } else {
            if (pRoot.getLeftSong() == null) {
                pRoot = pRoot.getRightSong();

            } else if (pRoot.getRightSong() == null) {
                pRoot = pRoot.getLeftSong();

            } else // Tiene los dos nodos hijos
            {
                pRoot = replace(pRoot);
            }
        }
        return pRoot;
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

        count = countInOrden(pRootAux, count);

        return count;
    }

    protected int countInOrden(NodeBST pRoot, int count) {
        if (pRoot != null) {
            count = countInOrden(pRoot.getLeftSong(), count);
            count++;
            count = countInOrden(pRoot.getRightSong(), count);
        }
        return count;
    }

    public NodeBST getRoot() {
        return pRoot;
    }

    public void setRoot(NodeBST Root) {
        this.pRoot = Root;
    }

    // Método para resumir el árbol binario de búsqueda en un String utilizando paréntesis en preorden
    public String summarizeTree() {
        StringBuilder sb = new StringBuilder();
        summarizeTreeRecursive(pRoot, sb);
        return sb.toString();
    }

    // Método auxiliar recursivo para realizar el recorrido en preorden del árbol y generar la representación en paréntesis
    protected void summarizeTreeRecursive(NodeBST node, StringBuilder sb) {
        if (node != null) {
            // Agregar el valor del nodo al String
            sb.append("(").append(node.getNumberOfNode()).append(" ");

            // Recorrer el subárbol izquierdo
            summarizeTreeRecursive(node.getLeftSong(), sb);

            // Recorrer el subárbol derecho
            summarizeTreeRecursive(node.getRightSong(), sb);

            // Cerrar el paréntesis del nodo
            sb.append(")");
        }
    }

    public boolean insertNewDataInNode(NodeBST pRoot, int numNodeOfCurrentOperation, Object newData) throws Exception {
        if (pRoot == null) {
            throw new Exception("No se encuentra.");

        } else if (pRoot.isEqual(numNodeOfCurrentOperation)) {
            pRoot.setData(newData);
            return true;

        } else if (pRoot.isGreaterThan(numNodeOfCurrentOperation)) {
            return insertNewDataInNode(pRoot.getLeftSong(), numNodeOfCurrentOperation, newData);

        } else {
            return insertNewDataInNode(pRoot.getRightSong(), numNodeOfCurrentOperation, newData);
        }
    }
}
