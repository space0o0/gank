package com.example.xxx.gank.component;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Window;
import android.widget.TextView;

import com.example.xxx.gank.R;
import com.example.xxx.gank.application.SpaceApplication;
import com.orhanobut.logger.Logger;


public class SpaceProcessDialog extends Dialog {

    protected static SpaceProcessDialog theYtfjrProcessDialog = null;

    public SpaceProcessDialog(Context context) {
        super(context);
    }

    public SpaceProcessDialog(Context context, int theme) {
        super(context, theme);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Logger.d("YtfjrProcessDialog", "Dialog created");

        setContentView(R.layout.space_dialog_progress);
        getWindow().getAttributes().gravity = Gravity.CENTER;
    }

    public static SpaceProcessDialog createDialog(Context context) {
        SpaceProcessDialog theYtfjrProcessDialog = new SpaceProcessDialog(context);
        theYtfjrProcessDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

        return theYtfjrProcessDialog;
    }

    public static void showLoading(Context context, boolean isLoading) {

        if (theYtfjrProcessDialog != null) {
            theYtfjrProcessDialog.dismiss();
            theYtfjrProcessDialog = null;
        }

        if (isLoading) {
            theYtfjrProcessDialog = createDialog(context);
            theYtfjrProcessDialog.show();
            theYtfjrProcessDialog.setCanceledOnTouchOutside(false);
        }
    }

    /**
     * [Summary]
     * setTitile 标题
     *
     * @param strTitle
     * @return
     */
    public SpaceProcessDialog setTitile(String strTitle) {
        return this;
    }

    /**
     * [Summary]
     * setMessage 提示内容
     *
     * @param strMessage
     * @return
     */
    public SpaceProcessDialog setMessage(String strMessage) {
        TextView tvMsg = (TextView) findViewById(R.id.wz_pt);

        if (tvMsg != null) {
            tvMsg.setText(strMessage);
        }

        return this;
    }


    public static void setIsLoading(final Activity activity, boolean isLoading) {
        if (isLoading) {
            SpaceApplication.getInstance().handler.post(new Runnable() {

                @Override
                public void run() {
                    // TODO 自动生成的方法存根
                    SpaceProcessDialog.showLoading(activity, true);
                }
            });
        } else {
            SpaceProcessDialog.showLoading(activity, false);
        }
    }


}
