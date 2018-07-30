package com.haoxiujie.day05.work;

public class B3 {
    public static void main(String[] args) {
        int oldArr[] = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
        int i = oldArr.length - sscx(0,oldArr);
        int[] newArr = new int[i];
        for (int o = 0,n=0; o < oldArr.length; o++) {
            if (oldArr[o] != 0){
                newArr[n] = oldArr[o];
                n++;
            }
        }
        System.out.println("-------------");
        for (int i1 : newArr) {
            System.out.print(i1+"\t");
        }
    }

    private static int sscx(int i, int[] oldArr) {
        int add = 0;
        for (int i1 : oldArr) {
            if(i1 == i ){
                add++;
            }
        }
        return add;
    }
}
