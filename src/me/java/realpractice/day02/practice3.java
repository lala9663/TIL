package me.java.realpractice.day02;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = 0;
        System.out.print("년도 입력: ");
        sc.nextInt();
        if (year/4==0){
            System.out.println(year + "년은 윤년입니다");
        }else {
            System.out.println(year + "년은 평년입니다");
        }
    }
}
