package com.LEGEND.chap04.conditional.level04.advanced;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // 점수 입력
            System.out.print("국어 점수를 입력하세요: ");
            int kor = sc.nextInt();
            System.out.print("영어 점수를 입력하세요: ");
            int eng = sc.nextInt();
            System.out.print("수학 점수를 입력하세요: ");
            int mat = sc.nextInt();

            // 평균 계산
            int avg = (kor + eng + mat) / 3;

            // 불합격 사유를 저장할 리스트
            List<String> reasons = new ArrayList<>();

            // 평균 미달 여부 확인
            if (avg < 60) {
                reasons.add("평균 점수 미달로 불합격입니다.");
            }

            // 개별 과목 기준 미달 여부 확인
            if (kor < 40) reasons.add("국어 점수 미달로 불합격입니다.");
            if (eng < 40) reasons.add("영어 점수 미달로 불합격입니다.");
            if (mat < 40) reasons.add("수학 점수 미달로 불합격입니다.");

            // 합격 여부 판단
            if (reasons.isEmpty()) {
                System.out.println("합격입니다!");
            } else {
                reasons.forEach(System.out::println);
            }
        }
    }
}
