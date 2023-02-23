package org.example.coincidence_finder;

import org.example.employee.EmployeeSystem;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CoincidenceFinderTest {


    @Test
    void testFindCoincidences() {
        EmployeeSystem system = new EmployeeSystem();
        CoincidenceFinder coincidenceFinder = new CoincidenceFinder(system);


        system.addEmployee("Luciano");
        system.addEmployee("Homero");
        system.addEmployee("Astrid");
        system.addEmployee("Rene");

        int lucianoToRene = coincidenceFinder.findCoincidences("Luciano", "Rene");
        int homeroToAstrid = coincidenceFinder.findCoincidences("Homero", "Astrid");
        int reneToAstrid = coincidenceFinder.findCoincidences("Rene", "Astrid");
        int reneToLuciano = coincidenceFinder.findCoincidences("Rene", "Luciano");
        int astridToRene = coincidenceFinder.findCoincidences("Astrid", "Rene");

        assertAll(
                () -> assertTrue(lucianoToRene != 0),
                () -> assertTrue(homeroToAstrid != 0),
                () -> assertTrue(reneToAstrid != 0),
                () -> assertTrue(reneToLuciano != 0),
                () -> assertTrue(astridToRene != 0)
        );
    }
}