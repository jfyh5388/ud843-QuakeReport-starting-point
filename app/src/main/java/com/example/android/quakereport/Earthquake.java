package com.example.android.quakereport;

/**
 * Created by nxf31834 on 7/11/2017.
 */

public class Earthquake {

    private double mMagnitude;

    private String mLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    public Earthquake(double fMagnitude, String fLocation, long fTimeInMilliseconds)
    {
        mMagnitude = fMagnitude;
        mLocation = fLocation;
        mTimeInMilliseconds = fTimeInMilliseconds;;
    }

    public double getmMagnitude()
    {
        return mMagnitude;
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
