package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class TobaccoStallTest {

    Visitor visitor1, visitor2;

    TobaccoStall tobaccoStall;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", 5, "Jack Jarvis", ParkingSpot.B1);
        visitor1 = new Visitor(14, 1.2, 40.0);
        visitor2 = new Visitor(21, 2.1, 21.0);

    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, tobaccoStall.getRating());
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
    public void securityUnderOver18() {
        assertTrue(tobaccoStall.isAllowedTo(visitor2));
        assertFalse(tobaccoStall.isAllowedTo(visitor1));
    }
}