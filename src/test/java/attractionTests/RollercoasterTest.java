package attractionTests;

import attraction.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {
    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Nemesis Inferno");
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


}
