import People.staff.CabinCrewMember;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    CabinCrewMember cabinCrewMember1;
    CabinCrewMember cabinCrewMember2;

    @Before
    public void before() {
        cabinCrewMember1 = new CabinCrewMember("Mary Jane","Flight Attendant");
        cabinCrewMember2 = new CabinCrewMember("Rick James","Captain");
    }

    @Test
    public void hasName() {
        assertEquals("Mary Jane", cabinCrewMember1.getName());
        assertEquals("Rick James", cabinCrewMember2.getName());
    }

    @Test
    public void hasRank(){
        assertEquals("Flight Attendant", cabinCrewMember1.getRank());
        assertEquals("Captain", cabinCrewMember2.getRank());
    }
}
