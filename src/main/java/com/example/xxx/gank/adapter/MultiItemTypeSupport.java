package com.example.xxx.gank.adapter;

/**
 *
 * Created by space on 2017/2/23.
 */

public interface MultiItemTypeSupport<T> {

    int getLayoutId(int itemType);

    int getItemViewType(int position, T t);
}
