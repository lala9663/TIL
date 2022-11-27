package me.java.overeview;

public class WhileFor {
    public static void main(String[] args) {
//        int num = 1;
//        int sum = 0;
//
//        while(num <= 0){
//            sum += num;
//            num++;
//        }
//        System.out.println(sum);
//        System.out.println(num);
//
//        Scanner sc = new Scanner(System.in);
//        int input;
//        int sum1;
//
//        do{
//            input = sc.nextInt();
//            sum += input;
//        }while(input != 0);
//        System.out.println(sum);

        int count = 1;
        int sum2 = 0;

        for (int i = 0; i <10; i++) {
            sum2 += count;
        }
        System.out.println(sum2);

        int num = 1;
        int total = 0;

        while (num <= 10){
            total += num;
            num ++;
        }
        System.out.println(total);


    }
}
