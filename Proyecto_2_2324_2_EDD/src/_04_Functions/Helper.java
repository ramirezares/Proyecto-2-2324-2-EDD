
package _04_Functions;

/**
 *
 * @author Danna Star
 */
public class Helper {

    public Helper() {
    }
    
    
    
    public String NameSurname(String name,String surname){
    return name+surname;
    }
    
    public static void main(String[] args) {
        Helper val = new Helper(); 
        System.out.println(val.NameSurname("Daniela", "Zambrano"));

    }
    
}
