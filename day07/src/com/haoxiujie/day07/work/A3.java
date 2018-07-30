package com.haoxiujie.day07.work;


import java.util.Date;
import java.util.Scanner;

public class A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date d = new Date();
//        System.out.println(d.getTime());
        int x = (int)(d.getTime()%100)+1;
        for(;;){
            int a = sc.nextInt();
            System.out.print(a);
            if(a == x ){
                System.out.println("对了");
                return;
            }
            if (a>x){
                System.out.println("大了");
            }else {
                System.out.println("小了");
            }
        }
    }
}
