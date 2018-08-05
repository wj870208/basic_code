package com.haoxiujie.work3;

public abstract class Animal {
    //属性:
    //			年龄
    //		行为:
    //			喝水,吃东西(吃什么不确定)
    private int age;

    public void hs(){
        System.out.println("喝水");
    }

    public abstract void cdx();//吃东西

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }
}
