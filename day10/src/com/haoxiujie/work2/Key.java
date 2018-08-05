package com.haoxiujie.work2;

public class Key implements USB {
    @Override
    public void open() {
        System.out.println("连接键盘的USB~");
    }

    @Override
    public void close() {
        System.out.println("断开键盘的USB~");
    }
}
