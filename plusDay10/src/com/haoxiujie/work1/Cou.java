package com.haoxiujie.work1;

import java.io.Serializable;

public class Cou implements Serializable {
    private int count;

    @Override
    public String toString() {
        return "Cou{" +
                "count=" + count +
                '}';
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Cou() {
    }

    public Cou(int count) {
        this.count = count;
    }

    private static final long serialVersionUID = 1L;
}
