package com.haoxiujie.work1;

import java.io.*;

public class Test {
    //实现一个验证程序运行次数的小程序，要求如下：
    //	1.当程序运行超过3次时给出提示:本软件只能免费使用3次,欢迎您注册会员后继续使用~
    //	2.程序运行演示如下:
    //		第一次运行控制台输出: 欢迎使用本软件,第1次使用免费~
    //		第二次运行控制台输出: 欢迎使用本软件,第2次使用免费~
    //		第三次运行控制台输出: 欢迎使用本软件,第3次使用免费~
    //		第四次及之后运行控制台输出:本软件只能免费使用3次,欢迎您注册会员后继续使用~
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File countFile = new File("plusDay10\\src\\com\\haoxiujie\\work1\\cou.txt");
        countFile.createNewFile();
        Cou cou;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(countFile))) {
            Object o = ois.readObject();
            cou = (Cou) o;
        } catch (EOFException e) {
            cou = new Cou(1);
        }

        int count = cou.getCount();
        if (count < 4) {
            System.out.println("欢迎使用本软件，第" + count + "次使用免费");
        } else {
            System.out.println("本软件只能免费使用3次，欢迎您注册会员后继续使用~");
            return;
        }
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(countFile));
        count++;
        cou.setCount(count);
        oos.writeObject(cou);
        oos.flush();
        oos.close();
    }
}
