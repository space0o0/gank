package com.example.xxx.gank.module.newdata.model;

import com.example.xxx.gank.callback.RequestUICallBack;

/**
 * Created by space on 2017/2/23.
 */

public interface NewDataInteractor {

    /**
     * 每日数据： http://gank.io/api/day/年/月/日
     *
     * example:
     *
     * http://gank.io/api/day/2015/08/06
     */

    /**
     * 获取当天内容
     */
    void getNewData(RequestUICallBack callBack);
}
