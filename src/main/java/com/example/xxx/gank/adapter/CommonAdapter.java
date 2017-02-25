package com.example.xxx.gank.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by space on 2017/2/22.
 */

public abstract class CommonAdapter<T> extends RecyclerView.Adapter<CommonViewHolder> {

    /**
     * 数据
     */
    protected List<T> mDatas;
    protected Context mContext;
    /**
     * item地址
     */
    protected int mLayoutId;

    protected LayoutInflater mInflater;

    public CommonAdapter(List<T> mDatas, Context mContext, int mLayoutId) {
        this.mDatas = mDatas;
        this.mContext = mContext;
        this.mLayoutId = mLayoutId;
        this.mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public CommonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        return CommonViewHolder.get(mContext, parent, mLayoutId);
    }

    @Override
    public void onBindViewHolder(CommonViewHolder holder, int position) {

        convert(holder, mDatas.get(position));
    }

    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    public abstract void convert(CommonViewHolder viewHolder, T t);


}
