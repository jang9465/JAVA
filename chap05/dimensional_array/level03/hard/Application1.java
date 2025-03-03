package com.LEGEND.chap05.dimensional_array.level03.hard;

import java.util.Random;
import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int rows = getValidInput(sc, "가로 행의 수를 입력하세요: ");
        int columns = getValidInput(sc, "세로 열의 수를 입력하세요: ");

        char[][] arr = new char[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = (char) ('A' + random.nextInt(26));
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int getValidInput(Scanner sc, String message) {
        int input;
        while (true) {
            System.out.print(message);
            input = sc.nextInt();
            if (input >= 1 && input <= 10) {
                break;
            }
            System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
        }
        return input;
    }

}