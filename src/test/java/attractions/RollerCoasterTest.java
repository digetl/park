package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;


public class RollerCoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitorUnderAge;
    Visitor visitorUnderAgeTall;
    Visitor visitorOverAge;
    Visitor visitorOverAgeSmall;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Boke-aramma", 12);
    }

    @Test
    public void hasName() {
        assertEquals("Boke-aramma", rollerCoaster.getName());
    }

}
