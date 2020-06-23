package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class PlaygroundTest {
    Playground playground;
    Visitor visitorUnderAge;
    Visitor visitorOverAge;
    Visitor visitorAge15;

    @Before
    public void setUp() {
        playground = new Playground("Fun Zone", 7);
        visitorUnderAge = new Visitor(14, 1.2, 40.0);
        visitorAge15 = new Visitor(15, 1.2, 40.0);
        visitorOverAge = new Visitor(16, 1.6, 80.0);
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

    @Test
    public void isUnder15__True15() {
        assertTrue(playground.isAllowedTo(visitorAge15));
    }

    @Test
    public void isUnder15__False() {
        assertFalse(playground.isAllowedTo(visitorOverAge));
    }
}
