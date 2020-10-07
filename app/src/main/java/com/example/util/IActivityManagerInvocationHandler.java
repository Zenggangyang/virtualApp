package com.example.util;

import android.content.ComponentName;
import android.content.Intent;
import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class IActivityManagerInvocationHandler implements InvocationHandler {

    private Object mBase = null;

    public IActivityManagerInvocationHandler(Object mBase){
        this.mBase = mBase;
    }


    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {

        String methodName = method.getName();
        if("startActivity".equals(methodName)){
            int index = 0;
            for (int i=0;i<objects.length;i++){
                if(objects[i] instanceof Intent){
                    index = i;
                    break;
                }
            }

            Intent newIntent = new Intent();
            newIntent.setComponent(new ComponentName("hookIntent","com.example.myapplication.MainActivity"));

            newIntent.putExtra("orginIntent",(Intent)objects[index]);

            objects[index] = newIntent;


        }
        return method.invoke(this.mBase,objects);
    }
}
