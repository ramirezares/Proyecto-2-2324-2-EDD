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

    public RoomRecord(String ID, String name, String lastName, String email, String genre, String arrive, String room_Number) {
        this.ID = ID;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.gender = genre;
        this.arrive = arrive;
        this.room_Number = room_Number;
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

    public String getRoom_Number() {
        return room_Number;
    }

    public void setRoom_Number(String room_Number) {
        this.room_Number = room_Number;
    }
   
    
    
    
    
    
    
}