package com.haoxiujie.puker;

import java.util.Objects;

public class Puker implements Comparable<Puker> {
    private String name;
    private byte id;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Puker puker = (Puker) o;
        return Objects.equals(name, puker.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Puker{" +
                "name='" + name + '\'' +
                '}';
    }

    String getName() {
        return name;
    }

    private int getId() {
        return id;
    }

    Puker(String name) {
        this.name = name;
        if (name.equals("大王")) {
            this.id = 17;
        } else {
            this.id = 16;
        }
    }

    Puker(String hs, String sz) {
        this.name = hs + sz;
        switch (sz) {
            case "2":
                this.id = 15;
                break;
            case "A":
                this.id = 14;
                break;
            case "K":
                this.id = 13;
                break;
            case "Q":
                this.id = 12;
                break;
            case "J":
                this.id = 11;
                break;
            default:
                this.id = Byte.valueOf(sz);
                break;
        }
    }

    @Override
    public int compareTo(Puker o) {
        int ct = o.getId() - this.getId();
        if (ct == 0) {
            ct = o.getName().indexOf(0) - this.getName().indexOf(0);
        }
        return ct;
    }
}