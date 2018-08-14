package com.haoxiujie.work2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {
    // 使用SimpleDateFormat类,把2018-03-04转换为2018年03月04日。
    public static void main(String[] args) throws ParseException {
        DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日");
        String format = df2.format(df1.parse("2018-03-04"));
        System.out.println(format);
    }
}
