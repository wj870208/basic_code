package com.haoxiujie.test1;

import java.util.stream.Stream;

public class Test {
    //1. 第一个队伍只要名字为3个字的成员姓名；存储到一个新集合中。
    //2. 第一个队伍筛选之后只要前3个人；存储到一个新集合中。
    //3. 第二个队伍只要姓张的成员姓名；存储到一个新集合中。
    //4. 第二个队伍筛选之后不要前2个人；存储到一个新集合中。
    //5. 将两个队伍合并为一个队伍；存储到一个新集合中。
    //6. 根据姓名创建Person 对象；存储到一个新集合中。
    //7. 打印整个队伍的Person对象信息。
    public static void main(String[] args) {
        String[] team1 = {"迪丽热巴", "宋远桥", "苏星河", "石破天", "石中玉", "老子", "庄子", "洪七公"};
        Stream<String> stream1 = Stream.of(team1).filter(name -> name.length() == 3).limit(3);
        String[] team2 = {"古力娜扎", "张无忌", "赵丽颖", "张三丰", "尼古拉斯赵四", "张天爱", "张二狗"};
        Stream<String> stream2 = Stream.of(team2).filter(name -> name.startsWith("张")).skip(2);
        Stream<String> concat = Stream.concat(stream1, stream2);
        concat.map(name -> new Person(name)).forEach(p -> System.out.println(p));
    }
}
