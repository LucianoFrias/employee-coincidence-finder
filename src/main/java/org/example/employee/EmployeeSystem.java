package org.example.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSystem {

    private final List<Employee> employees;

    public EmployeeSystem() {
        employees = new ArrayList<Employee>();
    }

    public void addEmployee(String name) {
        Employee employee = new Employee(name);

        employees.add(employee);
    }

    public Employee getEmployeeByName(String name) {
        Employee foundEmployee = null;

        try {
            for (Employee employee : employees) {
                if (employee.getName().equals(name))
                     foundEmployee = employee;
            }
        } catch (NullPointerException e) {
            throw new NullPointerException("Employee Object was not found!");
        }

        return foundEmployee;
    }

}
