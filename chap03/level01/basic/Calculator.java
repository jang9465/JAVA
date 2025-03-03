package com.LEGEND.chap03.level01.basic;

public class Calculator {
    public void checkMethod(){
        System.out.println("메소드 호출 확인");
    }

    public int sum1to10(){
        return sumTwoNumber(1,10);
    }

    public void checkMaxNumber(int a, int b){
        int max = Math.max(a, b);
        System.out.println("두 수 중 큰 수는 : " + max);

    }

    public int sumTwoNumber(int a, int b){
        return a + b;
    }
    public int minusTwoNumber(int a, int b){
        return a - b;
    }
}
