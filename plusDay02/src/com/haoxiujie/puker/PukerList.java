package com.haoxiujie.puker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class PukerList extends ArrayList<Puker> {
    private String name;

    PukerList(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void sort() {//排序
        Collections.sort(this);
    }

    @Override
    public String toString() {
        Iterator<Puker> iterator = this.iterator();
        if (!iterator.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append(this.getName()).append(": [");
        for (; ; ) {
            Puker p = iterator.next();
            sb.append(p.getName());
            if (!iterator.hasNext())
                return sb.append(']').toString();
            sb.append(',').append(' ');
        }
    }
}
