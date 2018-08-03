package com.haoxiujie.work3;

public class Cxy extends Worker {
    public Cxy() {
    }

    public Cxy(String name, int id, double gz) {
        super(name, id, gz);
    }

    @Override
    public String work() {
        return "敲代码";
    }//程序员

}
