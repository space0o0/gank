package com.example.xxx.gank.bean;

import java.util.List;

/**
 * Created by space on 2017/2/25.
 */

public class BaseInfo<T> {

    /**
     * category : ["瞎推荐","Android","拓展资源","福利","休息视频","iOS","App"]
     * error : false
     * results : {}
     */

    private boolean error;
    private T results;
    private List<String> category;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public T getResults() {
        return results;
    }

    public void setResults(T results) {
        this.results = results;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public static class T {
    }
}
