package com.example.mapbackendlessandroid;

import android.app.Application;

import com.backendless.Backendless;

public class ApplicationClass extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Backendless.setUrl("https://api.backendless.com");
        Backendless.initApp(getApplicationContext(), "EBFAF9CE-F69F-F354-FF12-9051D678CF00", "8041E045-DEF4-4566-9C67-A028D729F1CA");

    }
}
