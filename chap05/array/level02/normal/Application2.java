package com.LEGEND.chap05.array.level02.normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;


        while(true){
            System.out.print("주민등록번호를 입력하세요 : ");
            num = sc.nextLine();
            if(num.length() == 14){
                break;
            }
            System.out.println("잘못된 주민등록번호 입니다. 다시 입력하세요.");
        }

        char[] carr = num.toCharArray();


        for (int i = 8; i < carr.length; i++) {
            carr[i] = '*';
        }

        System.out.println(new String(carr));
    }
}
