package _05_Validations;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.WARNING_MESSAGE;

/**
 *
 * @author Daniela Zambrano
 */
public class Validations {
    
    
    public boolean isJustLetters(String name){
        String regex="[^a-zA-Z]";
        Pattern patron =Pattern.compile(regex);
        Matcher match= patron.matcher(name);
        return !match.find();
    }
    
    public boolean isNumber(String ID){
        String regex="^\\d+$";
        Pattern patron =Pattern.compile(regex);
        Matcher match= patron.matcher(ID);
        return match.find();
    }
    
    public boolean isNameLength(String name){
        return name.length()>1;
    }
    
    public boolean isIDLength(String ID){
        return ID.length()<9;
    }
    
    
    
    public boolean isName(String name){
        if (!this.isNameLength(name)){
            JOptionPane.showMessageDialog(null, "El nombre/apellido es muy corto, es necesario tener al manos 3 letras", "Error!", WARNING_MESSAGE);
                return false;}
        if(!this.isJustLetters(name)){
            JOptionPane.showMessageDialog(null, "Solo se permiten usar caracteres alfabeticos", "Error!", WARNING_MESSAGE);
                return false;}
        
        return true;
    }
    
    public boolean isID(String ID){
        if(ID.equals("")){
                JOptionPane.showMessageDialog(null, "Debe ingresar al menos un caracter correspondiente al ID.\n Intentelo Nuevamente.", "Error!", WARNING_MESSAGE);
                return false;
        }
        
        if (!this.isIDLength(ID)){
            JOptionPane.showMessageDialog(null, "La cantidad de digitos correspondientes al ID es inválido.\n Intentelo Nuevamente.", "Error!", WARNING_MESSAGE);
                return false;}
        
        if(!this.isNumber(ID)){
            JOptionPane.showMessageDialog(null, "Solo se permiten cáracteres númericos.\n Al momento de ingresar el ID, evite cualquier simbolo, espacio o letra.", "Error!", WARNING_MESSAGE);
                return false;}
        
        return true;
    
    }
    
    public boolean isEmail(String email){
        String regex= "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";
        Pattern patron =Pattern.compile(regex);
        Matcher match= patron.matcher(email);
        return match.find();
    
    }
    
    public static void main(String[] args) {
        Validations val = new Validations(); 
        System.out.println(val.isEmail("dzambrano@ama.bomm"));

    }
    
}
