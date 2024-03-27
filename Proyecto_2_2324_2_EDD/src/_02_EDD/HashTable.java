package _02_EDD;

import _03_Classes.ClientStatus;

/**
 *
 * @author Daniela Zambrano
 */
public class HashTable {

    private final int size = 1381; 
    private int numElements;
    private double loadFactor;
    private ClientStatus[] table;

    /**
     *Constructor de la clase Hashtable
     */
    public HashTable() {
        table = new ClientStatus[this.size];
        numElements = 0;
        loadFactor = 0.0;
        for (int i = 0; i < this.size; i++) {
            table[i] = null;
        }
    }

    //
    /**
     *Función que genera un indice a traves de un string clave insertado (función hash)
     * @param key la clave que representa al objeto fullname del client status
     * @return la posicion de un elemento
     */
    public int index(String key) {
        int i = 0, p;
        long d;
        d = convertString(key);
        //aplica aritmetica modular para obetener direccion base 
        p = (int) (d % this.size);
        //bucle de exploracion
        while (table[p] != null && !table[p].getFullName().equals(key)) {
            i++;
            p = p + i * i;
            p = p % size; //considera el array como circular 
        }
        return p;
    }

    /**
     *Conviee un string en un long 
     * @param key clave que identifica de manera unica al objeto que se agrega
     * en el hashtable fullname del client status
     * @return el indice donde se debe agregar
     */
    public long convertString(String key) {
        long d;
        d = 0;
        for (int i = 0; i < Math.min(10, key.length()); i++) {
            d = d * 27 + (int) (key.charAt(i));
        }
        if (d < 0) {
            d = -d;
        }

        return d;

    }

    /**
     *Insetar un elemento en la tabla (un client status)
     * @param s el status que se quiere insertar
     */
    public void insert(ClientStatus s) {

        int position;
        position = index(s.getFullName());
        table[position] = s;
        this.numElements++;
        this.loadFactor = (double) (this.numElements / this.size);
        if (this.loadFactor > 0.5) {
            System.out.println("""
                           !! Factor de carga supera el 50%.!! 
                           Conviene aumentar el tama\u00f1o.""");
        }

    }

    /**
     *Busca un elemento en la tabla apartir de un string clave
     * @param key fullname del client status
     * @return clientStatus encontrado
     */
    public ClientStatus search(String key) {
        ClientStatus c;
        int position;
        position = index(key);
        c = table[position];
        return c;
    }

    
    /**
     *ELimina un elemento en la tabla a partir de un string clave
     * @param key fullname del client status
     */
    public void delete(String key) {
        int position;
        position = index(key);
        if (table[position] != null) {
            table[position] = null;
        }

    }

    /**
     * Imprime toda la tabla por terminal
     */
    public void print() {
        for (int i = 0; i < this.size; i++) {
            System.out.println(this.table[i]);
        }
    }

    public int getSize() {
        return size;
    }

    public int getNumElements() {
        return numElements;
    }

    public void setNumElements(int numElements) {
        this.numElements = numElements;
    }

    public double getLoadFactor() {
        return loadFactor;
    }

    public void setLoadFactor(double loadFactor) {
        this.loadFactor = loadFactor;
    }

    public ClientStatus[] getTable() {
        return table;
    }

    public void setTable(ClientStatus[] table) {
        this.table = table;
    }

}
