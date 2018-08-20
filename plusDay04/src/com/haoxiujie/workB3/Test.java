package com.haoxiujie.workB3;

import java.util.HashSet;
import java.util.Random;

public class Test {
    //1.产生10个1-20之间的随机数要求随机数不能重复
    //	2.产生10个长度为10的不能重复的字符串(里面只能出现大写字母、小写字母、0-9的数字)，
    // 并遍历打印输出
    public static void main(String[] args) {
        Random rd = new Random();
        HashSet<Integer> intSet = new HashSet<>();
        while (intSet.size() < 10) {
            intSet.add(rd.nextInt(20) + 1);
        }
        System.out.println(intSet);

        //产生10个长度为10的不能重复的字符串(里面只能出现大写字母、小写字母、0-9的数字)，
        HashSet<String> strSet = new HashSet<>();
        while (strSet.size() < 10) {
            strSet.add(rdString(10));
        }
        System.out.println(strSet);
    }

    private static String rdString(int length) {
        StringBuilder sb = new StringBuilder();
        Random rd = new Random();
        while (sb.length() < length) {
            char c = (char) (rd.nextInt());
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9'))
                sb.append(c);
        }
        return sb.toString();
    }
}
