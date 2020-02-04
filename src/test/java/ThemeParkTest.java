import attractions.*;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    private ThemePark themePark;
    private Dodgems dodgems;
    private Park park;
    private Playground playground;
    private RollerCoaster rollerCoaster;
    private CandyflossStall candyflossStall;
    private IceCreamStall iceCreamStall;
    private TobaccoStall tobaccoStall;
    private Visitor visitor;


    @Before
    public void setUp(){
        themePark = new ThemePark();
        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Leafy Meadows", 9);
        playground = new Playground("Fun Zone", 7);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        candyflossStall = new CandyflossStall("Candy Land", 2, "Harry Belafonte", ParkingSpot.A1);
        iceCreamStall = new IceCreamStall("Dream Cones",3, "Vanilla Ice", ParkingSpot.A4);
        tobaccoStall = new TobaccoStall("Jacks Drum", 5, "Jack Jarvis", ParkingSpot.B1);
        visitor = new Visitor(21, 2.1, 21.0);
    }

    @Test
    public void canAddEntertainment(){
        themePark.addEntertainment(dodgems);
        assertEquals(1, themePark.getEntertainmentCount());
    }

    @Test
    public void canGetAllReviewed(){
        themePark.addEntertainment(dodgems);
        themePark.addEntertainment(park);
        themePark.addEntertainment(playground);
        themePark.addEntertainment(rollerCoaster);
        themePark.addEntertainment(candyflossStall);
        themePark.addEntertainment(iceCreamStall);
        themePark.addEntertainment(tobaccoStall);
        assertEquals(7, themePark.getAllReviewed().size());
    }

    @Test
    public void canVisit(){
        themePark.visit(visitor, park);
        assertEquals(1, visitor.countVisits());
        assertEquals(1, park.getVisitCount());
    }





}
