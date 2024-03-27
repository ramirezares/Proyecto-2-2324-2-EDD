
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
    
    /**
     *Constructor de la clase room
     * @param roomNumber int con el número de la habitación
     * @param roomType string con el tipo de habitación
     * @param roomFloor int con el número del piso de la habitación
     * @param history String con todos los huéspedes que han estado en esa habitación
     */
    public Room(int roomNumber, String roomType, int roomFloor, String history) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomFloor = roomFloor;
        this.roomRecord = history;          // Ver si borramos este constructor
    }

    /**
     *Constructor  de la clase room
     * @param roomNumber int con el número de la habitación
     * @param roomType string con el tipo de habitación
     * @param roomFloor int con el número del piso de la habitación
     */
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

    /**
     *Función que modifica el historial de la habitación agregandole una linea de información del último huesped
     * @param lineToAppendToRecord linea que se agrega al historial (información del cliente)
     */
    public void modifyRoomRecord(String lineToAppendToRecord){
        StringBuilder newRoomRecord = new StringBuilder();
        
        newRoomRecord.append(this.roomRecord).append("\n");
        newRoomRecord.append(lineToAppendToRecord);
        
        this.setRoomRecord(newRoomRecord.toString());
    }
    
    /**
     *Función que retorna un string con un resumen del historial de la habitación de forma arreglada
     * @return String con un resumen del historial de la habitación
     */
    public String getSummaryForRecord(){
        StringBuilder stringToReturn = new StringBuilder();
        
        stringToReturn.append("Número de Habitación: ").append(this.roomNumber).append(". ").append("Tipo de Habitación: ").append(this.roomType).append(". ").append("Piso: ").append(this.roomFloor).append(".");
        stringToReturn.append("\n");
        stringToReturn.append(this.roomRecord);
        
        return stringToReturn.toString();
    }
}
