package org.example.coincidence_finder;

import org.example.employee.Employee;
import org.example.employee.EmployeeSystem;
import org.example.utils.DateComparator;

import java.util.Date;

public class CoincidenceFinder {

    private EmployeeSystem employeeSystem;

    public CoincidenceFinder(EmployeeSystem employeeSystem) {
        this.employeeSystem = employeeSystem;
    }

    public int findCoincidences(String firstEmployeeName, String secondEmployeeName) {
        int counter = 0;
        Employee employee1 = null;
        Employee employee2 = null;


        if (firstEmployeeName.equalsIgnoreCase(secondEmployeeName)) {
            throw new IllegalArgumentException("Both arguments in the function have the same name!");
        }


        employee1 = employeeSystem.getEmployeeByName(firstEmployeeName);
        employee2 = employeeSystem.getEmployeeByName(secondEmployeeName);


        for (int i = 0; i < employee2.getHoursWorked().size(); i++) {
            for (int j = 0; j < employee1.getHoursWorked().size(); j++) {
                Date startTimeEmployee1 = employee1.getHourWorkedByIndex(j).getStartTime();
                Date endTimeEmployee1 = employee1.getHourWorkedByIndex(j).getEndTime();
                Date startTimeEmployee2 = employee2.getHourWorkedByIndex(i).getStartTime();
                Date endTimeEmployee2 = employee2.getHourWorkedByIndex(i).getEndTime();

                if (DateComparator.isDateInBetween(startTimeEmployee1, startTimeEmployee2, endTimeEmployee2) ||
                    DateComparator.isDateInBetween(startTimeEmployee2, startTimeEmployee1, endTimeEmployee1)) {
                    counter++;
                }
            }
        }

        System.out.println(employee1.getName() + " - " + employee2.getName() + ": " + counter);

        return counter;
    }


}
