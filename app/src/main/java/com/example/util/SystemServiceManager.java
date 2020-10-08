package com.example.util;

import android.os.Handler;

import java.lang.reflect.Proxy;

public class SystemServiceManager {

    public SystemServiceManager(){

    }

    public void startHook(){
        this.hookActivityManagerNative();
        this.hookActivityThread();
        this.hookInstrumation();
    }

    //activitymanagernative
    private void hookActivityManagerNative(){

        try {
            Reflector myActivityManager = Reflector.on("android.app.ActivityManager").findField("IActivityManagerSingleton");
            Reflector mySingleton = Reflector.on("android.util.Singleton").findField("mInstance");
            Object gDefault = mySingleton.getInstanceField(myActivityManager.getStaticField());
            mySingleton.setStaticField(myActivityManager.getStaticField(),
                    Proxy.newProxyInstance(Class.class.getClassLoader(),new Class[]{Class.forName("android.app.IActivityManager")}, new IActivityManagerInvocationHandler(gDefault)));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (Reflector.RefectedException e) {
            e.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        }


    }

    private void hookActivityThread(){

        try {
            Object instance_ActivityThread = Reflector.on("android.app.ActivityThread").findField("sCurrentActivityThread").getStaticField();
            Object instance_mH = Reflector.on("android.app.ActivityThread").findField("mH").getInstanceField(instance_ActivityThread);
            Reflector.on("android.os.Handler").findField("mCallback").setInstanceField(instance_mH,new ActivityThreadCallback((Handler) instance_mH));

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (Reflector.RefectedException e) {
            e.printStackTrace();
        }


    }

    public void hookInstrumation(){


    }



}
