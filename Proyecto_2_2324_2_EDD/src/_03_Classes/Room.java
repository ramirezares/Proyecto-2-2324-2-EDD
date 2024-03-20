
package _03_Classes;

/**
 *
 * @author Daniela Zambrano
 */
public class Room {
    private int roomNumber;
    private String  roomType;
    private int roomFloor;
    private String record;
    //atributo historial en la clase room va a ser un string

    public Room(int roomNumber, String roomType, int roomFloor, String history) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomFloor = roomFloor;
        this.record = history;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public Room(int roomNumber, String roomType, int roomFloor) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomFloor = roomFloor;
        this.record = null;
    }
   

       
    
    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int room_Number) {
        this.roomNumber = room_Number;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String room_Type) {
        this.roomType = room_Type;
    }

    public int getRoomFloor() {
        return roomFloor;
    }

    public void setRoomFloor(int room_Floor) {
        this.roomFloor = room_Floor;
    }
    
    
    
}
