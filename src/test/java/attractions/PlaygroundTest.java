package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PlaygroundTest {
    Playground playground;
    Visitor visitorUnderAge;
    Visitor visitorOverAge;

    @Before
    public void setUp() {
        playground = new Playground("Fun Zone", 7);
        visitorUnderAge = new Visitor(14, 1.2, 40.0);
        visitorOverAge = new Visitor(15, 1.6, 80.0);
       }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void isUnder15__True() {
        assertTrue(playground.isAllowedTo(visitorUnderAge));
    }
}
