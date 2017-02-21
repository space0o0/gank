package com.example.xxx.gank.util;

import java.util.Calendar;

/**
 * Created by space on 2017/2/21.
 */

public class DateUtils {

    /**
     * 获取 年
     * @return
     */
    public static String getYear(){
        Calendar calendar=Calendar.getInstance();

        int year=calendar.get(Calendar.YEAR);

        return String.valueOf(year);
    }

    /**
     * 获取 月
     * @return
     */
    public static String getMonth(){
        Calendar calendar=Calendar.getInstance();

        int month=calendar.get(Calendar.MONTH);

        return String.valueOf(month);
    }

    /**
     * 获取 日
     * @return
     */
    public static String getDay(){
        Calendar calendar=Calendar.getInstance();

        int day=calendar.get(Calendar.DAY_OF_MONTH);

        return String.valueOf(day);
    }
}
