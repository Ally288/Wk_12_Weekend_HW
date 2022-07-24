package People.staff;

import Airport.Plane;
import People.People;

public class Pilot extends People{

    private String licenseNumber;

    public Pilot (String name, String rank, String licenseNumber) {
        super(name, rank);
        this.licenseNumber = licenseNumber;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String flyPlane(Pilot pilot, Plane plane) {
        return "Plane can take flight as the " + plane.getPlaneType() + " will be piloted by " + pilot.getName();
    }
}
