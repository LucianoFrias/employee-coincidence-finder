package src.employee;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import src.hour.Hour;

public class Employee {
    private String name;
    private List<Hour> hoursWorked;

    public Employee(String name)
    {
        this.name = name;
        this.name = this.name.toUpperCase().trim();
        this.hoursWorked = new ArrayList<Hour>();
    }

    public String getName()
    {
        return name;
    }

    public List<Hour> getAllHoursWorked()
    {
        return hoursWorked;
    }

    public Hour getHourWorked(int position)
    {
        return hoursWorked.get(position);
    }

    public void addHourWorked(Hour hour)
    {
        hoursWorked.add(hour);
    }

    public void readHoursFromTXT(String fileName)
    {
        File file = new File(fileName);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String currentLine;

            while ((currentLine = reader.readLine()) != null)
            {
                if (currentLine.equals(name))
                {
                    System.out.println("Employee loaded: " + name);

                    String employeeHoursTXTLine = reader.readLine();
                    String[] employeeAllHours = employeeHoursTXTLine.split(",");

                    for (int i = 0; i < employeeAllHours.length; i++)
                    {
                        String[] timeFrame = employeeAllHours[i].split("-");
                        String startTime = timeFrame[0].trim();
                        String endtime = timeFrame[1].trim();

                        SimpleDateFormat dateFormatter = new SimpleDateFormat("EEE d HH:mm", Locale.ENGLISH);

                        Date startTimeDate = dateFormatter.parse(startTime);
                        Date endTimeDate = dateFormatter.parse(endtime);

                        Hour hour = new Hour(startTimeDate, endTimeDate);
                        addHourWorked(hour);
                    }
                }
            }

            reader.close();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
       
    }
}
