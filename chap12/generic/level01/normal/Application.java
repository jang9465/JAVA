package com.LEGEND.chap12.generic.level01.normal;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        swap<Integer> sw = new swap<>();
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("swap 전 : " + Arrays.toString(intArray));  // [1, 2, 3, 4, 5]
        sw.swap(intArray, 1, 3);
        System.out.println("swap 후 : " + Arrays.toString(intArray));  // [1, 4, 3, 2, 5]

        swap<String> swStr = new swap<>();
        String[] strArray = {"A", "B", "C", "D"};
        System.out.println("swap 전 : " + Arrays.toString(strArray));  // [A, B, C, D]
        swStr.swap(strArray, 0, 2);
        System.out.println("swap 후 : " + Arrays.toString(strArray));  // [C, B, A, D]
    }
}


