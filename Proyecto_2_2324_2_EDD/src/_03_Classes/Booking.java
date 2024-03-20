package _03_Classes;

/**
 *
 * @author Daniela
 */
public class Booking {

    private String ID;
    private String name;
    private String lastName;
    private String email;
    private String gender;
    private String roomType;
    private String cellphone;
    private String arrival;
    private String departure;

    public Booking(String ID, String name, String lastName, String email, String gender, String roomType, String cellphone, String arrival, String departure) {
        this.ID = ID;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.roomType = roomType;
        this.cellphone = cellphone;
        this.arrival = arrival;
        this.departure = departure;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public void printBook() {
        System.out.println(this.ID);
        System.out.println(this.name);
        System.out.println(this.lastName);
        System.out.println(this.email);
        System.out.println(this.gender);
        System.out.println(this.roomType);
        System.out.println(this.cellphone);
        System.out.println(this.arrival);
        System.out.println(this.departure);
        System.out.println("");
    }

    public String getSummaryOfBooking() {
        StringBuilder stringToReturn = new StringBuilder();
        
        stringToReturn.append(this.ID).append(". ").append(this.name).append(". ").append(this.lastName).append(".").append("\n");
        stringToReturn.append(this.gender).append(". ").append(this.departure).append("\n");
        stringToReturn.append(this.email).append(" ").append(this.cellphone).append("\n");
        stringToReturn.append(this.roomType).append(" ").append(this.arrival).append("\n");
        
        return stringToReturn.toString();
    }

}
