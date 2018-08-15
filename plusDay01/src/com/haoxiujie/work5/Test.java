package com.haoxiujie.work5;

public class Test {
    //	(1)打印由7，8，9三个数组成的三位数，要求该三位数中任意两位数字不能相同；
    //	(2)打印格式最后的三位数字以空格分隔，如789 798 879 897 978 987。
    //    注：要求使用StringBuilder来完成
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int[] i = {7, 8, 9};
        for (int i1 : i) {
            for (int i2 : i) {
                for (int i3 : i) {
                    if (i1 != i2 && i1 != i3 && i2 != i3) {
                        sb.append(i1).append(i2).append(i3).append(" ");
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
