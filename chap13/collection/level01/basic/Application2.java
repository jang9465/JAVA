package com.LEGEND.chap13.collection.level01.basic;

import java.util.LinkedList;
import java.util.Scanner;

public class Application2 {
    private static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        LinkedList<String> recentUrls = new LinkedList<>();  // 최근 URL 저장 리스트
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            String url = sc.nextLine().trim();

            if (url.equals("exit")) {
                break;
            }

            recentUrls.add(url);  // 가장 앞에 추가

            // 리스트 크기가 5를 초과하면 마지막 URL 제거
            if (recentUrls.size() > MAX_SIZE) {
                recentUrls.removeFirst();
            }

            System.out.println("최근 방문 url : " + recentUrls);
        }
    }
}