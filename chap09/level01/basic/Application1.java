package com.LEGEND.chap09.level01.basic;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 문자열 입력 받기
        System.out.print("문자열 입력: ");
        String input = scanner.nextLine();

        // 각 단어의 첫 글자를 대문자로 변환
        String convertedString = convertToTitleCase(input);

        // 단어 개수 계산
        int wordCount = input.trim().isEmpty() ? 0 : input.split("\\s+").length;

        // 결과 출력
        System.out.println("변환된 문자열: " + convertedString);
        System.out.println("총 단어 개수: " + wordCount);

        scanner.close();
    }

    // 문자열을 Title Case로 변환하는 메서드
    private static String convertToTitleCase(String str) {
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        return result.toString().trim();
    }

}
