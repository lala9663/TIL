package campus.assignment3;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int i = 0; i <T ; i++) {

            int R = sc.nextInt(); // 몇번 반복할지
            String S = sc.next(); // 문자 입력

            for (int j = 0; j <S.length() ; j++) {
                for (int k = 0; k <R ; k++) {
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println();
        }

        }





    }

