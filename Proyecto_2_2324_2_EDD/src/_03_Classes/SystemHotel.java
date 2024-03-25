package _03_Classes;

import _02_EDD.BinarySearchTree;
import _02_EDD.HashTable;
import _02_EDD.NodeBST;
import _04_Functions.ReadCSV;
import _05_Validations.Validations;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author AresR
 */
public class SystemHotel {

    public static HashTable StatusList;
    public static BinarySearchTree Bookings;
    public static BinarySearchTree Rooms;

    public SystemHotel() {
        SystemHotel.StatusList = new HashTable();
        SystemHotel.Bookings = new BinarySearchTree();
        SystemHotel.Rooms = new BinarySearchTree();

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
            ClientStatus matched = SystemHotel.StatusList.search(nameToSearch);
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
            NodeBST matched = SystemHotel.Bookings.SearchNodeInBST(SystemHotel.Bookings.getRoot(), NumForSearch);
            Booking BookingMatched = (Booking) matched.getData();
            bookingToReturn = BookingMatched.getSummaryOfBooking();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No existe una reserva.");
        }
        // recibe un ID, busca en el arbol la reservacion con se ID y muestra sus datos
        return bookingToReturn;
    }

    public String visualizeRoomRecordWithRoomNumber(String roomNumber) {
        String recordToReturn = "";

        try {
            // El string lo tengo que transformar en numero, validar afuera si el string es un numero
            int NumForSearch = Integer.parseInt(roomNumber);
            NodeBST matched = SystemHotel.Rooms.SearchNodeInBST(SystemHotel.Rooms.getRoot(), NumForSearch);
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
            NodeBST NodeOfBooking = SystemHotel.Bookings.SearchNodeInBST(SystemHotel.Bookings.getRoot(), IDToSearch); //Busco la reserva 
            Booking BookingToStatus = (Booking) NodeOfBooking.getData();

            int[] occupiedRooms = ListOfOccupiedRoomsWithStatusWithDate(BookingToStatus.getArrival());
            
            int[] RoomswithType = ListOfRoomsWithType(BookingToStatus.getRoomType());
            
            int roomNumber = SelectNumOfAvailableRoom(RoomswithType, occupiedRooms);
            
            ClientStatus newClientToStatus = new ClientStatus( String.valueOf(roomNumber), BookingToStatus.getName(), BookingToStatus.getLastName(), BookingToStatus.getEmail(), BookingToStatus.getGender(), BookingToStatus.getCellphone(), BookingToStatus.getArrival());
            
            SystemHotel.StatusList.insert(newClientToStatus);
            
            SystemHotel.Bookings.deleteNodeInBST(SystemHotel.Bookings.getRoot(), Integer.parseInt(BookingToStatus.getID()));
            
            val = true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No hay habitacion disponible.");
        }
        return val;
        // Recibe el id de una reserva y se trae la reserva para crear un unevo cliente en status.
        // Borra la reserva del arbol de reservas

        //Llama a las funciones auxiliares private para asignar la habitacion, crear el nodo y realizar todas las acciones
        // Colocar JOptionPane para imprimir exitoso o fallas.
    }

    private int[] ListOfOccupiedRoomsWithStatusWithDate(String ArriveDate) {
        Validations temporal = new Validations();
        int[] occupiedRooms = new int[301];

        for (int i = 0; i < SystemHotel.StatusList.getSize(); i++) {
            ClientStatus current = SystemHotel.StatusList.getTable()[i];
            if (temporal.compareStrings(ArriveDate, current.getArrive())) {
                occupiedRooms[i] = Integer.parseInt(current.getRoomNumber());
            }
        }
        //Busca en el Hashtable status las habitaciones que estan ocupadas en la fecha de llegada indicada

        // devuelve un array con las habitaciones ocupadas    
        return occupiedRooms;
    }

    private int[] ListOfRoomsWithType(String roomsType) {
        // Hacer funcion que cree un array del largo de las habitaciones del tipo y con el numero de habitaciones correspondientes
        // int count = 0;
        // int amountOfRoomsWithType = countWithType(SystemHotel.Rooms.getRoot(), roomsType, count);

        ArrayList RoomswithType = new ArrayList();
        RoomswithType = AddWithType(SystemHotel.Rooms.getRoot(), roomsType, RoomswithType);
        Object[] temporalArray = RoomswithType.toArray();

        int[] intArray = new int[RoomswithType.size()];  // Array de enteros

        for (int i = 0; i < temporalArray.length; i++) {
            intArray[i] = (int) temporalArray[i];  // Casting de Object a int
        }

        return intArray;
    }

    
    /*
    private int countWithType(NodeBST pRoot, String roomType, int count) {
        Validations temporal = new Validations();

        if (pRoot != null) {
            Room current = (Room) pRoot.getData();
            count = countWithType(pRoot.getLeftSong(),roomType, count);
            
            if (temporal.compareStrings(roomType, current.getRoomType())){
            count++;
            }    
            
            count = countWithType(pRoot.getRightSong(), roomType, count);
            
        }
        return count;
    }
     */
    private ArrayList AddWithType(NodeBST pRoot, String roomType, ArrayList RoomswithType) {
        Validations temporal = new Validations();

        if (pRoot != null) {
            Room current = (Room) pRoot.getData();
            RoomswithType = AddWithType(pRoot.getLeftSong(), roomType, RoomswithType);

            if (temporal.compareStrings(roomType, current.getRoomType())) {
                RoomswithType.add(current.getRoomNumber());

            }
            RoomswithType = AddWithType(pRoot.getRightSong(), roomType, RoomswithType);

        }
        return RoomswithType;
    }

    private int SelectNumOfAvailableRoom(int[] RoomswithType, int[] occupiedRooms) {
        // Selecciona el numero de posicion de la habitacion del tipo disponible evaluando en la lista de ocupadas 
        // y la lista de las habitaciones del tipo deseado.

        int numToReturn = -1;
        
        for (int i : RoomswithType) {
            boolean notOccupied = true;
            for (int j : occupiedRooms) {                
                
                if(RoomswithType[i]==occupiedRooms[j]){
                    notOccupied=false;
                }
            }
            
            if(notOccupied){
                numToReturn = i;
                return numToReturn;
            }
        }

        return numToReturn;     // Validar que si devuelve -1 afuera nunca encontro una habitacion disponible
    }

    /**
     *
     * @param completeNameOfCustomerToSearch
     * @param ID
     * @param email
     * @return
     */
    public boolean checkOut(String completeNameOfCustomerToSearch, String ID, String email) {
        boolean val = false;
        // Validar afuera el ID
        try {
            ClientStatus matched = SystemHotel.StatusList.search(completeNameOfCustomerToSearch);
            String LineToAppend = CreateRecordLine(ID, matched.getName(), matched.getLastName(), email, matched.getGender(), matched.getArrive());

            int roomNumber = Integer.parseInt(matched.getRoomNumber());
            NodeBST currentNode = SystemHotel.Rooms.SearchNodeInBST(SystemHotel.Rooms.getRoot(), roomNumber); //Retorna el nodo a modificar
            Room toModify = (Room) currentNode.getData();

            toModify.modifyRoomRecord(LineToAppend);
            SystemHotel.Rooms.insertNewDataInNode(SystemHotel.Rooms.getRoot(), roomNumber, toModify); //Guarda el nuevo valor en el historial

            SystemHotel.StatusList.delete(completeNameOfCustomerToSearch);      //Borro el cliente de StatusList
            val = true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
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
}
