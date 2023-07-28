package com.dp.java.learn.sub.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间工具类
 */
public class TimeUtil {

    /**
     *  UTC时间转换成北京时间
     * @param object 传过来的值
     * @return GTM时间
     */
    public static String getGMTFromUTC(Object object) {
        Date resDate = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            resDate = new Date(sdf.parse(object.toString()).getTime()+8*60*60*1000);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return sdf.format(resDate);
    }

}
