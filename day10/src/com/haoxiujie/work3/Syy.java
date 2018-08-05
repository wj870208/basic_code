package com.haoxiujie.work3;

public class Syy {
    //行为:
    //			饲养动物:包括吃饭和喝水
    public void cydw(Animal animal) {
        animal.hs();
        animal.cdx();
        if (animal instanceof Qw) {
            ((Qw) animal).yy();
        } else if (animal instanceof Dog) {
            ((Dog) animal).yy();
        }
        System.out.println();
    }
}
