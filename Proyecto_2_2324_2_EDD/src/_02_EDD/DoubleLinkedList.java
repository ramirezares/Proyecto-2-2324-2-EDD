/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _02_EDD;

/**
 *
 * @author AresR
 */
public class DoubleLinkedList {

    DoubleNode pFirst, pLast;
    int size;

    public void DoubleLinkedList() {
        this.pFirst = this.pLast = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        boolean val = false;
        if (this.size == 0) {
            val = true;
        }
        return val;
    }

    public void insertHead(Object Data) {
        DoubleNode nDoubleNode = new DoubleNode(Data);
        if (size == 0) {
            pFirst = pLast = nDoubleNode;
        } else {
            nDoubleNode.setpNxt(pFirst);
            pFirst.setpPrev(nDoubleNode);
            pFirst = nDoubleNode;
        }
        size += 1;
    }

    public void insertLast(Object Data) {
        DoubleNode nDoubleNode = new DoubleNode(Data);
        if (size == 0) {
            pFirst = pLast = nDoubleNode;
        } else {
            nDoubleNode.setpPrev(pLast);
            pLast.setpNxt(nDoubleNode);
            pLast = nDoubleNode;
        }
        size += 1;
    }

    public DoubleNode locateData(Object Data) {
        DoubleNode DoubleNodeSearched = null;

        for (DoubleNode pDoubleNode = pFirst; pDoubleNode != null; pDoubleNode = pDoubleNode.getpNxt()) {
            if (pDoubleNode.equals(Data)) {     //Sobrescribir equals para las clases 
                DoubleNodeSearched = pDoubleNode;
            }
        }
        return DoubleNodeSearched;
    }
    
    
    //destroyer()
    
    public boolean deleteNodeWithValue(Object data){
        boolean val = false;
        
        for (DoubleNode pDoubleNode=pFirst; pDoubleNode!=null; pDoubleNode=pDoubleNode.getpNxt()) {
            if(pDoubleNode.equals(data)){
                if (pDoubleNode==pFirst) {
                    pFirst=pDoubleNode.getpNxt();
                    pFirst.setpNxt(null);
                } else if (pDoubleNode==pLast) {
                    pLast=pDoubleNode.getpPrev();
                    pLast.setpNxt(null);
                }else{
                    pDoubleNode.getpPrev().setpNxt(pDoubleNode.getpNxt());
                    pDoubleNode.getpNxt().setpNxt(pDoubleNode.getpPrev());
                    
                } 
                size -=1;
            } 
        }
        
        return val; 
    }
    
}
