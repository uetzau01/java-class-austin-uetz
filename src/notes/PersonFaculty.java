package notes;

/**
 *
 * @author uetzau01
 */
public class PersonFaculty extends Person {
    private String officeBuilding;
    private int officeRoom;

    public PersonFaculty(String officeBuilding, int officeRoom) {
        this.officeBuilding = officeBuilding;
        this.officeRoom = officeRoom;
    }

    public PersonFaculty(String officeBuilding, int officeRoom, String name, String race, int age) {
        super(name, race, age);
        this.officeBuilding = officeBuilding;
        this.officeRoom = officeRoom;
    }
    
    public String getPersonalInfo() {
        return this.name + " " + this.race;
    }
    
    @Override
    public String toString() {
        return super.toString() + "resides in " + officeBuilding + officeRoom;
    }
    
}

