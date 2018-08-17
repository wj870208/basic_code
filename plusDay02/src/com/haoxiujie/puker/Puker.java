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

    private void setId(byte id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public Puker(String name) {
        this.name = name;
        if (name.equals("大王")) {
            this.id = 17;
        } else {
            this.id = 16;
        }
    }

    public Puker(String hs, String sz) {
        StringBuilder name = new StringBuilder(hs);
        name.append(sz);
        this.name = name.toString();
        if (sz.equals("2")) {
            this.id = 15;
        } else if (sz.equals("A")) {
            this.id = 14;
        } else if (sz.equals("K")) {
            this.id = 13;
        } else if (sz.equals("Q")) {
            this.id = 12;
        } else if (sz.equals("J")) {
            this.id = 11;
        } else {
            this.id = Byte.valueOf(sz);
        }
    }

    @Override
    public int compareTo(Puker o) {
        int ct = 0;
        ct = o.getId() - this.getId();
        if (ct == 0) {
            ct = o.getName().indexOf(0) - this.getName().indexOf(0);
        }
        return ct;
    }
}