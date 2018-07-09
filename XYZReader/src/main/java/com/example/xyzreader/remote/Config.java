package com.example.xyzreader.remote;

import android.util.Log;

import java.net.MalformedURLException;
import java.net.URL;

import timber.log.Timber;

public class Config {
    public static final URL BASE_URL;

    static {
        URL url = null;
        try {
            url = new URL("https://go.udacity.com/xyz-reader-json" );
        } catch (MalformedURLException e) {
            // DONE: throw a real error
            Timber.d("Please check your internet connection, message: " + e.getMessage());
        }

        BASE_URL = url;
    }
}
