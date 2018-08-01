package com.haoxiujie;

public class StringDemo {
    public static void main(String[] args) {
        String str1 = "黑马程序员";
        String str2 = "程序员";
        //获取某个字符串在另外一个字符串中第一次出现的索引的位置
        str1.indexOf(str2);
        System.out.println(str1.indexOf(str2));

        //获得某个字符串指定索引位置的字符
        str1.charAt(2);
        System.out.println(str1.charAt(2));

        //把某个字符串从index索引开始截取到最后
        str1.substring(2);
        System.out.println(str1.substring(2));

        //把某个字符串索引start到索引end截取出来
        str1.substring(2,4);
        System.out.println(str1.substring(2,4));

        //把字符串转化成字符数组
        char[] ch1 = str1.toCharArray();
        System.out.println(ch1);

        //把字符串转化成字节数组
        byte[] b1 = str1.getBytes();
        System.out.println(b1);

        //获得字符串的长度
        int length = str1.length();
        System.out.println(length);

        //获取某个字符在字符串中第一次出现的索引
        int ch2 = str1.indexOf('马');
        System.out.println(ch2);

    }
    //把字符串中的字符'a'全部替换成'b'
    //判断一个字符串(比如"sjasd")中是否包含某个字符串(比如"ja")
    //判断一个字符串是否以某个字符串开头
    //判断一个字符串是否以某个字符串结尾
    //把一个字符串中所有的php替换成java
    //把字符串中所有字母变大写
    //把字符串中所有字母变小写
    //怎么办一个字符数组的一部分转化为String类型
    //把一个字符数组转化为String
}
