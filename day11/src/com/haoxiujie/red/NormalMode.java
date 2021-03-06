package com.haoxiujie.red;

import java.util.ArrayList;

public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> ali = new ArrayList<>();
        int pj = totalMoney / totalCount;
        for (int i = 0; i < totalCount - 1; i++) {
            ali.add(pj);
            totalMoney -= pj;
        }
        ali.add(totalMoney);
        return ali;
    }
}
