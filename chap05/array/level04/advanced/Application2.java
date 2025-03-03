package com.LEGEND.chap05.array.level04.advanced;

import java.util.Random;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // 4자리 난수 배열 생성 (중복 없는 0~9)
        int[] answer = new int[4];
        int arr = 0;
        while(arr < 4) {
            int rand = random.nextInt(10); // 0 ~ 9 난수 생성
            boolean duplicate = false;
            for (int i = 0; i < arr; i++) {
                if(answer[i] == rand) {
                    duplicate = true;
                    break;
                }
            }
            if(!duplicate) {
                answer[arr++] = rand;
            }
        }

        // 기회는 총 10번
        int chances = 10;
        boolean isCorrect = false;

        // 게임 루프
        while(chances > 0 && !isCorrect) {
            System.out.println(chances + "회 남으셨습니다.");
            System.out.print("4자리 숫자를 입력하세요 : ");
            String input = sc.nextLine();

            // 입력이 4자리 정수가 아니면 기회 차감 없이 재입력 받음.
            if(input.length() != 4 || !input.matches("\\d{4}")) {
                System.out.println("4자리의 정수를 입력해야 합니다.");
                continue;
            }

            // 사용자가 입력한 숫자를 정수 배열로 변환
            int[] guess = new int[4];
            for (int i = 0; i < 4; i++) {
                guess[i] = input.charAt(i) - '0';
            }

            int strike = 0;
            int ball = 0;
            // 스트라이크와 볼 계산
            for (int i = 0; i < 4; i++) {
                if(guess[i] == answer[i]) {
                    strike++;
                } else {
                    // 해당 자리가 아닌 다른 위치에 같은 숫자가 있는지 확인
                    for (int j = 0; j < 4; j++) {
                        if(i != j && guess[i] == answer[j]) {
                            ball++;
                            break;
                        }
                    }
                }
            }

            // 정답인 경우
            if(strike == 4) {
                System.out.println("정답입니다.");
                isCorrect = true;
            } else {
                System.out.println("아쉽네요 " + strike + "S " + ball + "B 입니다.");
                chances--;  // 기회 차감 (잘못된 입력이 아니었으므로)
            }
        }

        // 10번 모두 사용한 경우
        if(!isCorrect) {
            System.out.println("10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다.");
        }

    }
}
