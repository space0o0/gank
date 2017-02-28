package com.example.xxx.gank.module.newdata.presenter;

import android.util.Log;

import com.example.xxx.gank.base.BasePresenterImpl;
import com.example.xxx.gank.bean.BaseInfo;
import com.example.xxx.gank.bean.DayInfo;
import com.example.xxx.gank.bean.test;
import com.example.xxx.gank.callback.RequestUICallBack;
import com.example.xxx.gank.module.newdata.model.NewDataInteractorImpl;
import com.example.xxx.gank.module.newdata.view.NewDataView;

import retrofit2.Call;
import retrofit2.Response;

/**
 *
 * Created by space on 2017/2/23.
 */

public class NewDataPresenterImpl extends BasePresenterImpl<NewDataView> implements NewDataPresenter {

    NewDataInteractorImpl interactor;

    public NewDataPresenterImpl(NewDataView mView) {
        super(mView);
        interactor = new NewDataInteractorImpl();
    }

    /**
     * 刷新
     */
    @Override
    public void refresh() {
        getData();
    }

    /**
     * 加载更多
     */
    @Override
    public void loadMore() {
        // TODO: 2017/2/25 没有加载更多

    }

    private void getData() {

        dayInfo();
//        test();

    }

    private void dayInfo(){
        interactor.getNewData(new RequestUICallBack<BaseInfo<DayInfo>>() {
            @Override
            public void beforeRequest() {

            }

            @Override
            public void requestComplete() {

            }

            @Override
            public void requestError(Call call, Throwable t) {

            }

            @Override
            public void requestSuccess(Call call, Response<BaseInfo<DayInfo>> response) {
                Log.i("response","/"+response.body().isError()+"/");
                Log.i("response","/"+response.body().getCategory().get(0)+"/");
//                Log.i("response","/"+response.body().getResults().getAndroid().get(0).getCreatedAt()+"/");

//                interactor.getDayList(response);

            }
        });
    }

    private void test(){
        interactor.getTest(new RequestUICallBack<test>() {
            @Override
            public void beforeRequest() {

            }

            @Override
            public void requestComplete() {

            }

            @Override
            public void requestError(Call call, Throwable t) {

            }

            @Override
            public void requestSuccess(Call call, Response<test> response) {

                Log.i("response","/"+response.body().getResults().getAndroid().get(0).getCreatedAt());
                Log.i("response","/"+response.body().getResults().getAndroid().get(0).getCreatedAt());
            }
        });
    }

}
