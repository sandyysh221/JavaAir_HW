import java.util.ArrayList;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilot = pilot;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.cabinCrewMembers = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public Pilot getPilot() {
        return pilot;
    }


    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
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

    public int getNumberOfAvailableSeats() {
        return plane.getCapacity() - getPassengerCount();
    }

    public void addPassenger(Passenger passenger) {
        if (getNumberOfAvailableSeats() > 0) {
            passengers.add(passenger);
        }
    }

    public int getPassengerCount() {
        return passengers.size();
    }
}
