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

    /**
     *Constructor de la clase ClientStatus
     * @param room_number número de la habitación del huésped
     * @param name nombre del huésped
     * @param apellido apellido del huésped
     * @param email correo del huésped
     * @param gender género del huésped 
     * @param cellphone teléfono del huésped
     * @param arrive fecha de llegada del huésped
     */
    public ClientStatus(String room_number, String name, String apellido, String email, String gender, String cellphone, String arrive) {
        this.roomNumber = room_number;
        this.name = name;
        this.lastName = apellido;
        this.email = email;
        this.gender = gender;
        this.cellphone = cellphone;
        this.arrive = arrive;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String room_number) {
        this.roomNumber = room_number;
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

    public void setLastName(String apellido) {
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

    public String getFullName() {
        String fullName;
        fullName = this.name + this.lastName;
        return fullName;

    }

    /**
     *Función que genera un resumen de la información (todos los atributos) de la clientstatus
     * @return String con toda la información de la clientstatus
     */
    public String getClientSummary() {
        StringBuilder stringToReturn = new StringBuilder();

        stringToReturn.append("Nombre: ").append(this.name).append(" ").append(this.lastName).append(".\n");
        stringToReturn.append("Número de Habitación: ").append(this.roomNumber).append(".\n");
        stringToReturn.append("Email: ").append(this.email).append("\n").append("Género: ").append(this.gender).append(".\n");
        stringToReturn.append("Número de Télefono: ").append(this.cellphone).append(".\n").append("Llegada: ").append(this.arrive).append(".\n");

        return stringToReturn.toString();
    }
}
