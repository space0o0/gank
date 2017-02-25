package com.example.xxx.gank.module.newdata.model;

import com.example.xxx.gank.bean.DayInfo;
import com.example.xxx.gank.callback.RequestUICallBack;
import com.example.xxx.gank.common.Url;
import com.example.xxx.gank.http.HttpManager;
import com.example.xxx.gank.http.gankService;
import com.example.xxx.gank.util.DateUtils;

import retrofit2.Call;

/**
 * Created by space on 2017/2/23.
 */

public class NewDataInteractorImpl implements NewDataInteractor {
    /**
     * 每日数据： http://gank.io/api/day/年/月/日
     * <p>
     * example:
     * <p>
     * http://gank.io/api/day/2015/08/06
     */
    /**
     * 获取当天内容
     */
    @Override
    public void getNewData(RequestUICallBack callBack) {

        HttpManager httpManager = HttpManager.getInstance();

        gankService gankService1 = httpManager.get(Url.dayData).create(com.example.xxx.gank.http.gankService.class);

        Call<DayInfo> call = gankService1.getDayInfo(DateUtils.getYear(), DateUtils.getMonth(), "24");

        httpManager.send(call, callBack);
    }
}
