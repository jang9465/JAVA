package com.LEGEND.chap05.array.level02.normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 하나 입력하세요 : ");
        String str = sc.nextLine();
        char[] carr = str.toCharArray();
        System.out.print("검색할 문자를 입력하세요 : ");
        String str2 = sc.nextLine();
        char search = str2.charAt(0);
        int a = 0;

        for (int i = 0; i < str.length(); i++) {
            if (carr[i] == search) {
                a++;
            }
        }


        System.out.println("입력하신 문자열 " + str + "에서 찾으시는 문자 " + str2 + "은 " + a + "개 입니다.");
    }
}
