package com.haoxiujie.workB9;

import java.util.HashMap;
import java.util.Objects;
import java.util.Random;

public class Guizi {
    //     (1)调用存放物品方法时，传入要存入的物品名称，判断储物柜是否有空余容量，
    // 有空余则提示存放物品成功，返回一个四位数的取货码。
    //		(2)调用取物方法时,传入取货码，打印出对应的物品名称，若无对应的物品则提示取货码不正确；
    private HashMap<Integer, String> map = new HashMap<>();

    boolean quChu(int i) {
        if (!map.containsKey(i)) {
            System.out.println("提货码不正确");
            return false;
        }
        System.out.println("您即将取出：" + map.get(i));
        map.remove(i);
        return true;
    }

    public int cunFang(String s) {
        if (!(map.size() <= rongLiang)) {
            System.out.println("容量不足了哦~");
            return -1;
        }
        Random rd = new Random();
        int i = rd.nextInt(9999);
        while (map.containsKey(i)) {
            i = rd.nextInt(9999);
        }
        map.put(i, s);
        return i;
    }

    @Override
    public String toString() {
        return "Guizi{" +
                "rongLiang=" + rongLiang +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guizi guizi = (Guizi) o;
        return rongLiang == guizi.rongLiang;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rongLiang);
    }

    public int getRongLiang() {
        return rongLiang;
    }

    public void setRongLiang(int rongLiang) {
        this.rongLiang = rongLiang;
    }

    public Guizi() {
    }

    public Guizi(int rongLiang) {
        this.rongLiang = rongLiang;
    }

    //定义一个储物柜类，创建储物柜对象，属性：柜子的容量；
    private int rongLiang;
}
