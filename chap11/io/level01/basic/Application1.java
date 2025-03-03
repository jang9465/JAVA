package com.LEGEND.chap11.io.level01.basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("파일 이름을 입력하세요 : ");
        String fileName = scanner.nextLine();

        try (FileReader reader = new FileReader(fileName)) {

            System.out.println("===== 파일 내용 출력 =====");
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (FileNotFoundException e) {
            System.out.println("오류 : 해당 이름을 가진 파일이 없습니다.");
        } catch (Exception e) {
            System.out.println("오류 : 예기치 못한 오류가 발생하였습니다.");
        }
    }
}
