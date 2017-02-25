package com.example.xxx.gank.adapter;

import android.content.Context;
import android.view.ViewGroup;

import java.util.List;

/**
 * 多种item的adapter
 * Created by space on 2017/2/23.
 */

public abstract class MultiItemCommonAdapter<T> extends CommonAdapter<T> {

    protected MultiItemTypeSupport<T> multiItemTypeSupport;


    public MultiItemCommonAdapter(List mDatas, Context mContext, MultiItemTypeSupport<T> multiItemTypeSupport) {
        super(mDatas, mContext, -1);

        this.multiItemTypeSupport = multiItemTypeSupport;
    }

    @Override
    public CommonViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        int layoutId = multiItemTypeSupport.getLayoutId(viewType);

        return CommonViewHolder.get(mContext, parent, layoutId);
    }

    @Override
    public int getItemViewType(int position) {

        return multiItemTypeSupport.getItemViewType(position, mDatas.get(position));
    }
}
