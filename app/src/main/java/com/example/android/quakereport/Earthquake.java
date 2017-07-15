package com.example.android.quakereport;

/**
 * Created by nxf31834 on 7/11/2017.
 */

public class Earthquake {

    private String mLevel;

    private String mLocation;

    private String mDate;

    public Earthquake(String fLevel, String fLocation, String fDate)
    {
        mLevel = fLevel;
        mLocation = fLocation;
        mDate = fDate;
    }

    public String getmLevel()
    {
        return mLevel;
    }

    public String getmLocation()
    {
        return mLocation;
    }

    public String getmDate()
    {
        return mDate;
    }


}
