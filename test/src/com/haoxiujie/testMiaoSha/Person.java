package com.haoxiujie.testMiaoSha;

import java.util.Objects;

public class Person {//用户类
    //用户信息描述，包含字段（用户名称（String name）,
    // 用户联系方式（String tel），用户配送地址（String address）,
    // 购买商品是否需要配送（boolean dis））
    private String name;//用户名称
    private String tel;//联系方式
    private String address;//配送地址
    private boolean dis;//是否需要配送

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

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
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

    public Person(String name, String tel) {
        this.name = name;
        this.tel = tel;
        this.dis = false;
    }

    public Person(String name, String tel, String address) {
        this.name = name;
        this.tel = tel;
        this.address = address;
        this.dis = true;
    }
}
