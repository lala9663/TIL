package campus.assignmnet2;

public class Practice06 {
//    public static void main(String[] args) {
//        for (int i = 1; i <6 ; i++) {
//            for (int j = 1; j <6 ; j++) {
//                if (i<j){
//
//                } else {
////                    System.out.printf("%6d\n*");
//                    System.out.printf("%s","*");
//                }
//
//            }
//            System.out.println();
//        }
//    }           // 이 방법은 잘못됨 공백이 아니기 때문
public static void main(String[] args) {

    for (int i = 1; i <6 ; i++) {
        for (int j = 5; j > i; j--) {
            System.out.print(" ");
        }
        for (int k = 1; k <i+1 ; k++) {
            System.out.print("*");
        }
        System.out.println();
    }
}



}



