package me.java.realpractice.day02;

import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0;
        int b = 0;
        System.out.print("a 값 : ");
        a = sc.nextInt();
        System.out.print("b 값 : ");
        b = sc.nextInt();

        if (a > b){
            System.out.println("최댓값 : " + a);
            System.out.println("최솟값 : " + b);
        }else {
            System.out.println("최댓값 : " + b);
            System.out.println("최솟값 : " + a);

        }

    }
}
