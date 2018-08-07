package com.haoxiujie.red;

public class Bootstrap {
    public static void main(String[] args) {
        Myred myred = new Myred("抢红包");
//        设置群主名称
        myred.setOwnerName("H");
////            普通
//        OpenMode normal = new NormalMode();
//        myred.setOpenWay(normal);
        //手气红包
        OpenMode sqhb = new Sqhb();
        myred.setOpenWay(sqhb);
    }
}
