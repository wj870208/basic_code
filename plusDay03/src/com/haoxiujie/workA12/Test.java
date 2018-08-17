package com.haoxiujie.workA12;

import java.util.LinkedHashSet;
import java.util.Random;

public class Test {
    //十二、双色球规则：双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
    //      红色球号码从1—33中选择；蓝色球号码从1—16中选择；
    //      请随机生成一注双色球号码。（要求同色号码不重复）
    public static void main(String[] args) {
        LinkedHashSet<Integer> red = new LinkedHashSet<>();
        LinkedHashSet<Integer> blue = new LinkedHashSet<>();
        Random rd = new Random();
        while (red.size() < 6) {
            red.add(rd.nextInt(33) + 1);
        }
        blue.add(rd.nextInt(16) + 1);
        System.out.println(red + " + " + blue);

    }
}
