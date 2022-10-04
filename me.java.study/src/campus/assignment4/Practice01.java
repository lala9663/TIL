package campus.assignment4;

import java.util.Arrays;
import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        // 입력받을 숫자 갯수 입력
        int[] array = new int[10];
        int sum = 0;
        int ave = 0;
        int total = 0;
        int dev = 0;


        for (int i = 0; i <array.length; i++) {
            System.out.println((i+1)+"번째 숫자");
            array[i] = sc.nextInt();
            sum += array[i];
            ave = sum/(array.length);
            total += (array[i]-ave)*(array[i]-ave);
            dev = total/ array.length;
            }


        System.out.println("array=" + Arrays.toString(array));

        Arrays.sort(array);
        int max = array[array.length-1];
        int min = array[0];




        System.out.println("최소값:"+ min);
        System.out.println("최대값:"+ max);
        System.out.println("평균값:"+ ave);
        System.out.println("분산:"+ dev);
        System.out.println("표준편차:"+ Math.sqrt(dev));





        }
    }


