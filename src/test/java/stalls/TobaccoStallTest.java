package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import people.Visitor;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitorUnderAge;
    Visitor visitorOverAge;

    @Before
    public void setUp() {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        visitorOverAge = new Visitor(18, 1.6, 80.0);
        visitorUnderAge = new Visitor(17, 1.8, 80.0);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void checkIfUnder18() {
        assertFalse(tobaccoStall.isAllowedTo(visitorUnderAge));
    }

    @Test
    public void checkIsOver18() {
        assertTrue(tobaccoStall.isAllowedTo(visitorOverAge));
    }
}
