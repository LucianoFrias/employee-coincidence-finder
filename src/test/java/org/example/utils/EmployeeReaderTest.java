package org.example.utils;

import org.example.employee.Employee;
import org.example.hour.Hour;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeReaderTest {

    @Test
    @DisplayName("Read hours from an employee and check if the list is not empty.")
    void testReadHoursByNameFromTXTTest() {
        List<Hour> hours = EmployeeReader.readHoursByNameFromTXT("Astrid");

        assertFalse(hours.isEmpty());

    }

    @Test
    @DisplayName("If it doesn't find an employee's name, returns an nullPointerException")
    void testReadHoursByNameFromEmployeeThatWasNotFound()
    {
        assertThrows(NullPointerException.class, () -> {
            EmployeeReader.readHoursByNameFromTXT("Ricard");
        });
    }
}