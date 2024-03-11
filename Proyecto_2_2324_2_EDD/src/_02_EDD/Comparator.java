/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package _02_EDD;

/**
 *
 * @author AresR
 * @param <E>
 */
public interface Comparator<E> {
    
    public boolean isEqual(NodeBST NodeOfCurrentOperation);
    
    public boolean isLessThan(NodeBST NodeOfCurrentOperation);
    
    public boolean isGreaterThan(NodeBST NodeOfCurrentOperation);
}
