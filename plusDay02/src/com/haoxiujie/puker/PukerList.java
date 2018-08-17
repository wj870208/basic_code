package com.haoxiujie.puker;

import java.util.ArrayList;
import java.util.Iterator;

public class PukerList extends ArrayList<Puker> {

    @Override
    public String toString() {
        Iterator<Puker> iterator = this.iterator();
        if (!iterator.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (; ; ) {
            Puker p = iterator.next();
            sb.append(p.getName());
            if (!iterator.hasNext())
                return sb.append(']').toString();
            sb.append(',').append(' ');
        }
    }
}
