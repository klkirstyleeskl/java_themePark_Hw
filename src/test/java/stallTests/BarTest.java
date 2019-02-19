package stallTests;

import org.junit.Before;
import org.junit.Test;
import stall.Bar;

import static org.junit.Assert.assertEquals;


public class BarTest {
    Bar bar;

    @Before
    public void before(){
        bar = new Bar("BarBarBarBar", "Holly", 18);
    }

    @Test
    public void canGetName(){
        assertEquals("BarBarBarBar", bar.getName());
    }

    @Test
    public void canSetName(){
        bar.setName("ABC");
        assertEquals("ABC", bar.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Holly", bar.getOwnerName());
    }

    @Test
    public void canSetOwnerName(){
        bar.setOwnerName("Bob");
        assertEquals("Bob", bar.getOwnerName());
    }

    @Test
    public void canGetParking(){
        assertEquals(18, bar.getParkingSpot());
    }

    @Test
    public void canSetParking(){
        bar.setParkingSpot(21);
        assertEquals(21, bar.getParkingSpot());
    }


}