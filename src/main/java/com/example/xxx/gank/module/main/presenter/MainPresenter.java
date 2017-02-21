package com.example.xxx.gank.module.main.presenter;

import com.example.xxx.gank.base.BasePresenter;
import com.example.xxx.gank.module.main.view.MainView;

/**
 * Created by space on 2017/2/21.
 */

public interface MainPresenter extends BasePresenter<MainView> {

    /**
     * 获取每日数据
     */
    void getDayData();

    /**
     * 获取随机数据
     */
    void getRandomData();
}
