package com.haoxiujie.work2;

public class Main {
    //要求运行结果:
    //		学生需要学习!
    //		工人的工作是盖房子!
    //		学生干部喜欢开会!
    public static void main(String[] args) {
        Student student = new Student("学生", "男", 6, "马来西亚", "杭州电子科技大学", 187270001);
        Worker worker = new Worker("工人", "男", 28, "印度", "陶瓷厂", 27);
        StudentLeader studentLeader = new StudentLeader("学生干部", "女", 18, "中国", "浙江理工大学", 180010001, "班长");

        System.out.println(student.getName() + "需要" + student.work());
        System.out.println(worker.getName() + "的工作是" + worker.work());
        System.out.println(studentLeader.getName() + "喜欢" + studentLeader.meeting());
    }
}
