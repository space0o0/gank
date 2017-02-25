package com.example.xxx.gank.base;


import com.example.xxx.gank.callback.RequestUICallBack;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by space on 16/3/29.
 */
public class BasePresenterImpl<T extends BaseView> implements BasePresenter, RequestUICallBack {

    public T mView;

    public BasePresenterImpl(T mView) {
        this.mView = mView;
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {
        mView = null;
    }

    @Override
    public void setView(Object view) {
        mView = (T) view;
    }

    @Override
    public void beforeRequest() {
        mView.showProgress();
    }

    @Override
    public void requestComplete() {
        mView.hideProgress();
    }

    @Override
    public void requestError(Call call, Throwable t) {
        mView.hideProgress();
    }

    @Override
    public void requestSuccess(Call call, Response response) {
        mView.hideProgress();
    }

    public T getmView() {
        return mView;
    }
}
