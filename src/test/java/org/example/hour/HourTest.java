package org.example.hour;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class HourTest {

    SimpleDateFormat dateFormatter = new SimpleDateFormat("EEE d HH:mm", Locale.ENGLISH);

    @Test
    void testGetStartTime() {

        Hour hour = new Hour(new Date(), new Date());

        assertNotNull(hour.getStartTime());

    }

    @Test
    void testGetEndTime() {

        Hour hour = new Hour(new Date(), new Date());

        assertNotNull(hour.getEndTime());
    }
}