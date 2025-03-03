package com.LEGEND.chap05.array.level04.advanced;

import java.util.Arrays;
import java.util.Random;

public class Application1 {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        Random random = new Random();
        int count = 0;

        while (count < lotto.length) {
            int num = random.nextInt(45) + 1;

            boolean dupl = false;
            for (int i = 0; i < count; i++) {
                if (lotto[i] == num) {
                    dupl = true;
                    break;
                }
            }

            if (!dupl) {
                lotto[count] = num;
                count++;
            }
        }

        Arrays.sort(lotto);

        System.out.println("로또번호: " + Arrays.toString(lotto));
    }
}
