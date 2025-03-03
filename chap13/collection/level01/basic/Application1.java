package com.LEGEND.chap13.collection.level01.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> scores = new ArrayList<>();

        while (true) {
            int score;
            while (true) {
                System.out.print("학생 성적 (0~100) : ");
                score = sc.nextInt();
                if (score >= 0 && score <= 100) {
                    break;
                }
                System.out.println("유효한 성적을 입력하세요 (0~100 사이). ");
            }
            scores.add(score);

            String yn;
            while (true) {
                System.out.print("추가 입력하려면 y, 종료하려면 n : ");
                yn = sc.next();
                if (yn.equalsIgnoreCase("y") || yn.equalsIgnoreCase("n")) {
                    break;
                }
                System.out.println("유효한 입력을 하세요 (y 또는 n). ");
            }

            if (yn.equalsIgnoreCase("n")) {
                break;
            }
        }

        int totalStudents = scores.size();
        double average = scores.stream().mapToInt(Integer::intValue).average().orElse(0.0);

        System.out.println("학생 인원 : " + totalStudents);
        System.out.println("평균 점수 : " + average);

    }
}
