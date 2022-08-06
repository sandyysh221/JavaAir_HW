import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {
    FlightManager flightManager;
    Flight flight;
    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Chris", Rank.CAPTAIN, "ABC123");
        flight = new Flight(pilot, Plane.AIRBUSA320, "FR756", "London", "EDI", "10:00");
        flightManager = new FlightManager(flight);
    }

    @Test
    public void getFlightForFlightManager() {
        assertEquals(flight, flightManager.getFlight());
    }

    @Test
    public void getTotalBaggageLimit() {
        assertEquals(38500, flightManager.getTotalBaggageLimit(), 0.01);
    }

    @Test
    public void getBaggageLimitPerPassenger() {
        assertEquals(213.88, flightManager.getBaggageLimitPerPassenger(), 0.01);
    }

    @Test
    public void getBookedBaggageWeight() {
        Passenger passenger1 = new Passenger("Sandy", 1);
        Passenger passenger2 = new Passenger("Chris", 2);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(427.77, flightManager.getBookedBaggageWeight(), 0.01);
    }

    @Test
    public void getRemainingBaggageWeightAllowed() {
        Passenger passenger1 = new Passenger("Sandy", 1);
        Passenger passenger2 = new Passenger("Chris", 2);
        flight.addPassenger(passenger1);
        flight.addPassenger(passenger2);
        assertEquals(38072.23, flightManager.getRemainingBaggageWeightAllowed(), 0.01);
    }
}
