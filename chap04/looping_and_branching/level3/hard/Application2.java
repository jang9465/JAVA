package com.LEGEND.chap04.looping_and_branching.level3.hard;

import java.util.Random;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int num2 = random.nextInt(100) + 1;
        int num = 0;
        int a = 0;

        while (num != num2) {
            for (int i = 0; i < 1; i++) {
                System.out.print("정수를 입력하세요 : ");
                num = sc.nextInt();
                a++;

                if (num > num2) {
                    System.out.println("입력하신 정수보다 작습니다.");
                } else if (num < num2) {
                    System.out.println("입력하신 정수보다 큽니다.");
                } else {
                    System.out.println("정답입니다. " + a + "회만에 정답을 맞추셨습니다.");
                }
            }
        }

    }
}
