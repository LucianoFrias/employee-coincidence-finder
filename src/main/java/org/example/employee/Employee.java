package org.example.employee;

import org.example.hour.Hour;
import org.example.utils.EmployeeReader;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private List<Hour> hoursWorked;

    public Employee(String name)
    {
        this.name = name;
        this.hoursWorked = new ArrayList<Hour>();

        readHours();
    }

    public String getName()
    {
        return name;
    }

    public List<Hour> getHoursWorked()
    {
        return hoursWorked;
    }

    public Hour getHourWorkedByIndex(int position)
    {
        return hoursWorked.get(position);
    }

    public void readHours()
    {
        this.hoursWorked = EmployeeReader.readHoursByNameFromTXT(name);
    }
}
