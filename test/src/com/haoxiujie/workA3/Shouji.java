package com.haoxiujie.workA3;

public abstract class Shouji {
    //包含空参、满参构造和以下成员变量
    //        名称name（ String 型）
    //        生成所有成员变量set/get方法
    //        定义抽象方法：void playMusic(Song song)
    private String name;

    public abstract void playMusic(Run song);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shouji() {
    }

    public Shouji(String name) {
        this.name = name;
    }
}
