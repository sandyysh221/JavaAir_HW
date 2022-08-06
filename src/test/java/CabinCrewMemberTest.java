import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember;

    @Before
    public void before() {
        cabinCrewMember = new CabinCrewMember("Catherine", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void canGetCabinCrewMemberName() {
        assertEquals("Catherine", cabinCrewMember.getName());
    }

    @Test
    public void canGetCabinCrewMemberRank() {
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrewMember.getRank());
    }

}
