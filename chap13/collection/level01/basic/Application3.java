package com.LEGEND.chap13.collection.level01.basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Queue<String> watingName = new LinkedList<>();  // 대기열 (FIFO 방식)
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
            String name = sc.nextLine().trim(); // 공백 제거

            if (name.equalsIgnoreCase("exit")) {
                System.out.println("프로그램 종료");
                break;
            } else if (name.equalsIgnoreCase("next")) {
                if (watingName.isEmpty()) {
                    System.out.println("대기 고객이 없습니다.");
                } else {
                    System.out.println(watingName.poll() + " 고객님 차례입니다.");
                }
            } else {
                watingName.offer(name); // 대기열에 추가
                System.out.println(name + " 고객님 대기 등록 되었습니다.");
            }
        }
    }
}