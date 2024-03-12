
package _03_Classes;


/**
 *
 * @author Daniela
 */
public class Booking {
    private Client client;
    private String room_Type;
    private String arrival;
    private String departure;

    public Booking(Client client, String room_Type, String arrival, String departure) {
        this.client = client;
        this.room_Type = room_Type;
        this.arrival = arrival;
        this.departure = departure;
    }

    
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getRoom_Type() {
        return room_Type;
    }

    public void setRoom_Type(String room_Type) {
        this.room_Type = room_Type;
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
    
    
    public String getID(){
        return this.client.getID();
    
    }
    
}
