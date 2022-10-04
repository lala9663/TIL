package campus.assignment1;
import java.util.Scanner;
public class Practice04 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("x 값: ");
        x = sc.nextInt();
        System.out.print("y 값: ");
        y = sc.nextInt();
        
        if(x>0 && y>0){
            System.out.println("제 1사분면");
        } else if (x<0 && y>0) {
            System.out.println("제 2사분면");
        } else if (x<0 && y<0) {
            System.out.println("제 3사분면");
        } else if (x>0 && y<0) {
            System.out.println("제 4사분면");
        } else if (x==0 & y!=0) {
            System.out.println("x축 위에 있음");
        } else if (x!=0 && y ==0) {
            System.out.println("y축 위에 있음");
        } else {
            System.out.println("원점");
        }

    }
}
