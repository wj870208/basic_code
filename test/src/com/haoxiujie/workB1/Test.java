package com.haoxiujie.workB1;

public class Test {
    public static void main(String[] args) {
        Person per = new Person("张三",17);
        per.startExercise(class fitness implements Fitness{

            @Override
            public void fitnessPlan(Plan p) {
                p.printPlan();
            }
        });
    }
}

