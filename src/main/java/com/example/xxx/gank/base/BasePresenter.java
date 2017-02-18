package com.example.xxx.gank.base;

/**
 * Created by space on 16/3/18.
 * <p/>
 * presenter基类借口
 */
public interface BasePresenter<T> {

    void onResume();

    void onDestroy();

    void setView(T view);
}
