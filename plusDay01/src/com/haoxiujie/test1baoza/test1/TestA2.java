package com.haoxiujie.test1baoza.test1;

public class TestA2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int kj = 0;
        for (int i = 0; i < 303979700; i++) {
            int capacity = sb.capacity();
            if (capacity != kj) {
                kj = capacity;
                System.out.print(kj + ", ");
            }
            sb.append(" ");
        }
    }
}
