package _03_Classes;

import _02_EDD.BinarySearchTree;
import _02_EDD.HashTable;
import _02_EDD.NodeBST;
import _04_Functions.Helper;
import _04_Functions.ReadCSV;
import _05_Validations.Validations;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author AresR
 */
public class SystemHotel {

    /**
     * Tabla hash para almacenar el estado de los clientes en el hotel.
     */
    public static HashTable StatusList;

    /**
     * Árbol binario de búsqueda para almacenar las reservas realizadas.
     */
    public static BinarySearchTree Bookings;

    /**
     * Árbol binario de búsqueda para almacenar la información de las
     * habitaciones.
     */
    public static BinarySearchTree Rooms;

    /**
     * Constructor de la clase SystemHotel. Inicializa las estructuras de datos
     * y carga la información inicial desde un archivo CSV.
     */
    public SystemHotel() {
        SystemHotel.StatusList = new HashTable();
        SystemHotel.Bookings = new BinarySearchTree();
        SystemHotel.Rooms = new BinarySearchTree();

        ReadCSV temporal = new ReadCSV();   // Temporal para que solo funcione aca al inicio del programa.

        temporal.readClientStatus(StatusList);
        temporal.readBooking(Bookings);
        temporal.readRooms(Rooms);        // En esta funcion tenemos que leer el historial y crear el arbol 

    }

