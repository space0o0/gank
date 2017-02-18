package com.example.xxx.gank.component;

import android.content.Context;
import android.widget.Toast;

/**
 *
 * Created by space on 16/3/18.
 */
public class SpaceToast {

    protected static Toast theSpaceToast = null;

    private static void setMsg(Context context, String msg,int duration) {

        if (theSpaceToast == null) {
            theSpaceToast =Toast.makeText(context,msg,duration);
        }else
        {
            theSpaceToast.setText(msg);
        }

        theSpaceToast.show();
    }

    /**
     * toast默认--Toast.LENGTH_LONG
     * @param context
     * @param msg
     */
    public static void show(Context context,String msg){
        setMsg(context, msg, Toast.LENGTH_LONG);
    }

    /**
     * 可设置toast的显示时常
     * @param context
     * @param msg
     * @param duration
     */
    public static void show(Context context,String msg,int duration){
        setMsg(context,msg,duration);
    }

}
