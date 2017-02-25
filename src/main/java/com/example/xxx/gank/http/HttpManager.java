package com.example.xxx.gank.http;


import com.example.xxx.gank.callback.RequestUICallBack;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * 使用retrofit2网络库
 * 1、单例
 * 2、post,get基本方法
 * 3、
 * Created by space on 2017/2/23.
 */

public class HttpManager {

    Callback callback;
    OkHttpClient client;

    public HttpManager() {

        OkHttpClient.Builder builder = new OkHttpClient().newBuilder();

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        builder.interceptors().add(interceptor);
        client = builder.build();

    }

    private final static HttpManager httpManager = new HttpManager();

    public static HttpManager getInstance() {
        return httpManager;
    }

    public Retrofit get(String url) {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(url)
                .client(client)
                .build();

        return retrofit;
    }


    /**
     * 发送请求 gogogo
     *
     * @param call
     * @param uiCallBack
     */
    public void send(Call call, final RequestUICallBack uiCallBack) {

        uiCallBack.beforeRequest();

        call.enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) {

                uiCallBack.requestSuccess(call, response);
            }

            @Override
            public void onFailure(Call call, Throwable t) {

                uiCallBack.requestError(call, t);
            }
        });


    }


}
