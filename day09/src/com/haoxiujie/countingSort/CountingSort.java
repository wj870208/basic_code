package com.haoxiujie.countingSort;

public class CountingSort {

    public static int[] countingSort(int[] arr) {
        int[] c = new int[maxValue(arr) + 1];
        for (int i = 0; i < arr.length; i++) {
            c[arr[i]]++;
        }

        for (int i = 0, count = 0; i < c.length; i++) {
            while (c[i] > 0) {
                arr[count++] = i;
                c[i]--;
            }
        }
        return arr;
    }

    private static int maxValue(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
        return max;
    }
}