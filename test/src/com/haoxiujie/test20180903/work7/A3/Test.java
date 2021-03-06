package com.haoxiujie.test20180903.work7.A3;

public class Test {
    public static void main(String[] args) {
        //请分别使用Lambda【标准格式】及【省略格式】调用invokeCalc方法来计算130-120的结果
        invokeCalc(130, 120, (a, b) -> (a - b));

        invokeCalc(130, 120, (int a, int b) -> {
            return a - b;
        });
    }

    private static void invokeCalc(int a, int b, Calculator calculator) {
        int result = calculator.calc(a, b);
        System.out.println("结果是：" + result);
    }

}
