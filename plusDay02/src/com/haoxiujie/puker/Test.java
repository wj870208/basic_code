package com.haoxiujie.puker;
    /*
        1.准备牌
        2.洗牌
        3.发牌
     */

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        PukerList[] users = new PukerList[3];

        // 0.上座
        for (int i = 0; i < 3; i++) {
            System.out.print("请输入user" + (i + 1) + "的姓名：");
            users[i] = new PukerList(sc.nextLine());
        }

        // 1.准备牌
        PukerList pukers = new PukerList("源牌");
        pukers.add(new Puker("大王"));
        pukers.add(new Puker("小王"));
        String[] hs = {"♥", "♣", "♦", "♠"};
        String[] sz = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (String h : hs) {
            for (String s : sz) {
                pukers.add(new Puker(h, s));
            }
        }
        // 2.洗牌
        Collections.shuffle(pukers);

        // 3.发牌
        PukerList sys = new PukerList("底牌");

        for (int i = 0; i < pukers.size(); i++) {
            if (i >= pukers.size() - 3) {
                sys.add(pukers.get(i));
            } else {
                users[i % 3].add(pukers.get(i));
            }
        }
        // 整理牌
        for (PukerList user : users) {
            user.sort();
        }
        sys.sort();

        // 看牌
        for (PukerList user : users) {
            System.out.println(user);
        }
        System.out.println("开始叫地主...");

        // 叫分
        int begin = rd.nextInt(3);
        int[] jf = new int[3];
        int maxjf = 0;
        int maxjfuser = -1;
        System.out.println("从" + users[begin].getName() + "开始叫分！");
        for (int i = begin; i < begin + 3; i++) {
            System.out.print("请" + users[i % 3].getName() + "叫分：");
//            jf[i % 3] = sc.nextInt();
            int tempjf;
            do {
                tempjf = sc.nextInt();
                if (tempjf < 0 || tempjf > 3) {
                    System.out.print("请重新输入0-3之间的分：");
                }
            } while (tempjf < 0 || tempjf > 3);
            jf[i % 3] = tempjf;
            if (jf[i % 3] > maxjf) {
                maxjf = jf[i % 3];
                maxjfuser = i % 3;
                if (maxjf == 3) {
                    break;
                }
            }
        }
        System.out.println("地主为：" + users[maxjfuser].getName() + "!");
        System.out.println(sys);
        for (Puker sy : sys) {
            users[maxjfuser].add(sy);
        }
        sys.clear();

        Collections.sort(users[maxjfuser]);

        // 看牌
        for (PukerList user : users) {
            System.out.println(user);
        }
    }


}