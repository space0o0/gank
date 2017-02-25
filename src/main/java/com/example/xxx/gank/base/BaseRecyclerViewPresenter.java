package com.example.xxx.gank.base;

/**
 * Created by space on 2017/2/23.
 */

public interface BaseRecyclerViewPresenter<T> extends BasePresenter {

    /**
     * 刷新
     */
    void refresh();

    /**
     * 加载更多
     */
    void loadMore();
}
