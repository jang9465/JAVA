package com.LEGEND.chap04.conditional.level04.advanced;


import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("월 급여를 입력 : ");
        int salary_month = sc.nextInt();
        System.out.print("매출액을 입력 : ");
        int total_sal = sc.nextInt();
        int bonus = 0, salary_total = 0;

        if(total_sal >= 50000000){
            bonus = 5;
        }
        else if(total_sal >= 30000000){
            bonus = 3;
        }
        else if(total_sal >= 10000000){
            bonus = 1;
        }
        salary_total = salary_month + (total_sal * bonus/100);

        System.out.println("=====================================");
        System.out.println("매출액 : " + total_sal);
        System.out.println("보너스율 : " + bonus + "%");
        System.out.println("월 급여 : " + salary_month);
        System.out.println("보너스 금액 : " + total_sal * bonus/100);
        System.out.println("=====================================");
        System.out.println("총 급여 : " + salary_total);
    }
}
