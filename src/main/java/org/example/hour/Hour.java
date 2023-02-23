package org.example.hour;

import java.util.Date;

public class Hour {
    private Date startTime;
    private Date endTime;

    public Hour(Date startTime, Date endTime)
    {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Date getStartTime()
    {
        return startTime;
    }

    public Date getEndTime()
    {
        return endTime;
    }
}
