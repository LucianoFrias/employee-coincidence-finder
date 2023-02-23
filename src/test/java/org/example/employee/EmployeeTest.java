package org.example.employee;

import org.example.hour.Hour;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testGetNameTest() {
        Employee employee = new Employee("Homero");

        String name = employee.getName();

        assertTrue(name.equals("Homero"));
    }

    @Test
    void testGetHoursWorkedTest() {
        Employee employee = new Employee("Luciano");

        List<Hour> hours = employee.getHoursWorked();

        assertFalse(hours.isEmpty());

    }

    @Test
    void testGetHourWorkedByIndexTest() {
        Employee employee = new Employee("Astrid");

        Hour hour = employee.getHourWorkedByIndex(0);

        assertNotNull(hour);
    }
}