package me.java.realpractice.day02;

public class practice7 {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        boolean isGood = ((i < j) || (i == 3)) ?  true : false;
        int isGood2 = ((i < j) || (i == 3)) ?  i : j;
        //  조건문 ? A : B -> 삼항 연산자 조건문이 true 이면 A false 이면 B
    }
}
