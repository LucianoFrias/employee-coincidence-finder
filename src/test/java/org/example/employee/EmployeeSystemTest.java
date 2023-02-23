package org.example.employee;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeSystemTest {

    @Test
    void testAddEmployee() {
        EmployeeSystem employeeSystem = new EmployeeSystem();

        employeeSystem.addEmployee("Luciano");
        employeeSystem.addEmployee("Homero");

        assertAll(
                () -> assertNotNull(employeeSystem.getEmployeeByName("Luciano")),
                () -> assertNotNull(employeeSystem.getEmployeeByName("Homero"))
        );



    }

    @Test
    void testGetNullEmployee() {
        EmployeeSystem employeeSystem = new EmployeeSystem();

        Employee employee = employeeSystem.getEmployeeByName("Ricardo");

        assertThrows(NullPointerException.class, (Executable) employee);

    }

}