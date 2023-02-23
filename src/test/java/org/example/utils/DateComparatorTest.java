package org.example.utils;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class DateComparatorTest {

    @Test
    void testIsDateInBetween() {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("EEE d HH:mm", Locale.ENGLISH);

        try {
            Date dateToCompare = dateFormatter.parse("Mon 12 18:30");
            Date date1 = dateFormatter.parse("Sun 11 18:10");
            Date date2 = dateFormatter.parse("Tue 13 12:00");

            assertTrue(DateComparator.isDateInBetween(dateToCompare, date1, date2));

        }
         catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}