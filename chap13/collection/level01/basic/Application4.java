package com.LEGEND.chap13.collection.level01.basic;

import java.util.HashSet;
import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        HashSet<String> studentIDs = new HashSet<>();  // 중복 방지를 위한 HashSet 사용
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("학생 ID 입력('exit' 입력 시 종료): ");
            String id = sc.nextLine().trim(); // 공백 제거

            if (id.equalsIgnoreCase("exit")) {
                break;
            }

            // 중복 확인 후 추가
            if (studentIDs.contains(id)) {
                System.out.println("이미 등록 된 ID입니다.");
            } else {
                studentIDs.add(id);
                System.out.println("ID가 추가 되었습니다.");
            }
        }

        // 최종 ID 목록 출력 (정렬)
        System.out.println("모든 학생의 ID : " + studentIDs);
    }
}