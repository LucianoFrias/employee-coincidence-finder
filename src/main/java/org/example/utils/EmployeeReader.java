package org.example.utils;

import org.example.hour.Hour;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class EmployeeReader {

    public static List<Hour> readHoursByNameFromTXT(String name)
    {
        name = name.toUpperCase();

        List<Hour> hours = new ArrayList<Hour>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File("src/main/resources/datafiles/data.txt")));
            SimpleDateFormat dateFormatter = new SimpleDateFormat("EEE d HH:mm", Locale.ENGLISH);
            String currentLine;
            boolean found = false;


            while ((currentLine = reader.readLine()) != null)
            {
                if (currentLine.equals(name))
                {
                    found = true;

                    String employeeHoursTXTLine = reader.readLine();
                    String[] employeeAllHours = employeeHoursTXTLine.split(",");

                    for (int i = 0; i < employeeAllHours.length; i++)
                    {
                        String[] timeFrame = employeeAllHours[i].split("-");
                        String startTime = timeFrame[0].trim();
                        String endTime = timeFrame[1].trim();

                        Date startTimeDate = dateFormatter.parse(startTime);
                        Date endTimeDate = dateFormatter.parse(endTime);

                        Hour hour = new Hour(startTimeDate, endTimeDate);
                        hours.add(hour);
                    }
                }
            }

            if (!found)
            {
                throw new NullPointerException("The employee was not found in the datafile.");
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        return hours;
    }

}
