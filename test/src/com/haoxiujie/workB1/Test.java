package com.haoxiujie.workB1;

public class Test {
    public static void main(String[] args) {
        Person per = new Person("张三", 17);
        Fitness fitness = new Fitness() {
            @Override
            public void fitnessPlan(Plan p) {
                p.printPlan();
            }
        };
        per.startExercise(fitness);
    }
}

