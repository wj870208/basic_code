package com.haoxiujie.work3;

class Outer {
    static class ShowImpl implements Inter {
        @Override
        public void show() {
            System.out.println("HelloWorld");
        }
    }

    public static ShowImpl method() {
//        Outer.ShowImpl s = new Outer().new ShowImpl();
        ShowImpl s = new ShowImpl();
        return s;
    }

}