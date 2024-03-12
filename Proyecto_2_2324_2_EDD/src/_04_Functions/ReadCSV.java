/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _04_Functions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Diego M
 */
public class ReadCSV {
   private BufferedReader leer;
   private String line;
   private String readedline[] = null;
    
    /**
    * Funcion que toma un string con la direccion de un archivo .csv y lo lee en la terminal
    * @param ruta String con la ruta del archivo
    */
    public void ReadCSV(String ruta) {
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
}
