package com.haoxiujie.workB9;

public class Test {
    //1.定义一个储物柜类，创建储物柜对象，属性：柜子的容量；
    //	2.最大容量为20；为储物柜对象提供存物、取物方法；
    //	要求：
    //		(1)调用存放物品方法时，传入要存入的物品名称，判断储物柜是否有空余容量，有空余则提示存放物品成功，返回一个四位数的取货码。
    //		(2)调用取物方法时,传入取货码，打印出对应的物品名称，若无对应的物品则提示取货码不正确；
    public static void main(String[] args) {
        Guizi gz = new Guizi(5);
        int i = gz.cunFang("书包1");
        System.out.printf("您的取货码为：%04d\n", i);
        int i2 = gz.cunFang("书包2");
        System.out.printf("您的取货码为：%04d\n", i2);
        int i3 = gz.cunFang("书包3");
        System.out.printf("您的取货码为：%04d\n", i3);
        int i4 = gz.cunFang("书包4");
        System.out.printf("您的取货码为：%04d\n", i4);
        int i5 = gz.cunFang("书包5");
        System.out.printf("您的取货码为：%04d\n", i5);
        int i6 = gz.cunFang("书包6");
        System.out.printf("您的取货码为：%04d\n", i6);
        gz.quChu(i3);
    }
}
