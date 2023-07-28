package com.dp.test;

import java.text.DecimalFormat;

public class Demo0511 {
    public static void main(String[] args) {
        //左移 2的n次幂
        System.out.println(1<<4);

        //
        DecimalFormat df = new DecimalFormat("#.000");
        System.out.println("#.000："+df.format(113.09));

        DecimalFormat df2 = new DecimalFormat("#.###");
        System.out.println("#.###："+df2.format(113.09));
    }
}
