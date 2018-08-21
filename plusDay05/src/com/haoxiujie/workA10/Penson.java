package com.haoxiujie.workA10;

import java.util.Objects;

public class Penson {
    //    //在一款角色扮演游戏中,每一个人都会有名字和生命值;角色的生命值不能为负数
    //    //要求:当一个人物的生命值为负数的时候需要抛出自定的异常
    private String name;
    private int life;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Penson penson = (Penson) o;
        return life == penson.life &&
                Objects.equals(name, penson.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, life);
    }

    @Override
    public String toString() {
        return "Penson{" +
                "name='" + name + '\'' +
                ", life=" + life +
                '}';
    }

    public void setLife(int life) {
        try {
            isFuLife(life);
            this.life = life;
        } catch (FushuException e) {
            e.printStackTrace();
        }
    }

    public Penson() {
    }

    public Penson(String name, int life) {
        try {
            isFuLife(life);
            this.life = life;
        } catch (FushuException e) {
            e.printStackTrace();
        }
        this.name = name;
    }

    private static boolean isFuLife(int life) throws FushuException {
        if (life < 0) {
            throw new FushuException("错误: 生命值为负数~");
        }
        return true;
    }
}
