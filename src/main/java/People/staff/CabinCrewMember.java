package People.staff;

import Airport.Plane;
import People.People;

public class CabinCrewMember extends People {

    public CabinCrewMember(String name, String rank){
        super(name, rank);
    }

    public String relayMessage() {
        return "Please be reminded that smoking is not permitted";
    }
}
