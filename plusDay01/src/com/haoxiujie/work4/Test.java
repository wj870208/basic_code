package com.haoxiujie.work4;

public class Test {
    //	(1)定义数字字符串数组{"010","3223","666","7890987","123123"}；
    //	(2)判断该数字字符串数组中的数字字符串是否是对称(第一个数字和最后一个数字相等，第二个数字和倒数第二个数字是相等的，依次类推)的，并逐个输出；
    //	(3)如：010 是对称的，3223 是对称的，123123 不是对称的；
    //	(4)最终打印该数组中对称字符串的个数。
    //    注：判断对称可用StringBuilder中的reverse(),将此字符序列用其反转形式取代。
    public static void main(String[] args) {
        String[] s = {"010", "3223", "666", "7890987", "123123" };
        for (int i = 0; i < s.length; i++) {
            StringBuilder sb = new StringBuilder(s[i]);
            if (s[i].equals(sb.reverse().toString())) {
                System.out.println(s[i] + "是对称的");
            } else {
                System.out.println(s[i] + "是不对称的");
            }
        }
    }
}
