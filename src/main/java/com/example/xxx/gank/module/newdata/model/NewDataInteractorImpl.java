package com.example.xxx.gank.module.newdata.model;

import com.example.xxx.gank.bean.BaseInfo;
import com.example.xxx.gank.bean.DayInfo;
import com.example.xxx.gank.bean.test;
import com.example.xxx.gank.callback.RequestUICallBack;
import com.example.xxx.gank.common.Url;
import com.example.xxx.gank.http.HttpManager;
import com.example.xxx.gank.http.gankService;
import com.example.xxx.gank.util.DateUtils;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

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
    public void getNewData(RequestUICallBack<BaseInfo<DayInfo>> callBack) {

        HttpManager httpManager = HttpManager.getInstance();

        gankService gankService1 = httpManager.get(Url.dayData).create(com.example.xxx.gank.http.gankService.class);

        Call<BaseInfo<DayInfo>> call = gankService1.getDayInfo(DateUtils.getYear(), DateUtils.getMonth(), "23");

        httpManager.send(call, callBack);
    }

    public void getTest(RequestUICallBack<test> callBack){

        HttpManager httpManager = HttpManager.getInstance();

        gankService gankService1 = httpManager.get(Url.dayData).create(com.example.xxx.gank.http.gankService.class);

        Call<test> call = gankService1.getTest(DateUtils.getYear(), DateUtils.getMonth(), "23");

        httpManager.send(call, callBack);
    }

    public List<DayInfo> getDayList(Response<BaseInfo> response) {
        List<DayInfo> list = new ArrayList<>();

        List<String> category = response.body().getCategory();

//        JSONObject json= (JSONObject) response.body().getResults();

//        Log.i("ddd",json.toString());

        return list;
    }
}
