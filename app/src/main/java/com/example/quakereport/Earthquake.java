package com.example.quakereport;

public class Earthquake {
    private  String mUrl;
    private double mMagnitude;
    private String mLocation;
    //private String mDate;
    private long mTimeInMilliseconds;

    public Earthquake(double magnitude,String Location ,long timeInMilliseconds,String url){
        mMagnitude=magnitude;
        mLocation=Location;
        mTimeInMilliseconds=timeInMilliseconds;
        mUrl=url;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl(){
        return mUrl;
    }
}
