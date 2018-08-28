package com.haoxiujie.test20180826.work1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class JiangPin {
    ArrayList<String> jp = new ArrayList<>();

    public JiangPin(String... str) {
        Collections.addAll(jp, str);
        this.jp = jp;
    }

    public String choujiang() {
        Random rd = new Random();
        int i = rd.nextInt(jp.size());
        return jp.remove(i);
    }

    public int shengyu() {
        return jp.size();
    }
}
