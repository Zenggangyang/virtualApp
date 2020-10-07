package com.example.util;

import android.content.Context;

import java.io.File;

import dalvik.system.DexClassLoader;

public class APK {

    private String apkPath;
    private DexClassLoader dexClassLoader;
    private Context context;
    public static class Contants{
        public static String dexDir = "dex";
    }

    public APK(Context context,String apkPath){
        this.context = context;
        this.apkPath = apkPath;
    }

    public Class<?> getClass(String clazz){

        Class<?> myclass = null;
        try {
            myclass = dexClassLoader.loadClass(clazz);
            if(null != myclass){
                return myclass;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void analysis(){
        //开始解析
        dexClassLoader = new DexClassLoader(apkPath,getDir(context,Contants.dexDir).getAbsolutePath(),null,context.getClassLoader());
        try {
            Class<?> clazz = dexClassLoader.loadClass("com.example.myapplication.MainActivity");
            int i = 0;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    private File getDir(Context context, String path){
        return context.getDir(path,Context.MODE_PRIVATE);
    }

}
