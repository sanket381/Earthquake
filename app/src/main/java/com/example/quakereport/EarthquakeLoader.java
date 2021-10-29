package com.example.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class EarthquakeLoader  extends AsyncTaskLoader<List<Earthquake>> {

    /** Tag for log messages */
    private static final String LOG_TAG = EarthquakeLoader.class.getName();

    /** Query URL */
    private String mUrl;

    /**
     * Constructs a new {@link EarthquakeLoader}.
     *
     * @param "Contex" of the activity
     * @param "url" to load data from
     */
    public EarthquakeLoader( Context context, String url) {
        super(context);
        mUrl=url;
    }

    /**
     * Constructs a new {@link EarthquakeLoader}.
     *
     * @param "Contex" of the activity
     * @param "url" to load data from
     */
    @Override
    protected void onStartLoading() {
        Log.i(LOG_TAG, "onStartLoading: is called");
        forceLoad();
    }


    @Nullable
    @Override
    public List<Earthquake> loadInBackground() {
        Log.i(LOG_TAG, "loadInBackground: is called");
        if (mUrl==null){
            return null;
        }
        List<Earthquake> earthquakes = QueryUtils.fetchEarthquakeData(mUrl);
        return earthquakes;
    }
}
