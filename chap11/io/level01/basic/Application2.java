package com.LEGEND.chap11.io.level01.basic;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("원본 파일의 이름을 입력하세요 : ");
        String sourceFile = scanner.nextLine();
        System.out.print("복사 파일의 이름을 입력하세요 : ");
        String destinationFile = scanner.nextLine();

        try (FileReader reader = new FileReader(sourceFile);
             FileWriter writer = new FileWriter(destinationFile)) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("파일 복사가 성공적으로 완료 되었습니다.");
        } catch (IOException e) {
            System.out.println("오류 : " + e.getMessage());
        }
    }
}
