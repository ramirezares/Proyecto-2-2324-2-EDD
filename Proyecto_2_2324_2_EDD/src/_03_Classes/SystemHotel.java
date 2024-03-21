package _03_Classes;

import _02_EDD.BinarySearchTree;
import _02_EDD.HashTable;
import _02_EDD.NodeBST;
import _04_Functions.ReadCSV;
import java.lang.reflect.Array;
import javax.swing.JOptionPane;

/**
 *
 * @author AresR
 */
public class SystemHotel {

    private HashTable Status;
    private BinarySearchTree Bookings;
    private BinarySearchTree Rooms;

    public SystemHotel() {
        this.Status = new HashTable();
        this.Bookings = new BinarySearchTree();
        this.Rooms = new BinarySearchTree();
        
        ReadCSV temporal = new ReadCSV();   // Temporal para que solo funcione aca al inicio del programa.

        //temporal.readClientStatus(Status);        
        //temporal.readBooking(Bookings);
        //temporal.readRooms(Rooms);        // En esta funcion tenemos que leer el historial y crear el arbol 
        
                                            //solo agregar al arbol de habitaciones las activas del historial
    }

    public String visualizeGuestWithName(String nameOfClientToSearchFromTextField) {
        String nameToSearch = nameOfClientToSearchFromTextField;
        String textToReturn = "";
        
        try {
            ClientStatus matched = this.Status.search(nameToSearch);
            textToReturn = matched.getClientSummary();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encuentra en el hotel.");
        }
        
        return textToReturn;
        
        // recibe un nombre y apellido, lo busca en el hashtable y devuelve el string del huesped
    }

    public String visualizeBookingWithID(String IDofClientThatBooked) {
        String bookingToReturn = "";
        
        try{
            // La cedula la tengo que transformar en numero, validar afuera si el string es un numero
            int NumForSearch = Integer.parseInt(IDofClientThatBooked);
            NodeBST matched = this.Bookings.SearchNodeInBST(this.Bookings.getRoot(),NumForSearch);
            Booking BookingMatched = (Booking) matched.getData();
            // bookingToReturn = BookingMatched     hacer la funcion resumen en Booking
        }catch(Exception e){
            
        }
        

        // recibe un ID, busca en el arbol la reservacion con se ID y muestra sus datos
        return "";
    }

    public String visualizeRoomHistoryWith() {
        // recibe un numero de habitacion, busca en el arbol esa habitacion y mustra sus datos

        return "";
    }
    public void checkInWithIDBooking() {
        // Recibe el id de una reserva y se trae la reserva para crear un unevo cliente en status.
        // Borra la reserva del arbol de reservas
        
        //Llama a las funciones auxiliares private para asignar la habitacion, crear el nodo y realizar todas las acciones
        // Colocar JOptionPane para imprimir exitoso o fallas.
        
    }
    
    private void BookingToStatus(){
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
    private list ListOfRoomsWithType(){
    
    // Plantear, creo que con el CSV se pudieran leer las lineas y obtener solo las habitaciones con el tipo deseado
    
    // Retorna una lista o un array con las habitaciones del tipo deseado
    }
    */
    
    
    private int SelectNumOfAvailableRoom(){
        // Selecciona el numero de la habitacion evaluando en la lista de ocupadas 
        // y la lista de las habitaciones del tipo deseado
        
        
        return 1;
    } 
    
    /*
    private void addToStatus(){
    
    recibe la reserva, crea el objeto estado y lo agrega al hashtable
    
    pone en ocupado el atributo de la clase Room        Crear atributo
    
    }
    */

    public void checkOutWithName() {

        // busca en el hashtable con el name, si lo consigue procede al checkOut, si no indica que no esta
        
    }

    private void CreateHistoryLine(){
        
        // Con el objeto status, crea y devuelve una linea String para agregar en el historial de la habitacion
        
    }
    
    private void addToHistory(){
        
        // recibe el string a agregar, busca al nodo en el arbol de historial y con string builder añade la linea al historial

    }
    
    private void modifyHistory(){
        
        // plantear 
        
    }

    public HashTable getStatus() {
        return Status;
    }

    public void setStatus(HashTable Status) {
        this.Status = Status;
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
