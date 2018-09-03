package com.haoxiujie.test20180903.work1.A5;

public class Test {
    //(1)打印由7，8，9三个数组成的三位数，要求该三位数中任意两位数字不能相同；
    //		(2)打印格式最后的三位数字以空格分隔，如789 798 879 897 978 987。
    //    注：要求使用StringBuilder来完成
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int[] a = {7, 8, 9};
        for (int i : a) {
            for (int j : a) {
                for (int k : a) {
                    if ((i != j) && (i != k) && (j != k)) {
                        sb.append(i).append(j).append(k).append(" ");
                    }
                }
            }
        }
        System.out.println(sb.toString());
    }
}
