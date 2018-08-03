package com.haoxiujie.work4;

public abstract class Dw {//动物类
    //属性：
    //			年龄，颜色
    //		行为:
    //			eat(String something)方法(无具体行为,不同动物吃的方式和东西不一样,
    // something表示吃的东西)
    //			生成空参有参构造，set和get方法
    private int age;
    private String ys;

    public abstract String eat(String something);

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getYs() {
        return ys;
    }

    public void setYs(String ys) {
        this.ys = ys;
    }

    public Dw(int age, String ys) {
        this.age = age;
        this.ys = ys;
    }

    public Dw() {
    }
}
