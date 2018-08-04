package com.haoxiujie.work1;

public class Main {
    public static Object[] deleteSubString(String str1, String str2) {
        int count = 0;
        while (str1.indexOf(str2) != -1) {
            int begin = str1.indexOf(str2);
            str1 = str1.substring(0, begin) + str1.substring(begin + str2.length());
            count++;
        }
        Object[] obj = {str1, count};
        return obj;
    }

    public static void main(String[] args) {
        String str1 = "java woaijava,i like jajavava i enjoy java";
        String str2 = "java";
        Object[] obj = deleteSubString(str1, str2);
        System.out.println("[" + obj[0] + ", " + obj[1] + "]");
    }
}
