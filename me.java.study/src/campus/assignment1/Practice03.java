package campus.assignment1;

import java.util.Scanner;
public class Practice03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        String text;
        System.out.print("첫번째 정수 입력: ");
        num1 = sc.nextInt();
        System.out.print("두번째 정수 입력: ");
        num2 = sc.nextInt();
        System.out.print("연산자 입력: ");
        text = sc.next();
        if (text.equals("word")){
            System.out.println(num1 +"+"+ num2 + "=" + (num1+num2));
        } else if (text.equals("-")) {
            System.out.println(num1 +"-"+ num2 + "=" + (num1-num2));
        } else if (text.equals("*")) {
            System.out.println(num1 +"*"+ num2 + "=" + (num1*num2));
        } else if (text.equals("/")) {
            System.out.println(num1 +"/"+ num2 + "=" + (num1/num2));
        } else if (text.equals("%")) {
            System.out.println(num1 +"+"+ num2 + "=" + (num1%num2));
        } else{
            System.out.println("연산자가 유효하지 않습니다.");
        }


    }
}
