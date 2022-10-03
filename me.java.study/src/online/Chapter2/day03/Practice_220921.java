package online.Chapter2.day03;

public class Practice_220921 {

    public static  int addNum(int num1, int num2){

        int result;
        result = num1 + num2;
        return  result;
        // 매개변수도 있고 반환값도 있는 것
    }
        public  static void  sayHELLO(String greeting){

            System.out.println(greeting);
        // 매개변수는 있지만 반환값은 없는 것
        }

        public static int culcSum()
        {
            int sum = 0;
            int i;

            for(i = 0; i<=100; i++){
                sum += i;
            }
            return sum;
            // 반환값만 있는 것
        }

    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;

        int total = addNum(n1,n2);
        System.out.println(total);

        sayHELLO("안녕하세요");

        total = culcSum();
        System.out.println(total);
    }
}
