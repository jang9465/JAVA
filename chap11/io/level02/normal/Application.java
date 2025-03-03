package com.LEGEND.chap11.io.level02.normal;

import java.io.*;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // 병합할 파일 개수 입력
            System.out.print("병합할 파일의 개수 입력 : ");
            int fileCount = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기

            String[] fileNames = new String[fileCount];

            // 파일 이름 입력
            for (int i = 0; i < fileCount; i++) {
                System.out.print((i + 1) + " 번째 파일 이름 입력 : ");
                fileNames[i] = sc.nextLine();
            }

            // 병합될 파일명 입력
            System.out.print("병합 될 파일명 입력 : ");
            String resultFileName = sc.nextLine();

            // 파일 병합 수행
            mergeFiles(fileNames, resultFileName);

            System.out.println("파일 병합이 완료 되었습니다.");

        } catch (Exception e) {
            System.out.println("오류 발생: " + e.getMessage());
        } finally {
            sc.close();
        }
    }

    private static void mergeFiles(String[] fileNames, String resultFileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(resultFileName))) {

            for (String fileName : fileNames) {
                File file = new File(fileName);

                // 파일 존재 여부 확인
                if (!file.exists()) {
                    throw new FileNotFoundException(fileName + " (지정된 파일을 찾을 수 없습니다)");
                }

                // 파일을 읽고 병합
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        writer.write(line);
                        writer.newLine(); // 줄바꿈 추가
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("파일 처리 중 오류 발생: " + e.getMessage());
        }
    }
}