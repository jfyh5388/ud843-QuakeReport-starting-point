package com.example.android.quakereport;

/**
 * Created by nxf31834 on 7/11/2017.
 */

public class Earthquake {

    private double mLevel;

    private String mLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    public Earthquake(double fLevel, String fLocation, long fTimeInMilliseconds)
    {
        mLevel = fLevel;
        mLocation = fLocation;
        mTimeInMilliseconds = fTimeInMilliseconds;;
    }

    public double getmLevel()
    {
        return mLevel;
    }

    public String getmLocation()
    {
        return mLocation;
    }

    public long getmTimeInMilliseconds()
    {
        return mTimeInMilliseconds;
    }


}
