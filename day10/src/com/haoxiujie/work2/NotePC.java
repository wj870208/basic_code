package com.haoxiujie.work2;

public class NotePC {
    //2.定义笔记本类:
    //		开机功能
    //		关机功能
    //		定义使用USB设备的功能
    //		要求:既能使用鼠标也能使用键盘,使用USB功能内部调用开启和关闭功能

    public void openPC() {
        System.out.println("开机~");
    }

    public void useUSB(USB usb) {
        usb.open();
        usb.close();
    }

    public void closePC() {
        System.out.println("关机~");
    }
}
