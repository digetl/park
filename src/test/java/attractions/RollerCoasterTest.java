package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;


public class RollerCoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitorUnderAge;
    Visitor visitorUnderAgeTall;
    Visitor visitorOverAge;
    Visitor visitorOverAgeTall;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Boke-aramma", 12, 8.40);
        visitorUnderAge = new Visitor(11, 1.2, 40.0);
        visitorUnderAgeTall = new Visitor(11, 2.2, 40.0);
        visitorOverAge = new Visitor(24, 1.2, 40.0);
        visitorOverAgeTall = new Visitor(24, 2.2, 400.0);
    }

    @Test
    public void hasName() {
        assertEquals("Boke-aramma", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(12, rollerCoaster.getRating());
    }

    @Test
    public void checkVisitorIsOldEnoughAndTallEnough__UnderAge() {
        assertFalse(rollerCoaster.isAllowedTo(visitorUnderAge));
    }

    @Test
    public void checkVisitorIsOldEnoughAndTallEnough__UnderAgeTall() {
        assertFalse(rollerCoaster.isAllowedTo(visitorUnderAgeTall));
    }

    @Test
    public void checkVisitorIsOldEnoughAndTallEnough__OverAge() {
        assertFalse(rollerCoaster.isAllowedTo(visitorOverAge));
    }

    @Test
    public void checkVisitorIsOldEnoughAndTallEnough__OverAgeTall() {
        assertTrue(rollerCoaster.isAllowedTo(visitorOverAgeTall));
    }


    @Test
    public void getPrice() {
        assertEquals(8.4, rollerCoaster.getPrice(), 0.2);
    }

    @Test
    public void checkIfVisitorIsTall() {
        rollerCoaster.priceFor(visitorOverAgeTall);
        assertEquals(16.80, rollerCoaster.getPrice(), 0.2);
    }
}
