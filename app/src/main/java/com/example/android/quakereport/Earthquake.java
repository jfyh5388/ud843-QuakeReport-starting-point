package com.example.android.quakereport;

/**
 * Created by nxf31834 on 7/11/2017.
 */

public class Earthquake {

    private double mMagnitude;

    private String mLocation;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    private String mUrl;

    public Earthquake(double fMagnitude, String fLocation, long fTimeInMilliseconds, String fUrl)
    {
        mMagnitude = fMagnitude;
        mLocation = fLocation;
        mTimeInMilliseconds = fTimeInMilliseconds;;
        mUrl = fUrl;
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

    public String getmUrl()
    {
        return mUrl;
    }


}
