/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _05_Validations;

/**
 *
 * @author AresR
 */
public class Validations {
    /*
    
    Funcion que valide si es un numero 
    
    funcion que valide si es cedula
    
    Investigar matches para validar que sean letras, numeros
    
    
    */
    
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

    //
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
}
