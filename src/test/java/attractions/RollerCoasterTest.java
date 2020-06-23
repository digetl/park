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
    Visitor visitorOverAgeSmall;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Boke-aramma", 12);
        visitorUnderAge = new Visitor(11, 1.2, 40.0);
        visitorUnderAgeTall = new Visitor(11, 2.2, 40.0);
        visitorOverAge = new Visitor(24, 1.2, 40.0);
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



}
