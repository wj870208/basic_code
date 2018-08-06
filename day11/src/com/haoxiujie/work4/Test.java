package com.haoxiujie.work4;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        InterA a1 = new InterA() {
            @Override
            public void showA() {
                System.out.println("第1种方法执行~");
            }
        };
        a.methodA(a1);
        System.out.println("============");

        class InterAImpl implements InterA {
            @Override
            public void showA() {
                System.out.println("第2种方法执行~");
            }
        }
        InterA a2 = new InterAImpl();
        a.methodA(a2);
    }
}
