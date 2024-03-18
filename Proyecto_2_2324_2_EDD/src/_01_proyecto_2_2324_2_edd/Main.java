/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package _01_proyecto_2_2324_2_edd;

import _02_EDD.BinarySearchTree;

/**
 *
 * @author AresR
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("Hey");

        BinarySearchTree test = new BinarySearchTree();
        System.out.println(test.isEmpty());
        
        test.insertNodeInBST(test.getRoot(), 1, "Hola1");
        test.insertNodeInBST(test.getRoot(), 2, "Hola2");
        test.insertNodeInBST(test.getRoot(), 3, "Hola3");
        test.insertNodeInBST(test.getRoot(), 5, "Hola5");
        test.insertNodeInBST(test.getRoot(), 7, "Hola7");

        test.insertNodeInBST(test.getRoot(), 6, "Hola6");
        test.insertNodeInBST(test.getRoot(), 8, "Hola8");
        test.insertNodeInBST(test.getRoot(), 4, "Hola4");
        test.insertNodeInBST(test.getRoot(), -1, "Hola4");

        System.out.println(test.summarizeTree());

        test.deleteNodeInBST(test.getRoot(), 4);
        System.out.println(test.summarizeTree());

        System.out.println(test.countNumberOfNodes());

        try {
            System.out.println(test.SearchNodeInBST(test.getRoot(), 7).getData());
            System.out.println(test.SearchNodeInBST(test.getRoot(), 4).getData());
        } catch (Exception e) {
            System.out.println("El nodo nno se encuentra");
        }
        //test.             Prueben el que quieran
    }

}
