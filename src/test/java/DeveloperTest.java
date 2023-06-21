import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


    public class DeveloperTest {
        private Developer developer;
        @Before
        public void before(){
            developer = new Developer("Beth", "SJ460812", 50000.00);
        }
        @Test
        public void hasName(){
            assertEquals("Beth", developer.getName());
        }
        @Test
        public void hasNumber(){
            assertEquals("SJ460812", developer.getNumber());
        }
        @Test
        public void hasSalary(){
            assertEquals(50000.00, developer.getSalary(), 0.00);
        }
        @Test
        public void canRaiseSalary(){
            assertEquals(50100.00, developer.raiseSalary(100.00), 0.00);
        }
        @Test
        public void canGetBonus(){
            assertEquals(500.00, developer.getBonus(), 0.00);
        }





    }


