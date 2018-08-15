package com.haoxiujie.work3;

import java.util.Calendar;
import java.util.Date;

public class Test {
    // 用程序判断2018年2月14日是星期几。
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        c.set(2018, 1, 14);
//        Date time = c.getTime();
//        System.out.println(time);
        int i = c.get(Calendar.DAY_OF_WEEK) - 1;
        if (i == 0) {
            i = 7;
        }
        System.out.println("2018年2月14日是星期" + i);

    }
}