    /**
     * Visualiza la información de un huésped en base a su nombre completo.
     *
     * @param clientFullName Nombre y apellido del huésped a buscar.
     * @return un string con la informacion del huésped.
     */
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
    }

    /**
     * Visualiza la información de una reserva en base a su ID.
     *
     * @param clientID ID de la reserva a buscar.
     * @return un string con la información la reserva.
     */
    public String visualizeBooking(String clientID) {
        String bookingToReturn = "";

        try {
            int NumForSearch = Integer.parseInt(clientID);
            NodeBST matched = SystemHotel.Bookings.SearchNodeInBST(SystemHotel.Bookings.getRoot(), NumForSearch);
            Booking BookingMatched = (Booking) matched.getData();
            bookingToReturn = BookingMatched.getSummaryOfBooking();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No existe una reserva.");
        }
        return bookingToReturn;
    }

    /**
     * Visualiza la información de una habitación en base a su número para ver
     * su historial.
     *
     * @param roomNumber Número de la habitación a buscar.
     * @return un string con la información de la habitación y su historial.
     */
    public String visualizeRoomRecord(String roomNumber) {
        String recordToReturn = "";

        try {
            int NumForSearch = Integer.parseInt(roomNumber);
            NodeBST matched = SystemHotel.Rooms.SearchNodeInBST(SystemHotel.Rooms.getRoot(), NumForSearch);
            Room roomMatched = (Room) matched.getData();
            recordToReturn = roomMatched.getSummaryForRecord();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El numero no corresponde con una habitacion.");
        }
        return recordToReturn;
    }

    /**
     * Realiza el proceso de check-in de un cliente en el hotel.
     *
     * @param ID ID de la reserva para realizar el check-in.
     * @return una instancia de la clase CLientStatus para colocar un resumen de
     * la información del cliente registrado y la habitacion asignada.
     */
    public ClientStatus checkIn(String ID) {
        ClientStatus client = null;
        Helper help = new Helper();
        try {
            int IDToSearch = Integer.parseInt(ID);
            NodeBST NodeOfBooking = SystemHotel.Bookings.SearchNodeInBST(SystemHotel.Bookings.getRoot(), IDToSearch); //Busco la reserva 
            Booking BookingToStatus = (Booking) NodeOfBooking.getData();

            //Llama a las funciones auxiliares private para asignar la habitacion, crear el nodo y realizar todas las acciones
            int[] occupiedRooms = ListOfOccupiedRoomsWithStatusWithDate(BookingToStatus.getArrival());

            int[] RoomswithType = ListOfRoomsWithType(BookingToStatus.getRoomType());

            int roomNumber = SelectNumOfAvailableRoom(RoomswithType, occupiedRooms);

            ClientStatus newClientToStatus = new ClientStatus(String.valueOf(roomNumber), help.toLowerCaseString(BookingToStatus.getName()), help.toLowerCaseString(BookingToStatus.getLastName()), BookingToStatus.getEmail(), BookingToStatus.getGender(), BookingToStatus.getCellphone(), BookingToStatus.getArrival());

            SystemHotel.StatusList.insert(newClientToStatus);

            // Borra la reserva del arbol de reservas
            SystemHotel.Bookings.deleteNodeInBST(SystemHotel.Bookings.getRoot(), Integer.parseInt(BookingToStatus.getID()));

            client = newClientToStatus;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No hay habitación disponible para esta reserva,\nintete reservar de nuevo para poder asignarle una habitación.");
        }
        return client;
    }

    /**
     * Lista las habitaciones ocupadas en una fecha específica.
     *
     * @param ArriveDate Fecha de llegada para filtrar las habitaciones
     * ocupadas.
     * @return Array con los números de las habitaciones ocupadas.
     */
    private int[] ListOfOccupiedRoomsWithStatusWithDate(String ArriveDate) {
        Validations val = new Validations();
        int[] occupiedRooms = new int[SystemHotel.StatusList.getTable().length];
        for (int i = 0; i < SystemHotel.StatusList.getTable().length; i++) {
            ClientStatus current = SystemHotel.StatusList.getTable()[i];

            if (current != null) {
                if (val.compareStrings(ArriveDate, current.getArrive())) {
                    occupiedRooms[i] = Integer.parseInt(current.getRoomNumber());
                }
            }
        }
        //Busca en el Hashtable status las habitaciones que estan ocupadas en la fecha de llegada indicada
        // devuelve un array con las habitaciones ocupadas    
        return occupiedRooms;
    }

    /**
     * Lista las habitaciones disponibles de un tipo específico.
     *
     * @param roomsType Tipo de habitación a filtrar.
     * @return Array con los números de las habitaciones del tipo especificado.
     */
    private int[] ListOfRoomsWithType(String roomsType) {
        ArrayList RoomswithType = new ArrayList();
        RoomswithType = AddWithType(SystemHotel.Rooms.getRoot(), roomsType, RoomswithType);
        Object[] temporalArray = RoomswithType.toArray();

        int[] intArray = new int[RoomswithType.size()];  // Array de enteros

        for (int i = 0; i < temporalArray.length; i++) {
            intArray[i] = (int) temporalArray[i];  // Casting de Object a int
        }
        return intArray;
    }

    /**
     * Añade al array las habitaciones del tipo especificado.
     *
     * @param pRoot Nodo raíz del árbol de habitaciones.
     * @param roomType Tipo de habitación a buscar.
     * @param RoomswithType ArrayList donde se almacenan las habitaciones
     * encontradas.
     * @return ArrayList con las habitaciones del tipo especificado.
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

    /**
     * Selecciona el número de habitación disponible.
     *
     * @param RoomswithType Array con los números de habitaciones del tipo
     * especificado.
     * @param occupiedRooms Array con los números de habitaciones ocupadas.
     * @return Número de habitación disponible.
     */
    private int SelectNumOfAvailableRoom(int[] RoomswithType, int[] occupiedRooms) {
        // Selecciona el numero de posicion de la habitacion del tipo disponible evaluando en la lista de ocupadas 
        // y la lista de las habitaciones del tipo deseado.

        int numToReturn = -1;

        boolean free = true;
        for (int i = 0; i < occupiedRooms.length; i++) {
            if (occupiedRooms[i] != 0) {
                free = false;
            }
        }
        if (free) {
            return RoomswithType[0];
        } else {
            for (int i = 0; i < RoomswithType.length; i++) {

                boolean notOccupied = true;
                for (int j = 0; j < occupiedRooms.length; j++) {
                    if (RoomswithType[i] != 0 && occupiedRooms[j] != 0) {
                        if (RoomswithType[i] == occupiedRooms[j]) {
                            notOccupied = false;
                        }
                    }
                }
                if (notOccupied) {
                    numToReturn = RoomswithType[i];
                    return numToReturn;
                }
            }
            return numToReturn;
            // Si devuelve -1 afuera nunca encontro una habitacion disponible
        }
    }

    /**
     * Realiza el proceso de check-out de un cliente del hotel.
     *
     * @param completeNameOfCustomerToSearch Nombre completo del cliente a
     * realizar el check-out.
     * @param ID ID de la reserva asociada al cliente.
     * @return True si el check-out fue exitoso, False en caso contrario.
     */
    public boolean checkOut(String completeNameOfCustomerToSearch, String ID) {
        boolean val = false;

        try {
            ClientStatus matched = SystemHotel.StatusList.search(completeNameOfCustomerToSearch);
            String LineToAppend = CreateRecordLine(ID, matched.getName(), matched.getLastName(), matched.getEmail(), matched.getGender(), matched.getArrive());

            int roomNumber = Integer.parseInt(matched.getRoomNumber());
            NodeBST currentNode = SystemHotel.Rooms.SearchNodeInBST(SystemHotel.Rooms.getRoot(), roomNumber); //Retorna el nodo a modificar
            Room toModify = (Room) currentNode.getData();

            // REVISAR QUE EL CHECKOUT AGREGA UNA POSICION DE MEMORIA
            toModify.modifyRoomRecord(LineToAppend);

            SystemHotel.Rooms.insertNewDataInNode(SystemHotel.Rooms.getRoot(), roomNumber, toModify); //Guarda el nuevo valor en el historial

            SystemHotel.StatusList.delete(completeNameOfCustomerToSearch);      //Borro el cliente de StatusList
            val = true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Cliente no encontrado.");
        }
        return val;
    }

    /**
     * Crea una línea de registro para el historial de una habitación.
     *
     * @param ID ID del cliente asociado al registro.
     * @param name Nombre del cliente.
     * @param lastName Apellido del cliente.
     * @param email Email del cliente.
     * @param genre Género del cliente.
     * @param arrive Fecha de llegada del cliente.
     * @return Línea de registro para el historial de la habitación.
     */
    private String CreateRecordLine(String ID, String name, String lastName, String email, String genre, String arrive) {
        String lineToReturn = "";
        RecordForRoom newLine = new RecordForRoom(ID, name, lastName, email, genre, arrive);

        lineToReturn = newLine.stringRoomRecord();

        return lineToReturn;
    }
}
