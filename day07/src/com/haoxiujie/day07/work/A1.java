package com.haoxiujie.day07.work;

import java.util.ArrayList;
import java.util.Random;

public class A1 {
    //    生成6个1~33之间的随机整数,添加到集合,并遍历
    public static void main(String[] args) {
        Random rd = new Random();
        ArrayList<Integer> arrl = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            arrl.add(rd.nextInt(33)+1);
        }

        for (int i = 0; i < arrl.size(); i++) {
            System.out.println(arrl.get(i));
        }
        arrl.trimToSize();
        System.out.println(arrl);
    }
}
