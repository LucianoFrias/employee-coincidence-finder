package org.example;

import org.example.coincidence_finder.CoincidenceFinder;
import org.example.employee.Employee;
import org.example.employee.EmployeeSystem;
import org.example.hour.Hour;
import org.example.utils.EmployeeReader;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        EmployeeSystem system = new EmployeeSystem();
        CoincidenceFinder finder = new CoincidenceFinder(system);

        system.addEmployee("Luciano");
        system.addEmployee("Homero");
        system.addEmployee("Astrid");

        finder.findCoincidences("Homero", "Luciano");

    }
}