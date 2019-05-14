import Management.Director;
import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Manager manager;
    Director director;

    @Before
    public void before(){
        manager = new Manager("Emily", "EL543214", 30000, "Admin");
        director = new Director("Ted", "TD349422", 80000, "Accounts", 100000);
    }

    @Test
    public void canPayBonus(){
        assertEquals(1600.00, director.payBonus(), 0.01);
    }
}
