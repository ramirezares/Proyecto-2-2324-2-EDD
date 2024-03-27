package _03_Classes;

/**
 *
 * @author Daniela Zambrano
 */
public class RecordForRoom {
    private String ID;
    private String name;
    private String lastName;
    private String email;
    private String gender;
    private String arrive;
    private String room_Number;
    
    /**
     *Constructor de la clase RecordRoom
     * @param ID ID del último huésped
     * @param name nombre del último huésped 
     * @param lastName apellido del último huésped
     * @param email correo del último huésped
     * @param genre genero del último huésped 
     * @param arrive fecha de llegada  del último huésped
     * @param room_Number numero de habitación  del último huésped
     */
    public RecordForRoom(String ID, String name, String lastName, String email, String genre, String arrive, String room_Number) {
        this.ID = ID;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.gender = genre;
        this.arrive = arrive;
        this.room_Number = room_Number;
    }

    /**
     *Constructor de la clase RecordRoom
     * @param ID ID del último huésped
     * @param name nombre del último huésped 
     * @param lastName apellido del último huésped
     * @param email correo del último huésped
     * @param genre genero del último huésped 
     * @param arrive fecha de llegada  del último huésped
     */
    public RecordForRoom(String ID, String name, String lastName, String email, String genre, String arrive) {
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

    public String getRoomNumber() {
        return room_Number;
    }

    public void setRoomNumber(String room_Number) {
        this.room_Number = room_Number;
    }
   
    /**
     *Función que genera una linea (String) con todos los atributos del objeto
     * @return un string (una linea) con todos los datos del objeto
     */
    public String stringRoomRecord() {
        String stringaux;
        stringaux =  this.ID + " " + this.name + " " + this.lastName + " " + this.email + " " + this.gender + " " + this.arrive + "\n";
                
        
        return stringaux;
        
        
    }
    
    
    
    
    
}
