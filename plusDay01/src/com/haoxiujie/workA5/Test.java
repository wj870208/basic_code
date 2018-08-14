package com.haoxiujie.workA5;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    //五、请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,如2088-08-08 08:08:08。
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = df.format(date);
        System.out.println(format);
    }
}
