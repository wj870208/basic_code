package com.haoxiujie.workB8;

import java.util.Objects;

public class Money {
    //    属性：面值、真假(boolean类型)
    private int mianZhi;
    private boolean zhenJia;

    @Override
    public String toString() {
        return "Money{" +
                "mianZhi=" + mianZhi +
                ", zhenJia=" + zhenJia +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return mianZhi == money.mianZhi &&
                zhenJia == money.zhenJia;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mianZhi, zhenJia);
    }

    public int getMianZhi() {
        return mianZhi;
    }

    public void setMianZhi(int mianZhi) {
        this.mianZhi = mianZhi;
    }

    public boolean isZhenJia() {
        return zhenJia;
    }

    public void setZhenJia(boolean zhenJia) {
        this.zhenJia = zhenJia;
    }

    public Money() {
    }

    public Money(int mianZhi, boolean zhenJia) {
        this.mianZhi = mianZhi;
        this.zhenJia = zhenJia;
    }
}
