package com.haoxiujie.red;

import java.util.ArrayList;
import java.util.Random;

public class Sqhb implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> ali = new ArrayList<>();
        Random rd = new Random();
        // 除最后一个外，每个红包的大小范围为1~平均值*2
        for (int i = 0; i < totalCount - 1; i++) {
            int hb = rd.nextInt(2 * totalMoney / totalCount) + 1;
            ali.add(hb);
            totalMoney -= hb;
        }
        ali.add(totalMoney);
        return ali;
    }
}
