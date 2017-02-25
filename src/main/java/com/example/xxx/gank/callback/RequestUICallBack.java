package com.example.xxx.gank.callback;

import retrofit2.Call;
import retrofit2.Response;

/**
 *在协议处理时，界面的显示处理
 * Created by space on 16/3/29.
 */
public interface RequestUICallBack<T> {

    /**
     * 请求前调用
     */
    void beforeRequest();

    /**
     * 请求完成调用
     */
    void requestComplete();

    /**
     * 请求错误调用
     * @param call
     * @param t
     */
    void requestError(Call call, Throwable t);

    /**
     * 请求成功调用
     * @param call
     * @param response
     */
    void requestSuccess(Call call, Response response);
}
