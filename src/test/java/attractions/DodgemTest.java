package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor visitor1, visitor2, visitor3;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        visitor2 = new Visitor(21, 2.1, 21.0);
        visitor3 = new Visitor(11, 2.1, 21.0);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(4.500, dodgems.defaultPrice(), 0.01);
    }
    @Test
    public void hasKiddiePricing(){
        assertEquals(2.25, dodgems.priceFor(visitor3), 0.01);
        assertEquals(4.50, dodgems.priceFor(visitor2), 0.01);
    }
}
