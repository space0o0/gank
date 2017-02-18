package com.example.xxx.gank.application;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;

/**
 * Created by space on 2017/2/9.
 */

public class SpaceApplication extends Application {

    private static SpaceApplication mInstance;

    public Handler handler;

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance=this;

        if (Looper.myLooper()!=null){
            handler=new Handler();
        }
    }

    public static synchronized SpaceApplication getInstance(){
        return mInstance;
    }


}
