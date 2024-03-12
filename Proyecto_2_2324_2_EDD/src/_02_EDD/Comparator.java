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
    
    public boolean isEqual(int numNodeOfCurrentOperation);
    
    public boolean isLessThan(int numNodeOfCurrentOperation);
    
    public boolean isGreaterThan(int numNodeOfCurrentOperation);
}
