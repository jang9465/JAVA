package com.LEGEND.chap04.looping_and_branching.level04.advanced;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열울 입력하세요 : ");
        String s = sc.nextLine();
        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();

        String result = "";
        int mod = num % 26; // 입력된 숫자를 알파벳 26자리로 끊음

        for(int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);

            if (temp >= 'a' && temp <= 'z') {
                temp = (char) ((temp - 'a' + mod) % 26 + 'a');
            } else if (temp >= 'A' && temp <= 'Z') {
                temp = (char) ((temp - 'A' + mod) % 26 + 'A');
            }
            result += temp;

        }

        System.out.println(result);
    }

}
