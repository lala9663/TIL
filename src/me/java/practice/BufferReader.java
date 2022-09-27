package me.java.practice;

import java.io.*;
import java.util.StringTokenizer;

public class BufferReader {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bf.readLine(); //String

        String input = bf.readLine();
        int i = Integer.parseInt(input);

        StringTokenizer st = new StringTokenizer(s);
        // StringTokenizer 인자값에 입력 문자열 넣음
        int a = Integer.parseInt(st.nextToken());//첫번째 호출
        int b = Integer.parseInt(st.nextToken());//두번째 호출

        // 할당된 버퍼에 값 넣어주기
     //   String c = "abcdefg"; //출력할 문자열
        bw.write(s+"\n"); // 버퍼에 있는 값 전부 출력
        bw.flush(); // 남아있는 데이터를 모두 출력시킴
        bw.close(); // 스트림을 닫음
    }

}
