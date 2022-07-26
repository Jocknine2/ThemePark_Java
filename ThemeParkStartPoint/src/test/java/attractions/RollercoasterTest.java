package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(15, 150, 20);
        visitor1 = new Visitor(11, 130, 8);
        visitor2 = new Visitor(18, 202,100);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void visitorCanRide(){
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void setVisitorCannotRide(){
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(),0.0);
    }
    @Test
    public void priceForVisitor(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor2),0.0);
    }
}
