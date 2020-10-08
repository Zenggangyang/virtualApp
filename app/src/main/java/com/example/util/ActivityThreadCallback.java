package com.example.util;

import android.os.Handler;
import android.os.Message;

import androidx.annotation.NonNull;

public class ActivityThreadCallback implements Handler.Callback {

    Handler mHandler = null;

    public ActivityThreadCallback(Handler mHandler){
        this.mHandler = mHandler;
    }

    /**
     * 如果返回false 还会往下传递msg
     * @param message
     * @return
     */
    @Override
    public boolean handleMessage(@NonNull Message message) {

        MyApplication.myLog.e("====>"+message.what);
        //开始适配
        if(MyApplication.androidSystemVersion==MyApplication.O||MyApplication.androidSystemVersion==MyApplication.O_MR1){

            if(message.what==MyApplication.Android_System.O.LAUNCH_ACTIVITY){
                //本地进程开始加载Activity
                MyApplication.myLog.e("本地进程开始加载Activity");

            }


        }




        return false;
    }
}
