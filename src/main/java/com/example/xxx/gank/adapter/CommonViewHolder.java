package com.example.xxx.gank.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by space on 2017/2/22.
 */

public class CommonViewHolder extends RecyclerView.ViewHolder {

    private SparseArray<View> mViews;
    private View mConvertView;
    private Context mContext;

    public CommonViewHolder(View itemView, View mConvertView, Context mContext) {
        super(itemView);
        this.mConvertView = mConvertView;
        this.mContext = mContext;
        mViews = new SparseArray<>();
    }

    public static CommonViewHolder get(Context context, ViewGroup parent, int layoutId) {
        View itemView = LayoutInflater.from(context).inflate(layoutId, parent, false);

        return new CommonViewHolder(itemView, parent, context);
    }

    /**
     * 通过viewId获取控件
     *
     * @param viewId 控件id
     * @param <T>
     * @return
     */
    public <T extends View> T getView(int viewId) {
        View view = mViews.get(viewId);

        if (view == null) {
            view = mConvertView.findViewById(viewId);
            mViews.put(viewId, view);
        }

        return (T) view;
    }

    /**
     * 设置textview显示内容
     *
     * @param viewId textview的id int
     * @param text   显示内容 string
     * @return 当前textview
     */
    public TextView setText(int viewId, String text) {

        TextView tv = getView(viewId);
        tv.setText(text);

        return tv;
    }

    /**
     * 设置imageview的资源
     *
     * @param viewId imageview的id int
     * @param res    图片资源 int
     * @return 当前imageview
     */
    public ImageView setImageResource(int viewId, int res) {

        ImageView img = getView(viewId);
        img.setImageResource(res);
        return img;
    }


}
