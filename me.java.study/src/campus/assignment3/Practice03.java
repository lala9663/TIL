package campus.assignment3;

import java.io.*;
import java.util.StringTokenizer;

public class Practice03 {
    public static void main(String[] args)throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = bf.readLine();
//        int i = Integer.parseInt(bf.readLine());

        StringTokenizer st = new StringTokenizer(s, " ");

//        String array[] = s.split(" ");

        System.out.println(st.countTokens());

        bw.flush();
        bw.close();

    }

}
