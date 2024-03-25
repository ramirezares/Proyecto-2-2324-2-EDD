
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
