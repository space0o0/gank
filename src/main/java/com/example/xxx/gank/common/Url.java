package com.example.xxx.gank.common;

/**
 * Created by space on 2017/2/10.
 */

public class Url {

    public static String baseUrl = "http://gank.io/api/";

    /**
     * 每日数据： http://gank.io/api/day/年/月/日
     * <p>
     * 例如: http://gank.io/api/day/2015/08/06
     */
    public static String dayData = baseUrl + "day/";

    /**
     * 随机数据：http://gank.io/api/random/data/分类/个数
     *
     * 数据类型：福利 | Android | iOS | 休息视频 | 拓展资源 | 前端
     * 个数： 数字，大于0
     * 例：http://gank.io/api/random/data/Android/20
     *
     */
    public static String randomData=baseUrl+"random/data/";


    public static String data=baseUrl+"data/";

}
