package com.haoxiujie.test2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02DateFormat {
    public static void main(String[] args) throws ParseException {
        // 获取方法：
        // public SimpleDateFormat(String pattern)：用给定的模式和默认语言环境的日期格式符号构造SimpleDateFormat。
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒 SSS毫秒");

        // 常用方法：
        // public String format(Date date)：将Date对象格式化为字符串。
        String format = df.format(new Date());
        System.out.println(format);
        // public Date parse(String source)：将字符串解析为Date对象。
        Date date = df.parse("1995年5月10日 21时18分29秒 336毫秒");
        System.out.println(date);
    }
}
