import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DataBaseAdminTest {
    private DataBaseAdmin dataBaseAdmin;
    @Before
    public void before(){
        dataBaseAdmin = new DataBaseAdmin("Beth", "SJ460812", 50000.00);
    }
    @Test
    public void hasName(){
        assertEquals("Beth", dataBaseAdmin.getName());
    }
    @Test
    public void hasNumber(){
        assertEquals("SJ460812", dataBaseAdmin.getNumber());
    }
    @Test
    public void hasSalary(){
        assertEquals(50000.00, dataBaseAdmin.getSalary(), 0.00);
    }
    @Test
    public void canRaiseSalary(){
        assertEquals(50100.00, dataBaseAdmin.raiseSalary(100.00), 0.00);
    }
    @Test
    public void canGetBonus(){
        assertEquals(500.00, dataBaseAdmin.getBonus(), 0.00);
    }





}


