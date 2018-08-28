package com.haoxiujie.workA3;

public class Test {
    public static void main(String[] args) {
        //猴子吃桃子问题，猴子第一天摘下若干个桃子，当即吃了快一半，还不过瘾，又多吃了一个。
        //      第二天又将仅剩下的桃子吃掉了一半，又多吃了一个。以后每天都吃了前一天剩下的一半多一个。
        //      到第十天，只剩下一个桃子。试求第一天共摘了多少桃子？
        int i = tZ(10);
        System.out.println(i);
    }

    // n=1  n=4  4+1*2
    private static int tZ(int i) {
        if (i == 1) {
            return 1;
        } else {
            return (tZ(i - 1) + 1) * 2;
        }
    }
}
