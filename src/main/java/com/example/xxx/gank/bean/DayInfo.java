package com.example.xxx.gank.bean;

import java.util.List;

/**
 * 每日数据
 * Created by space on 2017/2/10.
 */

public class DayInfo {

    /**
     * _id : 58ad9714421aa957ef93531f
     * createdAt : 2017-02-22T21:50:12.922Z
     * desc : 基于官方ViewPager，支持水平方向上滑动和竖直方向上的滑动的ViewPager
     * images : ["http://img.gank.io/1ef8c97f-14a8-4a89-946b-46b9aa8bd3b9"]
     * publishedAt : 2017-02-24T11:47:11.416Z
     * source : web
     * type : Android
     * url : https://github.com/youngkaaa/YViewPagerDemo
     * used : true
     * who : 杨宽同学
     */

    private String _id;
    private String createdAt;
    private String desc;
    private String publishedAt;
    private String source;
    private String type;
    private String url;
    private boolean used;
    private String who;
    private List<String> images;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}
