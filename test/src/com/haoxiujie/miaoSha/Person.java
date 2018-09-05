package com.haoxiujie.miaoSha;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Person implements Distributionable<Goods> {
    //用户信息描述，包含字段（用户名称（String name）,
    // 用户联系方式（String tel），用户配送地址（String address）,
    // 购买商品是否需要配送（boolean dis））
    private String name;
    private String tel;
    private String address;
    private boolean dis;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", dis=" + dis +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return dis == person.dis &&
                Objects.equals(name, person.name) &&
                Objects.equals(tel, person.tel) &&
                Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, tel, address, dis);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getTel() {
        return tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isDis() {
        return dis;
    }

    public void setDis(boolean dis) {
        this.dis = dis;
    }

    public Person(String name, String tel, String address) {
        this.name = name;
        this.tel = tel;
        this.address = address;
        this.dis = true;
    }

    public Person(String name, String tel) {
        this.name = name;
        this.tel = tel;
        this.address = null;
        this.dis = false;
    }

    public Person() {
    }

    @Override
    public void distribution(ArrayList<Goods> list) {//配送商品，参数为商品列表
        this.dis = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名：");
        this.name = sc.nextLine();
        System.out.print("请输入联系方式：");
        this.tel = setTel();
        System.out.print("请输入配送地址：");
        this.address = sc.nextLine();
        Tests.printTxt(this, list);
    }

    public void undeserving(ArrayList<Goods> list) {//不配送
        this.dis = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入用户名：");
        this.name = sc.nextLine();
        System.out.print("请输入联系方式：");
        this.tel = setTel();
        Tests.printTxt(this, list);
    }

    private static String setTel() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的联系电话：");
        String regex = "1[34578]\\d{9}";
        while (true) {
            String tel = sc.nextLine();
            boolean exeist = tel.matches(regex);
            if (!exeist) {
                System.out.println("您输入的手机号不存在,请重新输入:");
                continue;
            }
            return tel;
        }
    }
}
