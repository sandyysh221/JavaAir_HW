import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("Chris", Rank.CAPTAIN, "ABC123");
        flight = new Flight(pilot, Plane.AIRBUSA320, "FR756", "London", "EDI", "10:00");
    }

    @Test
    public void canGetPilot() {
        assertEquals(pilot, flight.getPilot());
    }

    @Test
    public void canGetPlane() {
        assertEquals(Plane.AIRBUSA320, flight.getPlane());
    }

    @Test
    public void canGetFlightNumber() {
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void canGetDestination() {
        assertEquals("London", flight.getDestination());
    }

    @Test
    public void canGetDepartureAirport() {
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void canGetDepartureTime() {
        assertEquals("10:00", flight.getDepartureTime());
    }

    @Test
    public void canGetNumberOfAvailableSeats() {
        assertEquals(180, flight.getNumberOfAvailableSeats());
    }

    @Test
    public void canBookAPassenger() {
        Passenger passenger = new Passenger("Sandy", 1);
        flight.addPassenger(passenger);
        assertEquals(1, flight.getPassengerCount());
    }

    @Test
    public void canGetNumberOfAvailableSeatsAfterPassengersBooked() {
        Passenger passenger1 = new Passenger("Sandy", 1);
        Passenger passenger2 = new Passenger("Chris", 2);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(2, flight.getPassengerCount());
        assertEquals(178, flight.getNumberOfAvailableSeats());
    }

    @Test
    public void canGetNumberOfCabinCrewMembers() {
        assertEquals(0, flight.getCabinCrewMemberCount());
    }

    @Test
    public void canAddCabinCrewMember() {
        CabinCrewMember cabinCrewMember1 = new CabinCrewMember("Clare", Rank.FIRST_OFFICER);
        CabinCrewMember cabinCrewMember2 = new CabinCrewMember("Josie", Rank.PURSER);
        flight.addCabinCrewMember(cabinCrewMember1);
        flight.addCabinCrewMember(cabinCrewMember2);
        assertEquals(2, flight.getCabinCrewMemberCount());
    }
}
