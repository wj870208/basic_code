package com.haoxiujie.work3;

public class Test {
    //    创建饲养员对象,饲养员调用三次饲养方法:饲养狗,饲养羊,饲养青蛙
    public static void main(String[] args) {
        Syy syy = new Syy();
        Dog dog = new Dog();
        Yang yang = new Yang();
        Qw qw = new Qw();
        syy.cydw(dog);
        syy.cydw(qw);
        syy.cydw(yang);
    }
}
