package com.haoxiujie.workA3;

public class Run {
    // 包含空参、满参构造和以下成员变量
    //        歌手 singer（String 型）
    //        歌名 name（ String 型）
    //        生成所有成员变量set/get方法
    private String singer;
    private String name;

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Run() {
    }

    public Run(String singer, String name) {
        this.singer = singer;
        this.name = name;
    }
}
