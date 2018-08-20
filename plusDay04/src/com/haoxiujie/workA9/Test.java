package com.haoxiujie.workA9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test {
    //九、利用Map，完成下面的功能：
    //从命令行读入一个字符串，表示一个年份，输出该年的世界杯冠军是哪支球队。
    //          如果该 年没有举办世界杯，则输出：没有举办世界杯。
    ////tips:参阅Map接口containsKey(Object key)方法

    public static void main(String[] args) {
        HashMap<Integer, String> map = fifaDate();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份：");
        int year = sc.nextInt();
        if (!map.containsKey(year)) {
            System.out.println(year + "年没有举办世界杯");
        } else {
            System.out.println(year + "年的世界杯冠军是: " + map.get(year));
        }
        //十、在原有世界杯Map 的基础上，增加如下功能： 读入一支球队的名字，
        // 输出该球队夺冠的年份列表。 例如，读入“巴西”，应当输出 1958 1962 1970 1994 2002
        // 读入“荷兰”，应当输出 没有获得过世界杯
        ////tips:参阅Map接口containsValue(Object value)方法
        System.out.println("\n请输入一个国家名称：");
        String c = sc.next();
        if (!map.containsValue(c)) {
            System.out.println(c + " 没有获得过世界杯");
        } else {
            Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
            for (Map.Entry<Integer, String> entry : entrySet) {
                if (entry.getValue().equals(c)) {
                    System.out.print(entry.getKey() + " ");
                }
            }
        }
    }

    private static HashMap<Integer, String> fifaDate() {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1930, "乌拉圭");
        map.put(1934, "意大利");
        map.put(1938, "意大利");
        map.put(1950, "乌拉圭");
        map.put(1954, "西德");
        map.put(1958, "巴西");
        map.put(1962, "巴西");
        map.put(1966, "英格兰");
        map.put(1970, "巴西");
        map.put(1974, "西德");
        map.put(1978, "阿根廷");
        map.put(1982, "意大利");
        map.put(1986, "阿根廷");
        map.put(1990, "西德");
        map.put(1994, "巴西");
        map.put(1998, "法国");
        map.put(2002, "巴西");
        map.put(2006, "意大利");
        map.put(2010, "西班牙");
        map.put(2014, "德国");
        map.put(2018, "法国");
        return map;
    }
}
