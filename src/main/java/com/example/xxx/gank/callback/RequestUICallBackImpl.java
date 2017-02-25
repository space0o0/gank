package com.example.xxx.gank.callback;


import com.example.xxx.gank.base.BaseView;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by space on 16/6/15.
 */
public class RequestUICallBackImpl implements RequestUICallBack {

    BaseView mView;
    RequestUICallBack requestUICallBack;

    public RequestUICallBackImpl(BaseView mview) {
        this.mView = mview;

    }

    /**
     * 请求前调用
     */
    @Override
    public void beforeRequest() {
        requestUICallBack.beforeRequest();
    }

    /**
     * 请求完成调用
     */
    @Override
    public void requestComplete() {
        requestUICallBack.requestComplete();
    }

    /**
     * 请求错误调用
     *
     * @param call
     * @param t
     */
    @Override
    public void requestError(Call call, Throwable t) {
        requestUICallBack.requestError(call,t);
    }

    /**
     * 请求成功调用
     *
     * @param call
     * @param response
     */
    @Override
    public void requestSuccess(Call call, Response response) {
        if (mView==null){
            return;
        }

        requestUICallBack.requestSuccess(call,response);
    }

}
