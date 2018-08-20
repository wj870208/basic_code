package com.haoxiujie.test20180818.test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ParseException {
        printDateOfYear(haveDate());
    }

    private static String haveDate() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    private static void printDateOfYear(String s) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(sdf.parse(s));
        int xq = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        if (xq == 0) {
            xq = 7;
        }
        System.out.println(calendar.get(Calendar.YEAR) + "年" + (calendar.get(Calendar.MONTH) + 1) + "月" + calendar.get(Calendar.DAY_OF_MONTH) + "日 是 星期" + xq + ", 是" + calendar.get(Calendar.YEAR) + "年的第" + calendar.get(Calendar.DAY_OF_YEAR) + "天");
    }
}