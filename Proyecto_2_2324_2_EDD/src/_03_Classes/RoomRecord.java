package _03_Classes;

/**
 *
 * @author Daniela Zambrano
 */
public class RoomRecord {
    private String ID;
    private String name;
    private String lastName;
    private String email;
    private String gender;
    private String arrive;
    private String room_Number;
    
    //falta una funcion que genero una linea de string sin el numero de la habitacion

    public RoomRecord(String ID, String name, String lastName, String email, String genre, String arrive) {
        this.ID = ID;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.gender = genre;
        this.arrive = arrive;
    }

    
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGenre() {
        return gender;
    }

    public void setGenre(String genre) {
        this.gender = genre;
    }

    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }

    
    public String stringRoomRecord() {
        String stringaux;
        stringaux =  this.ID + " " + this.name + " " + this.lastName + " " + this.email + " " + this.gender + " " + this.arrive+".";
        
        return stringaux;
    }
}
