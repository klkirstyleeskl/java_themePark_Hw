import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {
    Visitor visitor1;

    @Before
    public void before(){
        visitor1 = new Visitor(18, 1.5, 20.50);
    }


    @Test
    public void canGetAge(){
        assertEquals(18, visitor1.getAge());
    }

    @Test
    public void canSetAge(){
        visitor1.setAge(19);
        assertEquals(19, visitor1.getAge());
    }

    @Test
    public void canGetHeight(){
        assertEquals(1.5, visitor1.getHeight(), 0.01);

    }

    @Test
    public void canSetHeight(){
        visitor1.setHeight(2.0);
       assertEquals(2.0, visitor1.getHeight(), 0.01);
    }

    @Test
    public void canGetMoney(){
        assertEquals(20.50, visitor1.getMoney(), 0.01);

    }

    @Test
    public void canSetMoney(){
        visitor1.setMoney(20.00);
        assertEquals(20.00, visitor1.getMoney(), 0.01);
    }




}
