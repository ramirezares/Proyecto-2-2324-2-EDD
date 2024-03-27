package _05_Validations;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 *
 * @author Daniela Zambrano
 */
public class Validations {

    public Validations() {
    }

    /**
     *Función que valida que dos string sean iguales letra por letra
     * 
     * @param s1 String 1 a comparar
     * @param s2 String 1 a comparar
     * @return boolean, retorna verdadero si ambos string son iguales letra por letra
     */
    public boolean compareStrings(String s1, String s2) {
        // Verificar si las cadenas tienen el mismo tamaño
        if (s1.length() != s2.length()) {
            return false;
        }

        // Comparar letra por letra
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        // Si todas las letras son iguales, retornar true
        return true;
    }

    /**
     * Valida si un string esta vacio.
     *
     * @param sample_variable texto a validar
     * @return true si el string esta vacio, false en caso contrario.
     */
    public boolean StringIsEmpty(String sample_variable) {
        return sample_variable.isEmpty();
    }

    /**
     * Valida si un texto ingresado por el usuario es un numero y no una letra
     *
     * @param sample_variable texto a validar
     * @return true si el string es un numero, false en caso contrario.
     */
    public boolean InputIsNumeric(String sample_variable) {
        boolean val = false;
        if (!this.StringIsEmpty(sample_variable)) {
            for (char c : sample_variable.toCharArray()) {
                if (!Character.isDigit(c)) {
                    val = true;
                    break;
                }
            }
        }

        return val;
    }

    /**
     * Valida si el texto ingresado es un numero y, de ser asi, si numero
     * introducido esta en el rango formado por dos numeros indicados. Los
     * extremos tambien se incluyen en el intervalo.
     *
     * @param sample_variable texto a validar
     * @param max extremo superior del intervalo
     * @param min extremo inferior del intervalo
     * @return true si el string es un numero y esta en el rango indicado, false
     * en caso contrario.
     */
    public boolean InputInRange(String sample_variable, int max, int min) {
        boolean val = false;
        if (!this.StringIsEmpty(sample_variable)) {
            try {
                int number = Integer.parseInt(sample_variable);
                return number >= min && number <= max;
            } catch (NumberFormatException e) {
                return val;
            }
        }
        return val;
    }

    /**
     *Función que válida que un string solo tenga caracteres alfabéticos
     * @param name String que se válida
     * @return boolean, retorna verdadero si el string solo contiene caracteres alfabéticos
     */
    public boolean isJustLetters(String name) {
        String regex = "[^a-zA-Z]";
        Pattern patron = Pattern.compile(regex);
        Matcher match = patron.matcher(name);
        return !match.find();
    }

    /**
     *Función que válida que un string solo contenga cracteres numericos
     * 
     * @param num String a validar
     * @return boolean, retorna verdadero si solo hay caracteres numéricos en el string (sin contar espacio)
     */
    public boolean isNumber(String num) {
        String regex = "^\\d+$";
        Pattern patron = Pattern.compile(regex);
        Matcher match = patron.matcher(num);
        return match.find();
    }

    /**
     *Función que verifica que un string tenga caracteres numéricos y que ese número este entre 1-300
     * @param roomNumber string a verificar
     * @return boolean, retorna verdadero si el string es un número entre 1-300
     */
    public boolean isRoom(String roomNumber) {

        return (this.isNumber(roomNumber) && this.isRoomLength(roomNumber));
    }

    /**
     *Función que válida el largo de un string para que sea nombre
     * @param name String a validar
     * @return boolean, retorna verdadero si el string tiene más de 1 cáracter
     */
    public boolean isNameLength(String name) {
        return name.length() > 1;
    }

    /**
     *Función que válida si el largo de un string es apto para ser un ID
     * @param ID String a validar
     * @return boolean, retorna verdadero si el String tiene menos de 9 caracteres
     */
    public boolean isIDLength(String ID) {
        return ID.length() < 9;
    }

    /**
     *Función que válida si el largo de un string es apto para ser un télefono
     * @param phone String a validar
     * @return boolean, retorna verdadero si el string tiene más de 8 caracteres y menos de 16
     */
    public boolean isPhoneLength(String phone) {
        return ((phone.length() > 8) && (phone.length() < 16));
    }

    /**
     *Función que válida si el largo de un string es apto para el número de una habitacción
     * @param room String a validar
     * @return boolean, retorna verdadero si el string casteado a int es mayor a 0 y menor a 301
     */
    public boolean isRoomLength(String room) {
        int numRoom = Integer.parseInt(room);
        return ((numRoom > 0) && (numRoom < 301));
    }

