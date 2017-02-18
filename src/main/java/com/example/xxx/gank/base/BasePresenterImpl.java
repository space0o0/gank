package com.example.xxx.gank.base;


import com.example.xxx.gank.callback.RequestUICallBack;
import com.orhanobut.logger.Logger;

/**
 *
 * Created by space on 16/3/29.
 */
public class BasePresenterImpl<T extends BaseView> implements BasePresenter,RequestUICallBack {

    public T mView;

    public BasePresenterImpl(T mView) {
        this.mView = mView;
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {
        mView=null;
    }

    @Override
    public void setView(Object view) {
        mView= (T) view;
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
    public void requestError(String errorCode, Object errorData) {
        Logger.i("request Error", errorCode);
        mView.toast(errorCode);
        mView.hideProgress();
    }

    @Override
    public void requestSuccess(Object data) {

    }

    public T getmView() {
        return mView;
    }
}
