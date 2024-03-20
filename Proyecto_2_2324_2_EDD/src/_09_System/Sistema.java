/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _09_System;

import _02_EDD.BinarySearchTree;
import _02_EDD.HashTable;
import _04_Functions.ReadCSV;

/**
 *
 * @author Diego M
 */
public class Sistema {
    
    private ReadCSV initialize;
    private HashTable status;
    private BinarySearchTree books;
    private BinarySearchTree rooms;

    public Sistema() {
        this.status = new HashTable();
        this.initialize = new ReadCSV();
        this.rooms = new BinarySearchTree();
        this.books = new BinarySearchTree();
        
        initialize.readBooking(books);
        initialize.readClientStatus(status);
        initialize.readRooms(rooms);
    }

    public ReadCSV getInitialize() {
        return initialize;
    }

    public void setInitialize(ReadCSV initialize) {
        this.initialize = initialize;
    }

    public HashTable getStatus() {
        return status;
    }

    public void setStatus(HashTable status) {
        this.status = status;
    }

    public BinarySearchTree getBooks() {
        return books;
    }

    public void setBooks(BinarySearchTree books) {
        this.books = books;
    }

    public BinarySearchTree getRooms() {
        return rooms;
    }

    public void setRooms(BinarySearchTree rooms) {
        this.rooms = rooms;
    }

    
    
}
