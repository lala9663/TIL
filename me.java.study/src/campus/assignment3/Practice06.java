package campus.assignment3;

import java.io.*;

public class Practice06 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bf.readLine();
//        int i = Integer.parseInt(bf.readLine());

        for (int i = 1; i<s.length() ; i++) {
            if(i<s.length()-4){
                System.out.print("*");
            }else if(s.length()-4<i+1){
                System.out.print(s.charAt(i));
            }
        }
//
//        for (int j = 1; j<s.length()-4; j++){
//            System.out.print("*");
//            for (int k = 1; k<s.length()-4; k++) {
//                System.out.print(k);
//            }
//        }


        bw.flush();
        bw.close();


        class Solution {
            public String solution(String phone_number) {
                String answer = "";
                for (int i = 0; i < phone_number.length(); i++) {
                    if (i < phone_number.length() - 4)
                        answer += "*";
                    else
                        answer += phone_number.charAt(i);
                }
                return answer;
            }
        }

    }
}
