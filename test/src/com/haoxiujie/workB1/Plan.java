package com.haoxiujie.workB1;

public class Plan {
    private String ready;
    private String exercise;

    public void printPlan() {
        System.out.println("当次运动计划：热身：" + ready + ", 锻炼：" + exercise);
    }

    public String getReady() {
        return ready;
    }

    public void setReady(String ready) {
        this.ready = ready;
    }

    public String getExercise() {
        return exercise;
    }

    public void setExercise(String exercise) {
        this.exercise = exercise;
    }

    public Plan() {
    }

    public Plan(String ready, String exercise) {
        this.ready = ready;
        this.exercise = exercise;
    }
}
