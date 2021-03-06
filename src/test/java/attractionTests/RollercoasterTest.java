package attractionTests;

import attraction.Rollercoaster;
import org.junit.Before;
import org.junit.Test;
import themeParkOperations.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {
    Rollercoaster rollercoaster;
    Visitor visitor;
    Visitor visitor2;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Nemesis Inferno");
        visitor = new Visitor(19, 2.0, 30.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Nemesis Inferno", rollercoaster.getName());
    }

    @Test
    public void canSetName(){
        rollercoaster.setName("Air");
        assertEquals("Air", rollercoaster.getName());
    }

    @Test
    public void canGetDefaultPrice(){
        assertEquals(10, rollercoaster.defaultPrice(), 0.01);

    }

    @Test
    public void canGetVisitorPrice(){
        assertEquals(5, rollercoaster.price(visitor), 0.01);
    }


    @Test
    public void canRideRollercoaster(){
        assertEquals(true, rollercoaster.isAllowedToVisit(visitor));
    }

    @Test
    public void cannotRideRollercoaster(){
        visitor2 = new Visitor(11, 1.4, 2.00);
        assertEquals(false, rollercoaster.isAllowedToVisit(visitor2));
    }


}
