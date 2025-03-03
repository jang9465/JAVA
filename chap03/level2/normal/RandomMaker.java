package com.LEGEND.chap03.level2.normal;

import java.util.Random;

public class RandomMaker {
    public static int randomNumber(int min, int max) {
        Random random = new Random();

        return random.nextInt(min, max + 1);
    }

    public static String randomUpperAlpabet(int length) {
//        Random random = new Random();
//        for (i = 0; i < length; i++) {
//            char randomChar = (char) (randomNumber(65, 90));
//        }
        Random random = new Random();
        String result = "";

        for (int i = 0; i < length; i++) {
            StringBuilder temp = new StringBuilder(result); // 기존 문자열을 복사
            char randomChar = (char) randomNumber(65, 90);
            temp.append(randomChar);
            result = temp.toString(); // 다시 문자열로 변환하여 저장
        }

        return result;
    }

    public static String rockPaperScissors(){
        String[] choices = {"가위", "바위", "보"};
        Random random = new Random();
        return choices[random.nextInt(3)];
    }


    public static String tossCoin(){
        Random random = new Random();

        int a = random.nextInt(2);
        if (a == 1)
            return "앞면";
        else
            return "뒷면";
    }

}
//65~90 : A~Z


