package com.haoxiujie.work3;

import java.util.Random;

public class Main {
    //定义String getStr()方法
    //		功能描述：
    //			获取长度为5的随机字符串
    //			字符串由随机的4个大写英文字母和1个0-9之间(包含0和9)的整数组成
    //			英文字母和数字的顺序是随机的
    public static void main(String[] args) {
        System.out.println(getStr());
    }

    public static String getStr() {
        Random rd = new Random();
        String str = "";
        int numNum = rd.nextInt(5);//数字出现的位置索引
        for (int i = 0; i < 5; i++) {
            if (i == numNum) {
                str = str + (char) (rd.nextInt(10) + 48);
            } else {
                str = str + (char) (rd.nextInt(26) + 65);
            }
        }
        return str;
    }
}
