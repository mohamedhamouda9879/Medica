package com.example.medica;

import android.app.Application;

import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        //FacebookSdk.getApplicationSignature(getApplicationContext());
        FacebookSdk.getSdkVersion();
        AppEventsLogger.activateApp(this);


    }
}
