package campus.assignment1;

import java.util.Scanner;
public class Practice01 {
    public static void main(String[] args) {
        int han = 0;
        int math = 0;
        int eng = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수 : ");
        han = sc.nextInt();
        System.out.print("수학 점수 : ");
        math = sc.nextInt();
        System.out.print("영어 점수 : ");
        eng = sc.nextInt();

        if (!(han>=0 && han<=100)){
            System.out.println("성적이 유효하지 않습니다.");
        } else if (!(math>=0 && math<=100)) {
            System.out.println("성적이 유효하지 않습니다.");
        } else if (!(eng>=0 && eng<=100)) {
            System.out.println("성적이 유효하지 않습니다.");
        } else if ((han+math+eng)/3 >= 70){
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }

    }


}
