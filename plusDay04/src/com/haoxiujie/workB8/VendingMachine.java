package com.haoxiujie.workB8;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class VendingMachine {
    //属性有机器名称、饮料列表（HashMap<String, Float>）、机内剩余现金总额（float类型）
    private String vMName;
    private HashMap<String, Float> yLList;
    private float shengYu;

    //传入钞票和饮料名称后，需要判断传入的钞票是否为真、面值是否足够购买此类饮料；
    //      若不符合购买条件给出错误提示，结束购买流程；
    //		若购买成功后需打印出找零金额和目前机内现金总额；

    public void buy(Money m, String s) {
        if (!m.isZhenJia()) {
            System.out.println("对不起，您的钱不是真的哦~");
            return;
        }
        Set<Map.Entry<String, Float>> entries = yLList.entrySet();
        for (Map.Entry<String, Float> entry : entries) {
            if (!s.equals(entry.getKey())) {
                continue;
            } else {
                if (m.getMianZhi() < entry.getValue()) {
                    System.out.println("对不起，您的钱不够哦~");
                    return;
                } else {
                    shengYu += entry.getValue();
                    System.out.println("您好，您购买了" + entry.getKey() + ", 找您" + (m.getMianZhi() - entry.getValue()) + "元。目前我有" + shengYu + "元了哦~");
                    return;
                }
            }
        }
        System.out.println("对不起，我没有这个哦~");
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "vMName='" + vMName + '\'' +
                ", yLList=" + yLList +
                ", shengYu=" + shengYu +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VendingMachine that = (VendingMachine) o;
        return Float.compare(that.shengYu, shengYu) == 0 &&
                Objects.equals(vMName, that.vMName) &&
                Objects.equals(yLList, that.yLList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vMName, yLList, shengYu);
    }

    public String getvMName() {
        return vMName;
    }

    public void setvMName(String vMName) {
        this.vMName = vMName;
    }

    public HashMap<String, Float> getyLList() {
        return yLList;
    }

    public void setyLList(HashMap<String, Float> yLList) {
        this.yLList = yLList;
    }

    public float getShengYu() {
        return shengYu;
    }

    public void setShengYu(float shengYu) {
        this.shengYu = shengYu;
    }

    public VendingMachine() {
    }

    public VendingMachine(String vMName, HashMap<String, Float> yLList, float shengYu) {
        this.vMName = vMName;
        this.yLList = yLList;
        this.shengYu = shengYu;
    }
}
