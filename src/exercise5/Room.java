package exercise5;

/**
 * Class Room
 * Task 1: Create a class Room with the following private data members: String building, int number
 * @author Austin Uetz
 */
public class Room {
    private String building;
    private Integer number;
    
    public Room(String building, Integer number) {
        this.building = building;
        this.number = number;
    }
    
    public String getBuilding() {
        return building;
    }
    
    public int getNumber() {
        return number;
    }
    
    public String toString() {
        return String.format("%s %s", building, number);
    }
    
}
