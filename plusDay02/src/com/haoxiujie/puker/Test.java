package com.haoxiujie.puker;
    /*
        1.准备牌
        2.洗牌
        3.发牌
     */

import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        // 1.准备牌
        PukerList pukers = new PukerList();
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
        PukerList user1 = new PukerList();
        PukerList user2 = new PukerList();
        PukerList user3 = new PukerList();
        PukerList sys = new PukerList();

        for (int i = 0; i < pukers.size(); i++) {
            if (i >= pukers.size() - 3) {
                sys.add(pukers.get(i));
            } else if (i % 3 == 0) {
                user1.add(pukers.get(i));
            } else if (i % 3 == 1) {
                user2.add(pukers.get(i));
            } else if (i % 3 == 2) {
                user3.add(pukers.get(i));
            }
        }
        // 整理牌
        Collections.sort(user1);
        Collections.sort(user2);
        Collections.sort(user3);
        Collections.sort(sys);

        // 看牌
        System.out.println("user1:" + user1);
        System.out.println("user2:" + user2);
        System.out.println("user3:" + user3);
        System.out.println("底牌:" + sys);
    }
}
