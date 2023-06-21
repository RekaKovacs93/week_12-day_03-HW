import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    private Director director;
    @Before
    public void before(){
        director = new Director("Beth", "SJ460812", 50000.00, "Public Relations", 10000.00);
    }
    @Test
    public void hasName(){
        assertEquals("Beth", director.getName());
    }
    @Test
    public void hasNumber(){
        assertEquals("SJ460812", director.getNumber());
    }
    @Test
    public void hasSalary(){
        assertEquals(50000.00, director.getSalary(), 0.00);
    }
    @Test
    public void hasDepartment(){
        assertEquals("Public Relations", director.getDepartmentName());
    }
    @Test
    public void canRaiseSalary(){
        assertEquals(50100.00, director.raiseSalary(100.00), 0.00);
    }
    @Test
    public void canGetBonus(){
        assertEquals(500.00, director.getBonus(), 0.00);
    }
    @Test
    public void hasBudget(){
        assertEquals(10000.00, director.getBudget(), 0.00);
    }





}
