/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _02_EDD;

/**
 *
 * @author AresR
 */
public class DoubleNode {

    private Object data;
    private DoubleNode pNxt;
    private DoubleNode pPrev;

    /**
     *
     * @param data
     */
    public DoubleNode(Object data) {
        this.data = data;
        this.pNxt = this.pPrev = null;
    }

    /**
     *
     * @param data
     * @param npNxt
     * @param npPrev
     */
    public DoubleNode(Object data, DoubleNode npNxt, DoubleNode npPrev) {
        this.data = data;
        this.pNxt = npNxt;
        this.pPrev = npPrev;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public DoubleNode getpNxt() {
        return pNxt;
    }

    public void setpNxt(DoubleNode pNxt) {
        this.pNxt = pNxt;
    }

    public DoubleNode getpPrev() {
        return pPrev;
    }

    public void setpPrev(DoubleNode pPrev) {
        this.pPrev = pPrev;
    }

    /**
     *
     * @param data
     * @return
     */
    @Override
    public boolean equals(Object data) {
        boolean val = false; // Hacer

        if (this.data.equals(data)) {
            val = true;
        }

        return val;
    }

}
