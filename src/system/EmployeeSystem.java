package src.system;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import src.employee.Employee;

public class EmployeeSystem {
    
    private List<Employee> employees;

    public EmployeeSystem()
    {
        employees = new ArrayList<Employee>();
    }

    public void loadEmployeeIntoSystem(String name)
    {
        Employee employee = new Employee(name);

        employee.readHoursFromTXT("data.txt");
        employees.add(employee);
    }

    public Employee getEmployee(String name)
    {
        name = name.toUpperCase().trim();

        Employee foundEmployee = null;

        for (Employee employee : employees) {
            if (employee.getName().equals(name))
            {
                foundEmployee = employee;
            }
         }

         if (foundEmployee == null)
         {
            throw new NullPointerException("This name does not appear in the system: " + name);
         }

            return foundEmployee;
    }

    public int findCoincidences(String firstEmployeeName, String secondEmployeeName)
    {
        int counter = 0;
        Employee employee1;
        Employee employee2; 

        employee1 = this.getEmployee(firstEmployeeName);
        employee2 = this.getEmployee(secondEmployeeName);

        if (firstEmployeeName.equalsIgnoreCase(secondEmployeeName))
        {
            throw new IllegalArgumentException("Both arguments in the function have the same name!");
        }
        
        
        for (int i = 0; i < employee2.getAllHoursWorked().size(); i++)
        {
            for (int j = 0; j < employee1.getAllHoursWorked().size(); j++)
            {
                Date startTimeEmployee1 = employee1.getHourWorked(j).getStartTime();
                Date endTimeEmployee1 = employee1.getHourWorked(j).getEndTime();
                Date startTimeEmployee2 = employee2.getHourWorked(i).getStartTime();
                Date endTimeEmployee2 = employee2.getHourWorked(i).getEndTime();

                // Employee1 = Sat 23 14:00-Sat 23 18:00
                // Employee2 = Sat 23 15:00-Sat 23 19:00

                // Employee1 = Sat 23 15:00-Sat 23 19:00
                // Employee2 = Sat 23 14:00-Sat 23 18:00


                if ((startTimeEmployee1.getTime() >= startTimeEmployee2.getTime()
                    && startTimeEmployee1.getTime() <= endTimeEmployee2.getTime())
                    || (startTimeEmployee2.getTime() >= startTimeEmployee1.getTime()
                    && startTimeEmployee2.getTime() <= endTimeEmployee1.getTime()))
                {
                    counter++;
                }
            }
        }

        System.out.println(employee1.getName() + " - " + employee2.getName() + ": " + counter);

        return counter;
     }
}
