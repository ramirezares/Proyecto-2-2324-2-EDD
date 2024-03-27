/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _02_EDD;

/**
 * Clase Arbol Binario de Busqueda: Esta clase define el objeto Arbol binario de
 * busqueda y su comportamiento, con su atributo pRoot (raiz). Utiliza los nodos
 * NodeBST para almacenar y manipular los datos.
 *
 * @author AresR
 * @version 25/03/2024 (v3)
 *
 */
public class BinarySearchTree {

    private NodeBST pRoot;  // Atributo que representa el nodo raiz del arbol.

    /**
     * Constructor de la clase. Inicializa el arbol sin nodos, vacio.
     */
    public void BinarySearchTree() {
        this.pRoot = null;
    }

    /**
     * Verifica si el árbol está vacío.
     *
     * @return true si el árbol está vacío, false en caso contrario.
     */
    public boolean isEmpty() {
        return this.pRoot == null;
    }

    /**
     * Busca un nodo con un número específico en el árbol.
     *
     * @param pRoot El nodo raíz del subárbol en el que se iniciará la búsqueda.
     * @param numNodeOfCurrentOperation El número identificador del nodo a
     * buscar.
     * @return El nodo encontrado.
     * @throws Exception Si el nodo no se encuentra en el árbol.
     */
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

    /**
     * Inserta un nuevo nodo en el árbol binario de búsqueda.
     *
     * @param pRoot El nodo raíz del arbol en el que se iniciará la inserción.
     * @param numNodeOfCurrentOperation El número identificador del nodo a
     * insertar.
     * @param Data El objeto a almacenar en el nuevo nodo.
     * @return true si la inserción fue exitosa, false en caso contrario.
     */
    public boolean insertNodeInBST(NodeBST pRoot, int numNodeOfCurrentOperation, Object Data) {
        boolean val = true;
        try {
            this.pRoot = insertNodeRecursively(pRoot, numNodeOfCurrentOperation, Data);
        } catch (Exception E) {
            val = false;
        }
        return val;
    }

    /**
     * Funcion auxiliar que realiza la insercion recursivamente en el arbol y
     * devuelve el nuevo arbol con el nodo ya insertado.
     *
     * @param pCurrentRoot El nodo raíz del árbol en el que se iniciará la
     * inserción.
     * @param numNodeOfCurrentOperation El número identificador del nodo a
     * insertar.
     * @param Data El objeto a almacenar en el nuevo nodo.
     * @return El nodo que corresponde a la raiz del arbol ya con la insercion.
     * @throws Exception la excepcion que indica que el nodo ya existe en el
     * arbol.
     */
    private NodeBST insertNodeRecursively(NodeBST pCurrentRoot, int numNodeOfCurrentOperation, Object Data) throws Exception {
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

    /**
     * Elimina un nodo del árbol binario de búsqueda.
     *
     * @param pRoot El nodo raíz del subárbol en el que se iniciará la
     * eliminación.
     * @param numNodeOfCurrentOperation El número identificador del nodo a
     * eliminar.
     * @return true si la eliminación fue exitosa, false en caso contrario.
     */
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

    /**
     * Funcion auxiliar que realiza la eliminacion recursivamente en el arbol y
     * devuelve el nuevo arbol con el nodo ya eliminado.
     *
     * @param pRoot El nodo raíz del árbol en el que se realizara la
     * eliminacion.
     * @param numNodeOfCurrentOperation el numero del nodo a eliminar
     * @return El nodo que corresponde a la raiz del arbol luego de realizar la
     * eliminacion.
     * @throws Exception la excepcion que indica que el nodo a eliminar no
     * existe en el arbol.
     */
    private NodeBST deleteNodeInBSTRecursively(NodeBST pRoot, int numNodeOfCurrentOperation) throws Exception {
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

    /**
     * Funcion auxiliar que reordena los nodos del arbol cuando se realiza una
     * eliminacion de un nodo que tiene dos nodos hijos.
     *
     * @param pRootOfCurrentOperation Nodo que modificara para luego eliminarse
     * @return el nodo con la rotacion ya realizada
     */
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

    /**
     * Retorna el número total de nodos en el árbol.
     *
     * @return El número total de nodos en el árbol.
     */
    public int countNumberOfNodes() {
        NodeBST pRootAux = this.pRoot;
        int count = 0;

        count = countInOrden(pRootAux, count);

        return count;
    }

    /**
     * Funcion auxiliar recursiva para contar el numero de nodos mediante
     * recorrido InOrden.
     *
     * @param pRoot nodo raiz del arbol del cual se contara su numero de
     * elementos.
     * @param count cuenta a regresar que representa en numero de elementos.
     * @return el numero total de elementos del arbol.
     */
    protected int countInOrden(NodeBST pRoot, int count) {
        if (pRoot != null) {
            count = countInOrden(pRoot.getLeftSong(), count);
            count++;
            count = countInOrden(pRoot.getRightSong(), count);
        }
        return count;
    }

    /**
     * Retorna el nodo raíz del árbol.
     *
     * @return El nodo raíz del árbol.
     */
    public NodeBST getRoot() {
        return pRoot;
    }

    /**
     * Establece el nodo raíz del árbol a un nuevo nodo dado como parametro.
     *
     * @param Root El nodo raíz a establecer.
     */
    public void setRoot(NodeBST Root) {
        this.pRoot = Root;
    }

    /**
     * Resumen del árbol binario de búsqueda en un String utilizando paréntesis
     * en preorden.
     *
     * @return Un String que representa el árbol en preorden utilizando
     * paréntesis.
     */
    public String summarizeTree() {
        StringBuilder sb = new StringBuilder();
        summarizeTreeRecursive(pRoot, sb);
        return sb.toString();
    }

    /**
     * Método auxiliar recursivo para realizar el recorrido en preorden del
     * árbol y generar la representación en paréntesis
     *
     * @param pRootOfTree nodo raiz del arbol del cual se quiere obtener su
     * resumen en forma de string.
     * @param sb 
     */
    private void summarizeTreeRecursive(NodeBST pRootOfTree, StringBuilder sb) {
        if (pRootOfTree != null) {
            // Agregar el valor del nodo al String
            sb.append("(").append(pRootOfTree.getNumberOfNode()).append(" ");

            // Recorrer el subárbol izquierdo
            summarizeTreeRecursive(pRootOfTree.getLeftSong(), sb);

            // Recorrer el subárbol derecho
            summarizeTreeRecursive(pRootOfTree.getRightSong(), sb);

            // Cerrar el paréntesis del nodo
            sb.append(")");
        }
    }

    /**
     * Inserta un nuevo dato en un nodo existente del árbol.
     *
     * @param pRoot El nodo raíz del subárbol en el que se buscará el nodo a
     * actualizar.
     * @param numNodeOfCurrentOperation El número identificador del nodo a
     * actualizar.
     * @param newData El nuevo objeto de datos a asignar al nodo.
     * @return true si la actualización fue exitosa, false en caso contrario.
     * @throws Exception Si el nodo no se encuentra en el árbol.
     */
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
