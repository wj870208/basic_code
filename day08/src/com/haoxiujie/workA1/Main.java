package com.haoxiujie.workA1;

public class Main {
    //有如下字符串:"12ab","java","cd","Server78"
    //遍历这些字符串，如果字符串没有包含数字的，就将字符串中的小写字母转成大写字母并打印字符串
    public static void main(String[] args) {
        String[] str = {"12ab", "java", "cd", "Server78" };
        for (int i = 0; i < str.length; i++) {
            if (isNum(str[i]) == false) {
                System.out.println(str[i].toUpperCase());
            }
        }
    }

    public static boolean isNum(String str) {//判断字符串中是否包含数字，包含返回ture，不包含false
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                return true;
            }
        }
        return false;
    }
}
