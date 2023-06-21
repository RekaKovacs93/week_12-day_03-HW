import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    private Manager manager;
    @Before
    public void before(){
        manager = new Manager("Beth", "SJ460812", 50000.00, "Public Relations");
    }
    @Test
    public void hasName(){
        assertEquals("Beth", manager.getName());
    }
    @Test
    public void hasNumber(){
        assertEquals("SJ460812", manager.getNumber());
    }
    @Test
    public void hasSalary(){
        assertEquals(50000.00, manager.getSalary(), 0.00);
    }
    @Test
    public void hasDepartment(){
        assertEquals("Public Relations", manager.getDepartmentName());
    }
    @Test
    public void canRaiseSalary(){
        assertEquals(50100.00, manager.raiseSalary(100.00), 0.00);
    }
    @Test
    public void canGetBonus(){
        assertEquals(500.00, manager.getBonus(), 0.00);
    }





}
