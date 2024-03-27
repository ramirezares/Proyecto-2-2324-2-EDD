package _04_Functions;

import _02_EDD.BinarySearchTree;
import _02_EDD.HashTable;
import _02_EDD.SimpleList;
import _03_Classes.Booking;
import _03_Classes.ClientStatus;
import _03_Classes.RecordForRoom;
import _03_Classes.Room;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego MS
 */
public class ReadCSV {

    private BufferedReader leer;
    private String line;
    private String readedline[] = null;
    private ArrayList<Room> roomArray;

    public ReadCSV() {
        this.roomArray = new ArrayList<Room>();
    }

    /**
     * Funcion que toma un string con la direccion de un archivo .csv y lo lee
     * en la terminal
     *
     * @param ruta String con la ruta del archivop
     */
    public void printCSV(String ruta) {
        try {
            leer = new BufferedReader(new FileReader(ruta));
            while ((line = leer.readLine()) != null) {
                readedline = line.split(",");
                printline();
                System.out.println();
                System.out.println();
            }
            leer.close();
            line = null;
            readedline = null;

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se encuentra un archivo CSV en la ruta especificada");

        }
    }

    /**
     * Lee las lineas de un arreglo
     */
    public void printline() {
        for (String readedline1 : readedline) {
            System.out.print(readedline1 + "   |   ");
        }
    }

    /**
     *Función que inserta una reserva dentro del arbol binario de busquede indicado (inserta un objeto booking en BST de reservas)
     * @param Reservas Arbol binario de busqueda 
     */
    public void putAtributesBooking(BinarySearchTree Reservas) {
        String newID = readedline[0].replaceAll("[^\\w+]", "");
        Booking newbooking = new Booking(newID, readedline[1], readedline[2], readedline[3], readedline[4], readedline[5], readedline[6], readedline[7], readedline[8]);
        Reservas.insertNodeInBST(Reservas.getRoot(), Integer.parseInt(newID), newbooking);

    }

    /**
     *Función que inserta un ClientStatus dentro del hashtable indicado
     * @param tablastatus Hashtable
     */
    public void putAtributesClientStatus(HashTable tablastatus) {
        if (readedline[0].equals("")) {

        } else {
            ClientStatus newClientStatus = new ClientStatus(readedline[0], readedline[1].toLowerCase(), readedline[2].toLowerCase(), readedline[3], readedline[4], readedline[5], readedline[6]);
            tablastatus.insert(newClientStatus);
        }
    }

    /**
     *Función que crea y agrega un Room a un roomArray
     */
    public void createArrayRooms() {
        Room newRoom = new Room(Integer.parseInt(readedline[0]), readedline[1], Integer.parseInt(readedline[2]));
        roomArray.add(newRoom);

    }

    /**
     *Función que agrega una habitacion al Arbol Binario de Busqueda de habitaciones
     * @param Habitaciones Arbol Binario de Busqueda que tiene almacenado las habitaciones
     * @param HabitacionesNoHistorial Lista enlazada simple que contiene las habitaciones que no estan en la base de datos del historial
     * @param HabitacionesHistorial Lista enlazada simple que contiene las habitaciones que estan en la base de datos del historial
     */
    public void putRoomInTree(BinarySearchTree Habitaciones, SimpleList HabitacionesNoHistorial, SimpleList HabitacionesHistorial) {
        for (int i = 0; i < HabitacionesNoHistorial.getSize(); i++) {
            Room HabitacionAgregada = (Room) HabitacionesNoHistorial.getContentByIndex(i);
            Habitaciones.insertNodeInBST(Habitaciones.getRoot(), HabitacionAgregada.getRoomNumber(), HabitacionAgregada);

        }
        for (int i = 0; i < HabitacionesHistorial.getSize(); i++) {
            Room HabitacionAgregada = (Room) HabitacionesHistorial.getContentByIndex(i);
            Habitaciones.insertNodeInBST(Habitaciones.getRoot(), HabitacionAgregada.getRoomNumber(), HabitacionAgregada);

        }
    }

