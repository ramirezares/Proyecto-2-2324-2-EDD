/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _04_Functions;

import _02_EDD.HashTable;
import _03_Classes.Booking;
import _03_Classes.ClientStatus;
import _03_Classes.Room;
import _03_Classes.RoomRecord;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego MS
 */
public class ReadCSV {
   private BufferedReader leer;
   private String line;
   private String readedline[] = null;
    
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
    /*
    public void putAtributesBooking(ListaSimple listaDeReservas)  {
        Booking newbooking = new Booking(readedline[0],readedline[1],readedline[2],readedline[3],readedline[4],readedline[5],readedline[6],readedline[7],readedline[8]);
        listaDeReservas.addEnd(newbooking);
        Booking ultimo = (Booking) listaDeReservas.getTail().getContent();
        ultimo.printBook();
        
    }
    */
    public void putAtributesClientStatus(HashTable tablastatus)  {
        ClientStatus newClientStatus = new ClientStatus(readedline[0],readedline[1],readedline[2],readedline[3],readedline[4],readedline[5],readedline[6]);
        tablastatus.insert(newClientStatus);
    }
    
    /*
    public void putAtributesRoom(ListaSimple listaDeHabitaciones)  {
        Room newRoom = new Room(Integer.parseInt(readedline[0]),readedline[1],Integer.parseInt(readedline[2]));
        listaDeHabitaciones.addEnd(newRoom);
        
    }
*/
/*
    public void putAtributesRoomRecord(ListaSimple listaDeHistorial)  {
        RoomRecord newRoomRecord = new RoomRecord(readedline[0],readedline[1],readedline[2],readedline[3],readedline[4],readedline[5],readedline[6]);
        listaDeHistorial.addEnd(newRoomRecord);
    }
*/
    /*
    public void readBooking(ListaSimple listaDeReservas) {
        try {
            int erasefirst = 0;
            leer = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\_08_Csvs\\Booking_hotel - reservas.csv"));
            while ((line = leer.readLine()) != null ) {
                if (erasefirst == 0) {
                    erasefirst = 1;
                } else {
                readedline = line.split(",");
                putAtributesBooking(listaDeReservas);
                }
            }
            listaDeReservas.deleteHead();
            leer.close();
            line = null;
            readedline = null;
            
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "No se encuentra un archivo CSV en la ruta especificada");
        }
    }
    */
    public void readClientStatus(HashTable tablastatus) {
        try {
            int erasefirst = 0;
            leer = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\_08_Csvs\\\\Booking_hotel - estado.csv"));
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
    /*
    public void readRoomRecords(ListaSimple listaDeHistorial) {
        try {
            int erasefirst = 0;
            leer = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\_08_Csvs\\Booking_hotel - Histórico.csv"));
            while ((line = leer.readLine()) != null ) {
                if (erasefirst == 0) {
                    erasefirst = 1;
                } else {
                readedline = line.split(",");
                putAtributesBooking(listaDeHistorial);
                }
            }
            listaDeHistorial.deleteHead();
            leer.close();
            line = null;
            readedline = null;
            
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "No se encuentra un archivo CSV en la ruta especificada");
        }
    }
    */
    /*
    public void readRooms(ListaSimple listaDeHabitaciones) {
        try {
            int erasefirst = 0;
            leer = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\_08_Csvs\\Booking_hotel - habitaciones.csv"));
            while ((line = leer.readLine()) != null ) {
                if (erasefirst == 0) {
                    erasefirst = 1;
                } else {
                readedline = line.split(",");
                putAtributesBooking(listaDeHabitaciones);
                }
            }
            listaDeHabitaciones.deleteHead();
            leer.close();
            line = null;
            readedline = null;
            
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "No se encuentra un archivo CSV en la ruta especificada");
        }
    }
    */
}
