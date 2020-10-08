package com.example.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyUtil {

    public static String  apkFilePath = null;

    //开始函数式编程
    public static void startPickUp(Context context){
        //选择文件
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
//        //intent.setType(“image/*”);//选择图片
//        //intent.setType(“audio/*”); //选择音频
//        //intent.setType(“video/*”); //选择视频 （mp4 3gp 是android支持的视频格式）
//        //intent.setType(“video/*;image/*”);//同时选择视频和图片
        intent.setType("*/*");//无类型限制
//        intent.addCategory(Intent.CATEGORY_OPENABLE);
        ((Activity)context).startActivityForResult(intent, 1);
    }



    public static void start(Context context){

        //开始HOOK



        //解析 APK
        Log.e("wan","开始解析=======》"+context.getFilesDir());
        APK apk = new APK(context,apkFilePath);
        apk.analysis();





    }




}
