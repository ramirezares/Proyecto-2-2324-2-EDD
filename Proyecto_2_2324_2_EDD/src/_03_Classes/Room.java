
package _03_Classes;

/**
 *
 * @author Daniela Zambrano
 */
public class Room {
    private int roomNumber;
    private String  roomType;
    private int roomFloor;
    private String roomRecord;
    //atributo historial en la clase room va a ser un string

    public Room(int roomNumber, String roomType, int roomFloor, String history) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomFloor = roomFloor;
        this.roomRecord = history;          // Ver si borramos este constructor
    }

    public Room(int roomNumber, String roomType, int roomFloor) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomFloor = roomFloor;
        this.roomRecord = "";
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
    
    public String getRoomRecord() {
        return roomRecord;
    }

    public void setRoomRecord(String roomRecord) {
        this.roomRecord = roomRecord;
    }

    public void modifyRoomRecord(String lineToAppendToRecord){
        StringBuilder newRoomRecord = new StringBuilder();
        
        newRoomRecord.append(this.roomRecord).append("\n");
        newRoomRecord.append(lineToAppendToRecord);
        
        this.setRoomRecord(newRoomRecord.toString());
    }
    
    public String getSummaryForRecord(){
        StringBuilder stringToReturn = new StringBuilder();
        
        stringToReturn.append("Número de Habitación: ").append(this.roomNumber).append(". ").append("Tipo de Habitación: ").append(this.roomType).append(". ").append("Piso: ").append(this.roomFloor).append(".");
        stringToReturn.append("\n");
        stringToReturn.append(this.roomRecord);
        
        return stringToReturn.toString();
    }
}
