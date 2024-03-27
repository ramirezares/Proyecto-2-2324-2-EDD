package _04_Functions;

/**
 *
 * @author Danna Star
 */
public class Helper {

    public Helper() {
    }

    /**
     *Función que agarra dos string (un nombre y un apellido) y los une sin espacios
     * @param name string 1
     * @param surname string 2
     * @return String1 + String2
     */
    public String NameSurname(String name, String surname) {
        return name + surname;
    }

    /**
     *Función que coloca en minúsculas todas letras del string ingresado
     * @param input String 
     * @return el string con todas las letras en minúsculas
     */
    public static String toLowerCaseString(String input) {
        return input.toLowerCase();
    }
}
