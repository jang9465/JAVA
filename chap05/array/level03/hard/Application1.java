package com.LEGEND.chap05.array.level03.hard;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        while(true){
            System.out.println("홀수인 양수를 입력하세요 : ");
            num = sc.nextInt();
            if(num > 0 && num % 2 == 1){
                break;
            }
            System.out.println("양수 혹은 홀수만 입력해야 합니다.");
        }

        int[] arr = new int[num];

        for(int i = 0; i < arr.length; i++){
            if(i < (arr.length/2)){
                arr[i] = i + 1;
            } else if (i > arr.length/2) {
                arr[i] = num - i;
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
