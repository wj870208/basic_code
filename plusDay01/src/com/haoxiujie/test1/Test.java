package com.haoxiujie.test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test {
    //计算出生日期到现在有多少天
    //1.获取出生日期，并转换为时间戳格式
    //2.获取当前日期，并转换为时间戳格式
    //3.计算两者差值，转换为天
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入您的出生日期，格式为：yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //1.获取出生日期，并转换为时间戳格式
        long brithdayTime = sdf.parse(sc.next()).getTime();
        //2.获取当前日期，并转换为时间戳格式
        long nowtime = new Date().getTime();
        //3.计算两者差值，转换为天
        long time = nowtime - brithdayTime;
        System.out.println("您已出生：" + (time / 1000 / 60 / 60 / 24) + "天。");
    }
}
