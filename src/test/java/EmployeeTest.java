import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;

    @Before
    public void before(){
        employee = new Employee("Sarah", "SD237567", 20000.00);
    }

    @Test
    public void canRaiseSalary(){
        employee.raiseSalary(1.2);
        assertEquals(24000.00, employee.getSalary(), 0.01);
    }
}
