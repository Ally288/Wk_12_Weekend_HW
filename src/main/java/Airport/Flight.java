package Airport;

import People.passenger.Passenger;
import People.staff.CabinCrewMember;
import People.staff.Pilot;
import Airport.Plane;

import java.sql.Array;
import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    String flightNum;
    String destination;
    String departureAirport;
    String departureTime;

    public Flight(String flightNum, String destination, String departureAirport, String departureTime) {
        this.pilots = new ArrayList<Pilot>(1);
        this.cabinCrewMembers = new ArrayList<CabinCrewMember>(2);
        this.passengers = new ArrayList<Passenger>();
        this.flightNum = flightNum;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public void addPilot(Pilot pilot) {
        this.pilots.add(pilot);
    }

    public void addCabinCrewMembers(CabinCrewMember cabinCrewMember) {
        this.cabinCrewMembers.add(cabinCrewMember);
    }

    public void addPassengers(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public String getFlightNum() {
        return flightNum;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getBookedPassengers() {
        return passengers.size();
    }

    public int getAvailableSeats(Plane plane) {
        int capacity = plane.getPlaneCapacity();
        int passengers = getBookedPassengers();
        int available = capacity - passengers;
        return available;
    }

}
