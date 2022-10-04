package campus.assignment1;
import java.util.Scanner;
public class Practice02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("알파벳 입력 : ");
        char alpha = sc.next().charAt(0);
        // a ~ z , A ~ Z
//        "abc".to
//        if(!영문자니?){
//            // 유효하지 않습니다.
//            // return;
//        }
//
//        if(소문자){
//            //
//        }else {
//            //
//        }
        if(alpha<65 && alpha>122){
            System.out.println("영문자가 유효하지 않습니다.");
        } else if (alpha<90 && alpha>97) {
            System.out.println("영문자가 유효하지 않습니다.");
        } else if (alpha>=97 && alpha<=122) {
            System.out.println((char)(alpha-32));
        } else{
            System.out.println(alpha);
        }


    }
}
