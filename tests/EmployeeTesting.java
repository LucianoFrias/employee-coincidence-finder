package tests;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.Test;

import src.employee.Employee;
import src.system.EmployeeSystem;

public class EmployeeTesting {
    @Test
    public void testEmployeeCreationNotNull()
    {
        EmployeeSystem employeeSystem = new EmployeeSystem();
        Employee employee;


        employeeSystem.loadEmployeeIntoSystem("Luciano");
        employee = employeeSystem.getEmployee("Luciano");

        assertNotNull(employee);
    }

    @Test
    public void testCheckIfHoursHaveBeenReadSucessfully()
    {
        EmployeeSystem employeeSystem = new EmployeeSystem();

        employeeSystem.loadEmployeeIntoSystem("Homero");
        

        boolean isHoursListEmpty = employeeSystem.getEmployee("Homero").getAllHoursWorked().isEmpty();

        assertFalse(isHoursListEmpty);

        
    }


    @Test
    public void testFoundCoincidenceBetweenAndresAndRene()
    {
        EmployeeSystem employeeSystem = new EmployeeSystem();

        employeeSystem.loadEmployeeIntoSystem("Andres");
        employeeSystem.loadEmployeeIntoSystem("Rene");

        int numberOfCoincidences = 
        employeeSystem.findCoincidences("Andres", "Rene");

        assertTrue(numberOfCoincidences > 0);
    }

    @Test
    public void testFoundCoincidenceBetweenReneAndAndres()
    {
        EmployeeSystem employeeSystem = new EmployeeSystem();

        employeeSystem.loadEmployeeIntoSystem("Andres");
        employeeSystem.loadEmployeeIntoSystem("Rene");

        int numberOfCoincidences = 
        employeeSystem.findCoincidences("Rene", "Andres");

        assertTrue(numberOfCoincidences > 0);
    }
}
