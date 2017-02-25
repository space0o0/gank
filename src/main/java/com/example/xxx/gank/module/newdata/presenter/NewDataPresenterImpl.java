package com.example.xxx.gank.module.newdata.presenter;

import com.example.xxx.gank.base.BasePresenterImpl;
import com.example.xxx.gank.callback.RequestUICallBack;
import com.example.xxx.gank.module.newdata.model.NewDataInteractorImpl;
import com.example.xxx.gank.module.newdata.view.NewDataView;
import com.orhanobut.logger.Logger;

import retrofit2.Call;
import retrofit2.Response;

/**
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

        interactor.getNewData(new RequestUICallBack() {
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
            public void requestSuccess(Call call, Response response) {
                Logger.i("response",response.body().toString());
                mView.notifyAdapter();
            }
        });
    }
}
