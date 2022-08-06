import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Sandy", 1);
    }

    @Test
    public void canGetName() {
        assertEquals("Sandy", passenger.getName());
    }

    @Test
    public void canGetNumberOfBags() {
        assertEquals(1, passenger.getNumberOfBags());
    }
}
