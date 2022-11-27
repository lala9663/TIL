package me.java.realpractice.day02;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = 0;
        int sum = 0;
        System.out.print("Sally가 낸 돈 : ");
        money = sc.nextInt();
        sum = money + ((int)(money*0.1));

        System.out.println("노트북 총액 = " + sum);


        // 노트북 총액 = 노트북제품값 + 노트북 제품값의 10% 부과세

    }
}
