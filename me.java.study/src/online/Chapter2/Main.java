package online.Chapter2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 입력 메소드
        // 사용자가 콘솔을 통해 입력한 데이터를 저장
        Scanner sc = new Scanner(System.in);
        // 객체 (object): 실제 행동하는 단위

        System.out.print("정수를 입력하시요 : "); //입력 유도 메세지
        int num = sc.nextInt();
        System.out.println(num);

        System.out.println("실수를 입력하시요 : "); //입력 유도 메세지
        double d = sc.nextDouble();
        System.out.println("입력한 수: " + d);
    }
}
