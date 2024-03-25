/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _01_proyecto_2_2324_2_edd;

import _02_EDD.BinarySearchTree;
import _02_EDD.HashTable;
import _02_EDD.ListaSimple;
import _04_Functions.ReadCSV;

/**
 *
 * @author AresR
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            System.out.println("hoola");
            ReadCSV data = new ReadCSV();
            BinarySearchTree Habitaciones = new BinarySearchTree();
            
            ListaSimple lista = new ListaSimple();
            data.readRooms(Habitaciones);
            
    }
}