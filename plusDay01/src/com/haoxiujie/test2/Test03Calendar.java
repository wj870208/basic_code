package com.haoxiujie.test2;

import java.util.Calendar;

public class Test03Calendar {
    // Calendar日历类就是方便获取各个时间属性的
    public static void main(String[] args) {
        // 获取方法：
        // public static Calendar getInstance()：使用默认时区和语言环境获得一个日历
        Calendar cd = Calendar.getInstance();
        // 常用方法：
        // public int get(int field)：返回给定日历字段的值。
        int date = cd.get(Calendar.DATE);
        System.out.println(date);
        // public void set(int field, int value)：将给定的日历字段设置为给定值。
        cd.set(1995, 5, 10);
        System.out.println(cd.getTime());
        // public abstract void add(int field, int amount)：根据日历的规则，为给定的日历字段添加或减去指定的时间量。
        cd.add(Calendar.YEAR, 23);
        System.out.println(cd.getTime());
        // public Date getTime()：返回一个表示此Calendar时间值（从历元到现在的毫秒偏移量）的Date对象。
        System.out.println(cd.getTime());
        ;
    }
}
