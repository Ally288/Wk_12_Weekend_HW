package People.passenger;

import People.People;

public class Passenger extends People {
    private int NumOfBags;

    public Passenger(String name, int NumOfBags){
        super(name, String.valueOf(NumOfBags));
        this.NumOfBags = Integer.parseInt(String.valueOf(NumOfBags));
    }

    public int getNumOfBags() {
        return NumOfBags;
    }

}
