package com.example.xxx.gank.bean;

import java.util.List;

/**
 * 每日数据
 * Created by space on 2017/2/10.
 */

public class DayInfo {


    /**
     * _id : 587cd403421aa911912f52c7
     * createdAt : 2017-01-16T22:09:07.915Z
     * desc : Android 任意View边沿渐变透明(类似视频直播评论列表边沿处理)
     * images : ["http://img.gank.io/9fbf4dc7-3f14-4cba-9214-8c36f021abb9"]
     * publishedAt : 2017-01-23T11:35:32.450Z
     * source : web
     * type : Android
     * url : https://github.com/qinci/EdgeTranslucent
     * used : true
     * who : null
     */

    private List<AndroidBean> Android;
    /**
     * _id : 58632dce421aa94dc1ac0abd
     * createdAt : 2016-12-28T11:13:18.382Z
     * desc : iOS Runtime之七：拾遗
     * publishedAt : 2017-01-23T11:35:32.450Z
     * source : chrome
     * type : iOS
     * url : http://www.imlifengfeng.com/blog/?p=404
     * used : true
     * who : feng
     */

    private List<IOSBean> iOS;
    /**
     * _id : 5884baea421aa95ea7cbcf03
     * createdAt : 2017-01-22T22:00:10.857Z
     * desc : papi酱的春节街采——是时候回家过年啦
     * publishedAt : 2017-01-23T11:35:32.450Z
     * source : chrome
     * type : 休息视频
     * url : https://v.qq.com/x/cover/ldnrqe4xzfhqh2c/m0368hvk0pb.html
     * used : true
     * who : lxxself
     */

    private List<休息视频Bean> 休息视频;
    /**
     * _id : 5865ae1f421aa94dc1ac0ad3
     * createdAt : 2016-12-30T08:45:19.572Z
     * desc : 一个基于 Material Design 的前端框架，做的超棒。
     * publishedAt : 2017-01-23T11:35:32.450Z
     * source : chrome
     * type : 前端
     * url : https://github.com/zdhxiong/mdui
     * used : true
     * who : 代码家
     */

    private List<前端Bean> 前端;
    /**
     * _id : 5877056f421aa9316407fba7
     * createdAt : 2017-01-12T12:26:23.426Z
     * desc : 苹果电脑需要装杀毒软件吗？如果需要装什么最好？
     * publishedAt : 2017-01-23T11:35:32.450Z
     * source : chrome
     * type : 瞎推荐
     * url : https://www.zhihu.com/question/19913902/answer/31518377
     * used : true
     * who : LHF
     */

    private List<瞎推荐Bean> 瞎推荐;
    /**
     * _id : 58857746421aa95eae2d92b3
     * createdAt : 2017-01-23T11:23:50.64Z
     * desc : 1-23
     * publishedAt : 2017-01-23T11:35:32.450Z
     * source : chrome
     * type : 福利
     * url : http://7xi8d6.com1.z0.glb.clouddn.com/16124047_121657248344062_4191645221970247680_n.jpg
     * used : true
     * who : 代码家
     */

    private List<福利Bean> 福利;

    public List<AndroidBean> getAndroid() {
        return Android;
    }

    public void setAndroid(List<AndroidBean> Android) {
        this.Android = Android;
    }

    public List<IOSBean> getIOS() {
        return iOS;
    }

    public void setIOS(List<IOSBean> iOS) {
        this.iOS = iOS;
    }

    public List<休息视频Bean> get休息视频() {
        return 休息视频;
    }

    public void set休息视频(List<休息视频Bean> 休息视频) {
        this.休息视频 = 休息视频;
    }

    public List<前端Bean> get前端() {
        return 前端;
    }

    public void set前端(List<前端Bean> 前端) {
        this.前端 = 前端;
    }

    public List<瞎推荐Bean> get瞎推荐() {
        return 瞎推荐;
    }

    public void set瞎推荐(List<瞎推荐Bean> 瞎推荐) {
        this.瞎推荐 = 瞎推荐;
    }

    public List<福利Bean> get福利() {
        return 福利;
    }

    public void set福利(List<福利Bean> 福利) {
        this.福利 = 福利;
    }

    public static class AndroidBean {
        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private Object who;
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

        public Object getWho() {
            return who;
        }

        public void setWho(Object who) {
            this.who = who;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class IOSBean {
        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;

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
    }

    public static class 休息视频Bean {
        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;

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
    }

    public static class 前端Bean {
        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;

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
    }

    public static class 瞎推荐Bean {
        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;

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
    }

    public static class 福利Bean {
        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String source;
        private String type;
        private String url;
        private boolean used;
        private String who;

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
    }
}
