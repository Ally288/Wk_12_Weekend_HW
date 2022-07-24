import People.staff.Pilot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot1;
    Pilot pilot2;

    @Before
    public void before() {
        pilot1 = new Pilot ("Fox","Captain","Fox123");
        pilot2 = new Pilot ("Falco","First Officer", "Falco123");
    }

    @Test
    public void hasName() {
        assertEquals("Fox", pilot1.getName());
        assertEquals("Falco", pilot2.getName());
    }

    @Test
    public void hasRank(){
        assertEquals("Captain", pilot1.getRank());
        assertEquals("First Officer", pilot2.getRank());
    }

    @Test
    public void hasLicenseNum(){
        assertEquals("Fox123", pilot1.getLicenseNumber());
        assertEquals("Falco123", pilot2.getLicenseNumber());
    }

}
