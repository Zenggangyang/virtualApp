package com.example.util;

import android.app.Application;
import android.content.Context;
import android.util.Log;

public class MyApplication extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        Log.e("wan","start application");

        new SystemServiceManager().startHook();
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
