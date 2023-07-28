package com.dp.java.learn.xw.test0413;

import com.dp.java.learn.sub.utils.TimeUtil;

public class TimeDemo {
    public static void main(String[] args) {
        String date = "2023-04-12 10:09:00";
        String nDate = TimeUtil.getGMTFromUTC(date);
        System.out.println(nDate);

    }
}
