package org.example.utils;

import java.util.Date;

public class DateComparator {
    public static boolean isDateInBetween(Date dateToCompare, Date date1, Date date2)
    {
        return dateToCompare.getTime() >= date1.getTime() &&
                dateToCompare.getTime() <= date2.getTime();
    }
}
