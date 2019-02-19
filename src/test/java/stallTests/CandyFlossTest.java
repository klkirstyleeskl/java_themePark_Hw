package stallTests;

import org.junit.Before;
import org.junit.Test;
import stall.CandyFloss;

import static org.junit.Assert.assertEquals;


public class CandyFlossTest {
    CandyFloss candyFloss;

    @Before
    public void before(){
        candyFloss = new CandyFloss("Sad Otter's CandyFloss", "Greg", 17);
    }

    @Test
    public void canGetName(){
        assertEquals("Sad Otter's CandyFloss", candyFloss.getName());
    }

    @Test
    public void canSetName(){
        candyFloss.setName("ABC");
        assertEquals("ABC", candyFloss.getName());
    }

    @Test
    public void canGetOwnerName(){
        assertEquals("Greg", candyFloss.getOwnerName());
    }

    @Test
    public void canSetOwnerName(){
        candyFloss.setOwnerName("Bob");
        assertEquals("Bob", candyFloss.getOwnerName());
    }

    @Test
    public void canGetParking(){
        assertEquals(17, candyFloss.getParkingSpot());
    }

    @Test
    public void canSetParking(){
        candyFloss.setParkingSpot(21);
        assertEquals(21, candyFloss.getParkingSpot());
    }

}
