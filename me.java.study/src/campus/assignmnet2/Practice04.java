package campus.assignmnet2;

public class Practice04 {
    public static void main(String[] args) {
        // i 가 j보다 작아야한다.

        for (int i = 1; i < 6; i++) {
            for (int j = 1; j < 6; j++) {
                if (i>=j){
//                    System.out.println("");
                }else{
                    System.out.println("("+i+","+j+")");
                }
            }
        }
    }
}
