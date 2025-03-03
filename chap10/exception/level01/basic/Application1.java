package com.LEGEND.chap10.exception.level01.basic;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // 분자 입력
            System.out.print("분자 입력: ");
            int numerator = Integer.parseInt(scanner.nextLine());

            // 분모 입력
            System.out.print("분모 입력: ");
            int denominator = Integer.parseInt(scanner.nextLine());

            // 나눗셈 수행 및 결과 출력
            int result = numerator / denominator;
            System.out.println("결과: " + result);
        } catch (NumberFormatException e) {
            System.out.println("오류: 유효한 정수를 입력하세요.");
        } catch (ArithmeticException e) {
            System.out.println("오류: 0으로 나누는 것은 허용되지 않습니다.");
        } finally {
            System.out.println("실행이 완료되었습니다.");
        }

        scanner.close();
    }
}