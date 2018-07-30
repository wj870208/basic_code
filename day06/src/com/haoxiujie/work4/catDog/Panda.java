package com.haoxiujie.work4.catDog;

/*
属性:
			名字 name
			性别 sex
		行为:
			发呆 asleep()
			卖萌 actingCute()
			吃 eat()
 */
public class Panda {
    private String name;//名字
    private boolean sex;//性别 公为true 母为false

    public void asleep() {
        System.out.println("发呆...");
    }

    public void actingCute() {
        System.out.println("卖萌...");
    }

    public void eat() {
        System.out.println("吃吃吃...");
    }

    public Panda() {
    }

    public Panda(String name, Boolean sex) {
        this.name = name;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String isSex() {
        if(this.sex){
            return "公";
        }
        return "母";
    }
}