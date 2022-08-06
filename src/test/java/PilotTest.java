import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;

    @Before
    public void before () {
        pilot = new Pilot("Chris", Rank.CAPTAIN, "ABC123");
    }

    @Test
    public void canGetPilotName() {
        assertEquals("Chris", pilot.getName());
    }

    @Test
    public void canGetPilotRank() {
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void canGetPilotLicenseNumber() {
        assertEquals("ABC123", pilot.getLicenseNumber());
    }

    @Test
    public void canFlyPlane() {
        assertEquals("This is your captain speaking.", pilot.flyPlane());
    }
}
