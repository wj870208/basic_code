package com.haoxiujie.test20180903.work1.A3;

import java.util.Calendar;

public class Test {
    //用程序判断2018年2月14日是星期几
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        instance.set(2018, 1, 14);
        int i = instance.get(Calendar.DAY_OF_WEEK);
        System.out.println(i - 1);
    }
}
