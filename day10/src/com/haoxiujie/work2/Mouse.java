package com.haoxiujie.work2;

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("连接鼠标的USB~");
    }

    @Override
    public void close() {
        System.out.println("断开鼠标的USB~");
    }
    //3.定义鼠标类:
    //		要符合USB接口

}
