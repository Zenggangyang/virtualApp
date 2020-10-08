package com.example.util;

import android.app.Application;
import android.content.Context;
import android.util.Log;

public class MyApplication extends Application {

    public static MyLog myLog = new MyLog("wan");
    public static int androidSystemVersion = 0;
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        androidSystemVersion = android.os.Build.VERSION.SDK_INT;

        Log.e("wan","start application");

        new SystemServiceManager().startHook();
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }


    public static final int BASE = 1;
    public static final int BASE_1_1 = 2;
    public static final int CUPCAKE = 3;
    public static final int CUR_DEVELOPMENT = 10000;
    public static final int DONUT = 4;
    public static final int ECLAIR = 5;
    public static final int ECLAIR_0_1 = 6;
    public static final int ECLAIR_MR1 = 7;
    public static final int FROYO = 8;
    public static final int GINGERBREAD = 9;
    public static final int GINGERBREAD_MR1 = 10;
    public static final int HONEYCOMB = 11;
    public static final int HONEYCOMB_MR1 = 12;
    public static final int HONEYCOMB_MR2 = 13;
    public static final int ICE_CREAM_SANDWICH = 14;
    public static final int ICE_CREAM_SANDWICH_MR1 = 15;
    public static final int JELLY_BEAN = 16;
    public static final int JELLY_BEAN_MR1 = 17;
    public static final int JELLY_BEAN_MR2 = 18;
    public static final int KITKAT = 19;
    public static final int KITKAT_WATCH = 20;
    public static final int LOLLIPOP = 21;
    public static final int LOLLIPOP_MR1 = 22;
    public static final int M = 23;
    public static final int N = 24;
    public static final int N_MR1 = 25;
    public static final int O = 26; //8.0
    public static final int O_MR1 = 27;
    public static final int P = 28;
    public static final int Q = 29;

    public static class Android_System{

        public static class O{
            public static final int LAUNCH_ACTIVITY         = 100;
            public static final int PAUSE_ACTIVITY          = 101;
            public static final int PAUSE_ACTIVITY_FINISHING= 102;
            public static final int STOP_ACTIVITY_SHOW      = 103;
            public static final int STOP_ACTIVITY_HIDE      = 104;
            public static final int SHOW_WINDOW             = 105;
            public static final int HIDE_WINDOW             = 106;
            public static final int RESUME_ACTIVITY         = 107;
            public static final int SEND_RESULT             = 108;
            public static final int DESTROY_ACTIVITY        = 109;
            public static final int BIND_APPLICATION        = 110;
            public static final int EXIT_APPLICATION        = 111;
            public static final int NEW_INTENT              = 112;
            public static final int RECEIVER                = 113;
            public static final int CREATE_SERVICE          = 114;
            public static final int SERVICE_ARGS            = 115;
            public static final int STOP_SERVICE            = 116;

            public static final int CONFIGURATION_CHANGED   = 118;
            public static final int CLEAN_UP_CONTEXT        = 119;
            public static final int GC_WHEN_IDLE            = 120;
            public static final int BIND_SERVICE            = 121;
            public static final int UNBIND_SERVICE          = 122;
            public static final int DUMP_SERVICE            = 123;
            public static final int LOW_MEMORY              = 124;
            public static final int ACTIVITY_CONFIGURATION_CHANGED = 125;
            public static final int RELAUNCH_ACTIVITY       = 126;
            public static final int PROFILER_CONTROL        = 127;
            public static final int CREATE_BACKUP_AGENT     = 128;
            public static final int DESTROY_BACKUP_AGENT    = 129;
            public static final int SUICIDE                 = 130;
            public static final int REMOVE_PROVIDER         = 131;
            public static final int ENABLE_JIT              = 132;
            public static final int DISPATCH_PACKAGE_BROADCAST = 133;
            public static final int SCHEDULE_CRASH          = 134;
            public static final int DUMP_HEAP               = 135;
            public static final int DUMP_ACTIVITY           = 136;
            public static final int SLEEPING                = 137;
            public static final int SET_CORE_SETTINGS       = 138;
            public static final int UPDATE_PACKAGE_COMPATIBILITY_INFO = 139;
            public static final int TRIM_MEMORY             = 140;
            public static final int DUMP_PROVIDER           = 141;
            public static final int UNSTABLE_PROVIDER_DIED  = 142;
            public static final int REQUEST_ASSIST_CONTEXT_EXTRAS = 143;
            public static final int TRANSLUCENT_CONVERSION_COMPLETE = 144;
            public static final int INSTALL_PROVIDER        = 145;
            public static final int ON_NEW_ACTIVITY_OPTIONS = 146;
            public static final int CANCEL_VISIBLE_BEHIND = 147;
            public static final int BACKGROUND_VISIBLE_BEHIND_CHANGED = 148;
            public static final int ENTER_ANIMATION_COMPLETE = 149;
            public static final int START_BINDER_TRACKING = 150;
            public static final int STOP_BINDER_TRACKING_AND_DUMP = 151;
            public static final int MULTI_WINDOW_MODE_CHANGED = 152;
            public static final int PICTURE_IN_PICTURE_MODE_CHANGED = 153;
            public static final int LOCAL_VOICE_INTERACTION_STARTED = 154;
            public static final int ATTACH_AGENT = 155;
            public static final int APPLICATION_INFO_CHANGED = 156;
            public static final int ACTIVITY_MOVED_TO_DISPLAY = 157;
        }


    }

}
