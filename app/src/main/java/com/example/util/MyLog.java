package com.example.util;

import android.util.Log;

public class MyLog {

    String schema;
    public MyLog(String schema){
        this.schema = schema;
    }

    public void e(String message){
        Log.e(schema,message);
    }

    public void i(String message){
        Log.i(schema,message);
    }

}
