package campus.assignmnet2;

public class Practice05 {
    public static void main(String[] args) {

       int count=0;


        for (int a = 1; a <=100 ; a++) {
            for (int b = 1; b <=100 ; b++) {
                for (int c = 1; c <=100; c++) {
                    if(a<c && b<c && (a*a+b*b==c*c)){
                        System.out.println("a : "+a+", b : "+b+" ,c : "+c);
                        count++;
                    }
                }
            }
        }
        System.out.println("개수 : " +count);


    }
}
