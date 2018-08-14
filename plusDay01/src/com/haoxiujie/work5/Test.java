package com.haoxiujie.work5;

public class Test {
    //	(1)打印由7，8，9三个数组成的三位数，要求该三位数中任意两位数字不能相同；
    //	(2)打印格式最后的三位数字以空格分隔，如789 798 879 897 978 987。
    //    注：要求使用StringBuilder来完成
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 7; i <= 9; i++)
            for (int j = 7; j <= 9; j++)
                for (int k = 7; k <= 9; k++) {
                    if (i != j && i != k && j != k) {
                        sb.append(i * 100 + j * 10 + k).append(" ");
                    }
                }
        System.out.println(sb);
    }
}
