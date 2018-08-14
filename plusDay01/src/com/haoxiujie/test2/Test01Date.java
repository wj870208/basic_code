package com.haoxiujie.test2;

import java.util.Date;

public class Test01Date {
    public static void main(String[] args) {
        //构造方法：
        //public Date()：分配Date对象并初始化此对象，以表示分配它的时间（精确到毫秒）。
        Date d1 = new Date();//当前系统时间
        //public Date(long date)：分配Date对象并初始化此对象，以表示这个时间戳的时间。
        Date d2 = new Date(1000503017133L);

        //常见方法：
        //public long getTime() 把日期对象转换成对应的时间毫秒值。
        long time = d1.getTime();
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(time);
    }
}
