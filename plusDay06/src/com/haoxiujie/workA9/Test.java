package com.haoxiujie.workA9;

public class Test {
    //1.这个山洞每次只能通过一个人，每个人通过山洞的时间为5秒；
    //2.随机生成10个人，同时准备过此山洞，并且定义一个变量用于记录通过隧道的人数。
    // 显示每次通过山洞人的姓名，和通过顺序；
    public static void main(String[] args) {
        Avern avern = new Avern();
        new Thread(avern, "张一").start();
        new Thread(avern, "张二").start();
        new Thread(avern, "张三").start();
        new Thread(avern, "张四").start();
        new Thread(avern, "张五").start();
        new Thread(avern, "张六").start();
        new Thread(avern, "张七").start();
        new Thread(avern, "张八").start();
        new Thread(avern, "张九").start();
        new Thread(avern, "张十").start();
    }
}
