package com.example.xxx.gank.http;

import com.example.xxx.gank.bean.DataInfo;
import com.example.xxx.gank.bean.DayInfo;
import com.example.xxx.gank.bean.FundBean;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * gank/io的请求
 * <p>
 * Created by space on 2017/2/10.
 */

public interface gankService {

    /**
     * 获取每日数据
     * @param year
     * @param month
     * @param day
     * @return
     */
    @GET("{year}/{month}/{day}")
    Call<DayInfo> getDayInfo(@Path("year") String year, @Path("month") String month, @Path("day") String day);


    @GET("{content}/{count}/{page}")
    Call<DataInfo> getDataInfo(@Path("content") String content,@Path("count") String count,@Path("page") String page);

    @POST("/")
    Call<FundBean> getFund(@Body RequestBody body);
}
