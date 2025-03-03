package com.LEGEND.chap12.generic.level01.normal;

public class swap <T>{
    public void swap(T[] array, int index1, int index2) {
        if (array == null || index1 < 0 || index2 < 0 || index1 >= array.length || index2 >= array.length) {
            throw new IllegalArgumentException("잘못된 인덱스 또는 null 배열");
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
