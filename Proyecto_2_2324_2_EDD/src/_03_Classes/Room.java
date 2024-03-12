
package _03_Classes;

/**
 *
 * @author Daniela Zambrano
 */
public class Room {
    private int roomNumber;
    private String  roomType;
    private int roomFloor;
    private String history;
    //atributo historial en la clase room va a ser un string

    public Room(int roomNumber, String roomType, int roomFloor, String history) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomFloor = roomFloor;
        this.history = history;
    }

   

       
    
    public int getRoom_Number() {
        return roomNumber;
    }

    public void setRoom_Number(int room_Number) {
        this.roomNumber = room_Number;
    }

    public String getRoom_Type() {
        return roomType;
    }

    public void setRoom_Type(String room_Type) {
        this.roomType = room_Type;
    }

    public int getRoom_Floor() {
        return roomFloor;
    }

    public void setRoom_Floor(int room_Floor) {
        this.roomFloor = room_Floor;
    }
    
    
    
}
