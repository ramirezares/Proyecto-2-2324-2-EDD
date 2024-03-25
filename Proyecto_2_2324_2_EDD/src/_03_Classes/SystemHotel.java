/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _03_Classes;

import _02_EDD.BinarySearchTree;
import _02_EDD.HashTable;
import _02_EDD.NodeBST;
import _04_Functions.ReadCSV;
import javax.swing.JOptionPane;

/**
 *
 * @author AresR
 */
public class SystemHotel {

    private HashTable StatusList;
    private BinarySearchTree Bookings;
    private BinarySearchTree Rooms;

    public SystemHotel() {
        this.StatusList = new HashTable();
        this.Bookings = new BinarySearchTree();
        this.Rooms = new BinarySearchTree();

        ReadCSV temporal = new ReadCSV();   // Temporal para que solo funcione aca al inicio del programa.

        temporal.readClientStatus(StatusList);
        temporal.readBooking(Bookings);
        //temporal.readRooms(Rooms);        // En esta funcion tenemos que leer el historial y crear el arbol 

        //solo agregar al arbol de habitaciones las activas del historial
    }

    public String visualizeGuest(String clientFullName) {
        String nameToSearch = clientFullName;
        String textToReturn = "";

        try {
            ClientStatus matched = this.StatusList.search(nameToSearch);
            textToReturn = matched.getClientSummary();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encuentra en el hotel.");
        }

        return textToReturn;

        // recibe un nombre y apellido, lo busca en el hashtable y devuelve el string del huesped
    }

    public String visualizeBooking(String clientID) {
        String bookingToReturn = "";

        try {
            // La cedula la tengo que transformar en numero, validar afuera si el string es un numero
            int NumForSearch = Integer.parseInt(clientID);
            NodeBST matched = this.Bookings.SearchNodeInBST(this.Bookings.getRoot(), NumForSearch);
            Booking BookingMatched = (Booking) matched.getData();
            bookingToReturn = BookingMatched.getSummaryOfBooking();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No existe una reserva.");
        }
        // recibe un ID, busca en el arbol la reservacion con se ID y muestra sus datos
        return "";
    }

    public String visualizeRoomRecordWithRoomNumber(String roomNumber) {
        String recordToReturn = "";

        try {
            // El string lo tengo que transformar en numero, validar afuera si el string es un numero
            int NumForSearch = Integer.parseInt(roomNumber);
            NodeBST matched = this.Rooms.SearchNodeInBST(this.Rooms.getRoot(), NumForSearch);
            Room roomMatched = (Room) matched.getData();
            recordToReturn = roomMatched.getSummaryForRecord();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El numero no corresponde con una habitacion.");
        }

        // recibe un numero de habitacion, busca en el arbol esa habitacion y mustra sus datos
        return recordToReturn;
    }

    public boolean checkInWithIDBooking(String ID) {
        boolean val = false;
        try {
            // Validar que id sea una cedula afuera
            int IDToSearch = Integer.parseInt(ID);
            NodeBST NodeOfBooking = this.Bookings.SearchNodeInBST(this.Bookings.getRoot(), IDToSearch);
            Booking BookingToStatus = (Booking) NodeOfBooking.getData();
            
            //Hacer funciones auxiliares de abajo
            
            // Crear el objeto cliente y agregarlo al HashTable
            
            val = true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, ".");
        }
        return val;
        // Recibe el id de una reserva y se trae la reserva para crear un unevo cliente en status.
        // Borra la reserva del arbol de reservas

        //Llama a las funciones auxiliares private para asignar la habitacion, crear el nodo y realizar todas las acciones
        // Colocar JOptionPane para imprimir exitoso o fallas.
    }

    private void BookingToStatus() {
        // Busca en reverva con el ID y si la encuentra procede a hacer el Check in,
        // si no indica que no se encuentra en la reserva

    }

    /*
    //private array ListOfOccupiedRoomsWithStatusWithDate(){
    
    //Busca en el Hashtable status las habitaciones que estan ocupadas en la fecha de llegada indicada
    
    // devuelve un array con las habitaciones ocupadas
    
    }
     */

  /*
    private Integer[] ListOfRoomsWithType(){
        // Hacer funcion que cree un array del largo de las habitaciones del tipo y con el numero de habitaciones correspondientes
        int amountOfRoomsWithType = 0;
        
        for(int i=0){
            // Contador para saber el largo del array
            
        }
        
        //Creo el array
        
        //Recorro el arbol con otro for usando search. El len del arbol se puede saber con la funcion countNumberOfNodes
            //Si el atributo type del objeto dentro del nodo es igual al tipo de la habitacion, agrego el numero al array
    
    // Plantear, creo que con el CSV se pudieran leer las lineas y obtener solo las habitaciones con el tipo deseado
    
    // Retorna una lista o un array con las habitaciones del tipo deseado
    }
 */
    private int SelectNumOfAvailableRoom() {
        // Selecciona el numero de posicion de la habitacion del tipo disponible evaluando en la lista de ocupadas 
        // y la lista de las habitaciones del tipo deseado.

        return 1;
    }

    /*
    private void addToStatus(){
    
    recibe la reserva, crea el objeto estado y lo agrega al hashtable
    
    pone en ocupado el atributo de la clase Room        Crear atributo
    
    }
     */
    /**
     *
     * @param completeNameOfCustomerToSearch
     * @param ID
     * @param email
     * @param phoneNumber
     * @return
     */
    public boolean checkOut(String completeNameOfCustomerToSearch, String ID, String email, String phoneNumber) {
        boolean val = false;
        // Validar afuera el ID
        try {
            ClientStatus matched = this.StatusList.search(completeNameOfCustomerToSearch);
            String LineToAppend = CreateRecordLine(ID, matched.getName(), matched.getLastName(), email, matched.getEmail(), matched.getEmail());

            int roomNumber = Integer.parseInt(matched.getRoomNumber());
            NodeBST currentNode = this.Rooms.SearchNodeInBST(this.Rooms.getRoot(), roomNumber); //Retorna el nodo a modificar
            Room toModify = (Room) currentNode.getData();

            toModify.modifyRoomRecord(LineToAppend);
            this.Rooms.insertNewDataInNode(this.Rooms.getRoot(), roomNumber, toModify); //Guarda el nuevo valor en el historial

            this.StatusList.delete(completeNameOfCustomerToSearch); //Borro el cliente de StatusList
            val = true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Clente no encontrado.");
        }
        return val;
        // busca en el hashtable con el name, si lo consigue procede al checkOut, si no indica que no esta
    }

    private String CreateRecordLine(String ID, String name, String lastName, String email, String genre, String arrive) {
        String lineToReturn = "";
        RoomRecord newLine = new RoomRecord(ID, name, lastName, email, genre, arrive);

        lineToReturn = newLine.toString();

        return lineToReturn;
        // Con el objeto status, crea y devuelve una linea String para agregar en el historial de la habitacion
    }

    public HashTable getStatusList() {
        return StatusList;
    }

    public void setStatusList(HashTable StatusList) {
        this.StatusList = StatusList;
    }

    public BinarySearchTree getBookings() {
        return Bookings;
    }

    public void setBookings(BinarySearchTree Bookings) {
        this.Bookings = Bookings;
    }

    public BinarySearchTree getRooms() {
        return Rooms;
    }

    public void setRooms(BinarySearchTree Rooms) {
        this.Rooms = Rooms;
    }

}