    /**
     *Función que lee el archivo de Reservas.CSV y llena un Arbol Binario de Busqueda con los objetos booking
     * @param Reservas Arbol Binario de Busqueda que contiene reservas (bookings)
     */
    public void readBooking(BinarySearchTree Reservas) {
        try {
            int erasefirst = 0;
            leer = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\_08_CSV\\Booking_hotel - reservas.csv"));
            while ((line = leer.readLine()) != null) {
                if (erasefirst == 0) {
                    erasefirst = 1;
                } else {
                    readedline = line.split(",");
                    putAtributesBooking(Reservas);
                }
            }
            leer.close();
            line = null;
            readedline = null;

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se encuentra un archivo CSV en la ruta especificada");
            Reservas = null;
        }
    }

    /**
     *Función que lee el archivo Estado.CVS y agrega los ClientStatus al hashtable dado por parametro
     * @param tablastatus hashtable 
     */
    public void readClientStatus(HashTable tablastatus) {
        try {
            int erasefirst = 0;
            leer = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\_08_CSV\\Booking_hotel - estado.csv"));
            while ((line = leer.readLine()) != null) {
                if (erasefirst == 0) {
                    erasefirst = 1;
                } else {
                    readedline = line.split(",");
                    putAtributesClientStatus(tablastatus);
                    erasefirst++;
                }

            }
            leer.close();
            line = null;
            readedline = null;

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se encuentra un archivo CSV en la ruta especificada");
            tablastatus = null;
        }
    }

    /**
     *Función que lee el archivo Historial.CVS y agrega el historial a cada habtación
     * @param ListaHabitaciones ArrayList con objetos Room 
     * @param HabitacionesCompletas Arbol Binario de Busqueda 
     */
    public void readRoomRecordsForRooms(ArrayList ListaHabitaciones, BinarySearchTree HabitacionesCompletas) {
        try {
            SimpleList HabitacionesHistorial = new SimpleList();
            SimpleList HabitacionesNoHistorial = new SimpleList();
            int erasefirst = 0;
            leer = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\_08_CSV\\Booking_hotel - Histórico.csv"));
            while ((line = leer.readLine()) != null) {
                if (erasefirst == 0) {
                    erasefirst = 1;
                } else {
                    readedline = line.split(",");
                    RecordForRoom historial = new RecordForRoom(readedline[0], readedline[1], readedline[2], readedline[3], readedline[4], readedline[5]);

                    for (int i = 0; i < ListaHabitaciones.size(); i++) {
                        Room Habitaciontemporal = (Room) ListaHabitaciones.get(i);
                        if (Integer.parseInt(readedline[6]) == Habitaciontemporal.getRoomNumber()) {
                            if (HabitacionesHistorial.isInList(Habitaciontemporal)) {
                                Room habitacionTemporalHistorial = (Room) HabitacionesHistorial.getContentByIndex(HabitacionesHistorial.getIndex(Habitaciontemporal));
                                habitacionTemporalHistorial.modifyRoomRecord(historial.stringRoomRecord());

                            } else {
                                Habitaciontemporal.modifyRoomRecord(historial.stringRoomRecord());
                                HabitacionesHistorial.addEnd(Habitaciontemporal);
                            }
                        }

                    }
                }
            }

            for (int i = 0; i < ListaHabitaciones.size(); i++) {
                Room Habitaciontemporal2 = (Room) ListaHabitaciones.get(i);
                if (HabitacionesHistorial.isInList(Habitaciontemporal2)) {

                } else {
                    HabitacionesNoHistorial.addEnd(Habitaciontemporal2);
                }

            }

            putRoomInTree(HabitacionesCompletas, HabitacionesNoHistorial, HabitacionesHistorial);

            leer.close();
            line = null;
            readedline = null;

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se encuentra un archivo CSV en la ruta especificada");
        }
    }

    /**
     *Función que lee el archivo de Habitaciones.CSV y llena un Arbol Binario de Busqueda con los objetos Room
     * @param Habitaciones Arbol Binario de Busqueda
     */
    public void readRooms(BinarySearchTree Habitaciones) {
        try {
            int erasefirst = 0;
            int numArray = 0;
            leer = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\_08_CSV\\Booking_hotel - habitaciones.csv"));
            while ((line = leer.readLine()) != null) {
                if (erasefirst == 0) {
                    erasefirst = 1;
                } else {
                    readedline = line.split(",");
                    createArrayRooms();
                    numArray++;

                }
            }
            readRoomRecordsForRooms(roomArray, Habitaciones);
            leer.close();
            line = null;
            readedline = null;

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se encuentra un archivo CSV en la ruta especificada");
            Habitaciones = null;

        }
    }

}
