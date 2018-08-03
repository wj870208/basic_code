package com.haoxiujie.work4;

public class Dog extends Dw {
    //行为:
    //			eat(String something)方法,看家lookHome方法(无参数)

    @Override
    public String eat(String something) {
        return "吃" + something;
    }

    public Dog() {
    }

    public Dog(int age, String ys) {
        super(age, ys);
    }

    public String lookHome() {
        return "看家";
    }
}
