package com.haoxiujie.test20180826.work1;

public class Test {
    public static void main(String[] args) {
        JiangPin jp = new JiangPin("魅族Pro", "畅玩6X", "坚果Pro 2", "小米 8", "IPhone X", "一加手机 7", "三星 Galaxy S9", "华为p10 Plus", "OPPO A77", "vivo NEX", "努比亚 Z17", "Moto Z Play");
        ChouJiangXiang c1 = new ChouJiangXiang(jp);
        ChouJiangXiang c2 = new ChouJiangXiang(jp);
        new Thread(c1, "抽奖箱1").start();
        new Thread(c2, "抽奖箱2").start();
    }
}
