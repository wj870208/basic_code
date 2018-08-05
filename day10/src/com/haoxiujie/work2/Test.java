package com.haoxiujie.work2;

public class Test {
    public static void main(String[] args) {
        //创建电脑对象,依次调用开机方法,使用USB设备, 关机方法
        NotePC pc = new NotePC();
        pc.openPC();
        USB mouseUsb = new Mouse();
        USB keyUsb = new Key();
        mouseUsb.open();
        mouseUsb.close();
        keyUsb.open();
        keyUsb.close();
        pc.closePC();
    }
}
