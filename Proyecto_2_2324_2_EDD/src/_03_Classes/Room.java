
package _03_Classes;

/**
 *
 * @author Daniela Zambrano
 */
public class Room {
    private int room_Number;
    private String  room_Type;
    private int room_Floor;

    public Room(int room_Number, String room_Type, int room_Floor) {
        this.room_Number = room_Number;
        this.room_Type = room_Type;
        this.room_Floor = room_Floor;
    }

       
    
    public int getRoom_Number() {
        return room_Number;
    }

    public void setRoom_Number(int room_Number) {
        this.room_Number = room_Number;
    }

    public String getRoom_Type() {
        return room_Type;
    }

    public void setRoom_Type(String room_Type) {
        this.room_Type = room_Type;
    }

    public int getRoom_Floor() {
        return room_Floor;
    }

    public void setRoom_Floor(int room_Floor) {
        this.room_Floor = room_Floor;
    }
    
    
    
}
