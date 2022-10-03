package online.Chapter2.ch22;

public class TwoDimensionTest {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3}, {1,2,3,4}};

        int i,j;
        for (i = 0; i < arr.length ; i++) {//행의 길이
            for (j = 0; j < arr[i].length ; j++) {
                System.out.println(arr[i][j]+",");
            }
            System.out.println("\t" +arr[i].length);
        }
    }
}
