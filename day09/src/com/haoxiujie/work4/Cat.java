package com.haoxiujie.work4;

public class Cat extends Dw {
    //    行为:eat(String something)方法,逮老鼠catchMouse方法(无参数)
    @Override
    public String eat(String something) {
        return "吃" + something;
    }

    public Cat() {
    }

    public Cat(int age, String ys) {
        super(age, ys);
    }

    public String catchMouse() {
        return "逮老鼠";
    }
}
