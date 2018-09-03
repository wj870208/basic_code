package com.haoxiujie.test20180903.work1.A2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    //使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf1.parse("2018-03-04");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String newStr = sdf2.format(parse);
        System.out.println(newStr);
    }
}
