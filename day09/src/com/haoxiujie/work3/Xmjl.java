package com.haoxiujie.work3;

public class Xmjl extends Worker {
    private double jj;//奖金

    public double getJj() {
        return jj;
    }

    public void setJj(double jj) {
        this.jj = jj;
    }

    public Xmjl() {
    }

    public Xmjl(String name, int id, double gz, double jj) {
        super(name, id, gz);
        this.jj = jj;
    }

    @Override
    public String work() {
        return "组织项目";
    }//项目经理

}
