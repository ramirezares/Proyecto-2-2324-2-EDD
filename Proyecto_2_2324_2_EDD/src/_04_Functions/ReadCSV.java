/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _04_Functions;

import _02_EDD.BinarySearchTree;
import _02_EDD.HashTable;
import _02_EDD.ListaSimple;
import _03_Classes.Booking;
import _03_Classes.ClientStatus;
import _03_Classes.Room;
import _03_Classes.RoomRecord;
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
    * Funcion que toma un string con la direccion de un archivo .csv y lo lee en la terminal
    * @param ruta String con la ruta del archivop
    */
    public void printCSV(String ruta) {
        try {
            leer = new BufferedReader(new FileReader(ruta));
            while ((line = leer.readLine()) != null ) {
                readedline = line.split(",");
                printline();
                System.out.println();
                System.out.println();
            }
            leer.close();
            line = null;
            readedline = null;
            
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "No se encuentra un archivo CSV en la ruta especificada");
        }
    }
    
    /**
    * Lee las lineas de un arreglo
    */
    public void printline() {
        for (int i = 0; i < readedline.length; i++) {
           System.out.print(readedline[i] + "   |   ");  
        }
    } 
    
    public void putAtributesBooking(BinarySearchTree Reservas)  {
         String newID = readedline[0].replaceAll("[^\\w+]", "");
         System.out.println(newID);
        Booking newbooking = new Booking(newID,readedline[1],readedline[2],readedline[3],readedline[4],readedline[5],readedline[6],readedline[7],readedline[8]);
        Reservas.insertNodeInBST(Reservas.getRoot(), Integer.parseInt(newID), newbooking);
        
        
    }
    
    public void putAtributesClientStatus(HashTable tablastatus)  {
        if (readedline[0].equals("")) {
            
        } else {
        ClientStatus newClientStatus = new ClientStatus(readedline[0],readedline[1].toLowerCase(),readedline[2].toLowerCase(),readedline[3],readedline[4],readedline[5],readedline[6]);
        tablastatus.insert(newClientStatus);
        }
    }
    
    
    public void createArrayRooms(int arrayNum)  {
        Room newRoom = new Room(Integer.parseInt(readedline[0]),readedline[1],Integer.parseInt(readedline[2]));
        roomArray.add(newRoom);
        
    }
    public void putRoomInTree(BinarySearchTree Habitaciones,ListaSimple HabitacionesNoHistorial,ListaSimple HabitacionesHistorial)  {
        for (int i = 0; i < HabitacionesNoHistorial.getSize(); i++) {
            Room HabitacionAgregada = (Room) HabitacionesNoHistorial.getContentByIndex(i);
            Habitaciones.insertNodeInBST(Habitaciones.getRoot(), HabitacionAgregada.getRoomNumber(), HabitacionAgregada);
            
        }
        for (int i = 0; i < HabitacionesHistorial.getSize(); i++) {
            Room HabitacionAgregada = (Room) HabitacionesHistorial.getContentByIndex(i);
            Habitaciones.insertNodeInBST(Habitaciones.getRoot(), HabitacionAgregada.getRoomNumber(), HabitacionAgregada);
            
        }
    }
/*
    public void putAtributesRoomRecord(ListaSimple listaDeHistorial)  {
        RoomRecord newRoomRecord = new RoomRecord(readedline[0],readedline[1],readedline[2],readedline[3],readedline[4],readedline[5],readedline[6]);
        listaDeHistorial.addEnd(newRoomRecord);
    }
*/
    
    public void readBooking(BinarySearchTree Reservas) {
        try {
            int erasefirst = 0;
            leer = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\_08_CSV\\Booking_hotel - reservas.csv"));
            while ((line = leer.readLine()) != null ) {
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
            
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "No se encuentra un archivo CSV en la ruta especificada");
        }
    }
    
    public void readClientStatus(HashTable tablastatus) {
        try {
            int erasefirst = 0;
            leer = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\_08_CSV\\Booking_hotel - estado.csv"));
            while ((line = leer.readLine()) != null ) {
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
            
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "No se encuentra un archivo CSV en la ruta especificada");
        }
    }
        public void readRoomRecordsForRooms(ArrayList ListaHabitaciones,BinarySearchTree HabitacionesCompletas) {
        try {
            ListaSimple HabitacionesHistorial = new ListaSimple();
            ListaSimple HabitacionesNoHistorial = new ListaSimple();
            int erasefirst = 0;
            leer = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\_08_CSV\\Booking_hotel - Histórico.csv"));
            while ((line = leer.readLine()) != null ) {
                if (erasefirst == 0) {
                    erasefirst = 1;
                } else {
                readedline = line.split(",");
                RoomRecord historial = new RoomRecord(readedline[0],readedline[1],readedline[2],readedline[3],readedline[4],readedline[5]);
                
                    for (int i = 0; i < ListaHabitaciones.size(); i++) {
                        Room Habitaciontemporal = (Room) ListaHabitaciones.get(i);
                        if (Integer.parseInt(readedline[6]) == Habitaciontemporal.getRoomNumber()) {
                            if (HabitacionesHistorial.isInList(Habitaciontemporal)) {
                            Room habitacionTemporalHistorial =  (Room) HabitacionesHistorial.getContentByIndex(HabitacionesHistorial.getIndex(Habitaciontemporal));
                            habitacionTemporalHistorial.setRecord(historial.stringRoomRecord());
                                
                            } else {
                            Habitaciontemporal.setRecord(historial.stringRoomRecord());
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
            
            
            putRoomInTree(HabitacionesCompletas,HabitacionesNoHistorial,HabitacionesHistorial);
                
            
            
            
            leer.close();
            line = null;
            readedline = null;
            
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "No se encuentra un archivo CSV en la ruta especificada");
        }
    }
    /*
    public void readRoomRecords(ListaSimple listaDeHistorial) {
        try {
            int erasefirst = 0;
            leer = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\src\_08_CSV\Booking_hotel - Histórico.csv"));
            while ((line = leer.readLine()) != null ) {
                if (erasefirst == 0) {
                    erasefirst = 1;
                } else {
                readedline = line.split(",");
                putAtributesBooking(listaDeHistorial);
                }
            }
            leer.close();
            line = null;
            readedline = null;
            
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "No se encuentra un archivo CSV en la ruta especificada");
        }
    }
    */
    
    public void readRooms(BinarySearchTree Habitaciones) {
        try {
            int erasefirst = 0;
            int numArray = 0;
            leer = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\_08_CSV\\Booking_hotel - habitaciones.csv"));
            while ((line = leer.readLine()) != null ) {
                if (erasefirst == 0) {
                    erasefirst = 1;
                } else {
                readedline = line.split(",");
                createArrayRooms(numArray);
                numArray++;
                
                }
            }
           readRoomRecordsForRooms(roomArray,Habitaciones);
            leer.close();
            line = null;
            readedline = null;
            
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "No se encuentra un archivo CSV en la ruta especificada");
        }
    }
    
    
    //Buscar en history el ultimo elemento que es la habitacion.
    //Revisar que elemento este en el arbol binario DE HABITACIONEs
    //Si esta agregar el historial a la habitacion
    //Si no, hay que agregar la habitacion al árbol binario
}