    /**
     *Funcion que verifica si un string es tiene las condiciones para ser un nombre
     *El string regresara verdadero si el nombre tiene mas de dos letras y no tiene numeros
     *La diferencia con isName2 es el tipo de advertencias 
     * 
     * @param name String correspondiente a un nombre
     * @return boolean, retorna verdadero si el string cumple con las condiciones de un nombre
     */
    public boolean isName(String name) {
        if (!this.isNameLength(name)) {
            JOptionPane.showMessageDialog(null, "El nombre/apellido es muy corto, es necesario tener al menos 3 letras", "Error!", WARNING_MESSAGE);
            return false;
        }
        if (!this.isJustLetters(name)) {
            JOptionPane.showMessageDialog(null, "Solo se permiten usar caracteres alfabeticos, sin espacios", "Error!", WARNING_MESSAGE);
            return false;
        }

        return true;
    }
    
    /**
     *Funcion que verifica si un string es tiene las condiciones para ser un nombre
     *El string regresara verdadero si el nombre tiene mas de dos letras y no tiene numeros
     *La diferencia con isName2 es el tipo de advertencias 
     * 
     * @param name String correspondiente a un nombre
     * @return boolean, retorna verdadero si el string cumple con las condiciones de un nombre
     */
    public boolean isName2(String name) {
        if (!this.isNameLength(name)) {
            JOptionPane.showMessageDialog(null, "El nombre/apellido es muy corto o no se insertaron correctamente.\n Inténtelo nuevamente.", "Error!", WARNING_MESSAGE);
            return false;
        }
        if (!this.isJustLetters(name)) {
            JOptionPane.showMessageDialog(null, "Solo se permiten usar caracteres alfabeticos, sin espacios", "Error!", WARNING_MESSAGE);
            return false;
        }

        return true;
    }
    
    /**
     *Se le ingresa un string ID para verificar si cumple o no con las condiciones de un ID
     *La diferencia con isID2 es el tipo de aviso que despliega. 
     * 
     * @param ID  String correspondiente a un ID
     * @return boolean, verdadero si el string ingresado cumple con el formato de ID
     */
    public boolean isID(String ID) {
        if (ID.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar al menos un caracter correspondiente al ID.\n Inténtelo Nuevamente.", "Error!", WARNING_MESSAGE);
            return false;
        }

        if (!this.isIDLength(ID)) {
            JOptionPane.showMessageDialog(null, "La cantidad de digitos correspondientes al ID es inválido.\n Inténtelo Nuevamente.", "Error!", WARNING_MESSAGE);
            return false;
        }

        if (!this.isNumber(ID)) {
            JOptionPane.showMessageDialog(null, "Solo se permiten cáracteres númericos.\n Al momento de ingresar el ID, evite cualquier simbolo, espacio o letra.", "Error!", WARNING_MESSAGE);
            return false;
        }

        return true;

    }

    /**
     *Se le ingresa un string ID para verificar si cumple o no con las condiciones de un ID
     *La diferencia con isID es el tipo de aviso que despliega. 
     * 
     * @param ID  String correspondiente a un ID
     * @return boolean, verdadero si el string ingresado cumple con el formato de ID
     */
    public boolean isID2(String ID) {
        if (ID.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar al menos un caracter correspondiente al ID del cliente.\n Inténtelo Nuevamente.", "Error!", WARNING_MESSAGE);
            return false;
        }

        if (!this.isIDLength(ID)) {
            JOptionPane.showMessageDialog(null, "La cantidad de digitos correspondientes al ID es inválido.\n Inténtelo Nuevamente.", "Error!", WARNING_MESSAGE);
            return false;
        }

        if (!this.isNumber(ID)) {
            JOptionPane.showMessageDialog(null, "Solo se permiten cáracteres númericos.\n Al momento de ingresar el ID, evite cualquier simbolo, espacio o letra.", "Error!", WARNING_MESSAGE);
            return false;
        }

        return true;

    }

    /**
     *
     * @param Phone String correspondiente a un número telefónico
     * @return boolean, verdadero si el string ingresado tiene el formato para un número de teléfono, falso de lo contrario
     */
    public boolean isPhone(String Phone) {
        if (Phone.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe ingresar al menos un caracter correspondiente al ID.\n Inténtelo Nuevamente.", "Error!", WARNING_MESSAGE);
            return false;
        }

        if (!this.isPhoneLength(Phone)) {
            JOptionPane.showMessageDialog(null, "La cantidad de digitos correspondientes al número de teléfono es inválido.\n Inténtelo Nuevamente.", "Error!", WARNING_MESSAGE);
            return false;
        }

        if (!this.isNumber(Phone)) {
            JOptionPane.showMessageDialog(null, "Solo se permiten cáracteres númericos.\n Al momento de ingresar el ID, evite cualquier simbolo, espacio o letra.", "Error!", WARNING_MESSAGE);
            return false;
        }

        return true;

    }

    /**
     *
     * @param email String correspondiente a un correo.
     * @return boolean, verdadero si el string ingresado tiene el formato indicado para ser correo.
     */
    public boolean isEmail(String email) {
        String regex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Pattern patron = Pattern.compile(regex);
        Matcher match = patron.matcher(email);
        return match.find();

    }
}
