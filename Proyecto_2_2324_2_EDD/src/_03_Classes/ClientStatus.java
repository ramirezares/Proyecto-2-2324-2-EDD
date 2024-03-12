
package _03_Classes;

/**
 *
 * @author Daniela Zambrano
 */
public class ClientStatus {
    private String roomNumber;
    private String name;
    private String lastName;
    private String email;
    private String gender;
    private String cellphone;
    private String arrive;

    public ClientStatus(String room_number, String name, String apellido, String email, String gender, String cellphone, String arrive) {
        this.roomNumber = room_number;
        this.name = name;
        this.lastName = apellido;
        this.email = email;
        this.gender = gender;
        this.cellphone = cellphone;
        this.arrive = arrive;
    }

    public String getRoom_number() {
        return roomNumber;
    }

    public void setRoom_number(String room_number) {
        this.roomNumber = room_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApellido() {
        return lastName;
    }

    public void setApellido(String apellido) {
        this.lastName = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    
    public String getArrive() {
        return arrive;
    }

    public void setArrive(String arrive) {
        this.arrive = arrive;
    }
    
}