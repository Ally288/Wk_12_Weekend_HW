package Airport;

public class Plane {

    String planeType;
    int planeCapacity;
    int totalWeight;

    public Plane (String planeType, int planeCapacity, int totalWeight){
        this.planeType = planeType;
        this.planeCapacity = planeCapacity;
        this.totalWeight = totalWeight;
    }

    public String getPlaneType() {
        return planeType;
    }

    public int getPlaneCapacity(){
        return planeCapacity;
    }

    public int getTotalWeight(){
        return totalWeight;
    }

}
