package campus.assignmnet2;

import java.util.Scanner;

public class Practice07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int money = 0;  // 사용자가 넣을 금액
        int kim = 2500;
        int ra = 3000;
        int dduk = 4000;
        int don = 5000;
        int count = 0;



        System.out.print("충전할 금액 :");
        money = sc.nextInt();
        if(money<2500) {
            System.out.println("어딜 들어와");
        }else {
            while (money >= 2500) {
                System.out.println("==================");
                System.out.println("김밥천국 메뉴판");
                System.out.println("1. 김밥 - 2500");
                System.out.println("2. 라면 - 3000");
                System.out.println("3. 떡볶이 - 3000");
                System.out.println("4. 돈까스 - 5000");
                System.out.println("5. 종료");
                System.out.println("==================");
                System.out.println("현재 금액: " + money);

                int choice = sc.nextInt(); // 메뉴 선택
                if (choice == 1) {
                    System.out.print("수량 : ");
                    count = sc.nextInt();
                    if (money > kim * count) {
                        money -= kim * count;
                        System.out.println("잔액 : " + money);
                    } else if (money < kim * count) {
                        System.out.println("금액이 부족합니다");
                        System.out.println("잔액을 받아가세요.");
//                    System.out.println("충전하시겠습니까? 1. 충전하기 \t 2. 잔액 반환하기");
//                        switch (choice){
//                            case 1 :
//                                money += money;
//                            case 2:
//                                System.out.println("남은돈을 받아가세요" + money);
//                        }
                    } else {
                        System.out.println("남은 금액이 0원입니다.프로그램 종료합니다.");
                    }
                } else if (choice == 2) {
                    System.out.print("수량 : ");
                    count = sc.nextInt();
                    if (money > ra * count) {
                        money -= ra * count;
                        System.out.println("잔액 : " + money);
                    } else if (money < ra * count) {
                        System.out.println("금액이 부족합니다.");
                        System.out.println("잔액을 받아가세요.");
                    } else {
                        System.out.println("남은 금액이 0원입니다.프로그램 종료합니다.");
                    }
                } else if (choice == 3) {
                    System.out.print("수량 : ");
                    count = sc.nextInt();
                    if (money > dduk * count) {
                        money -= dduk * count;
                        System.out.println("잔액 : " + money);
                    } else if (money < dduk * count) {
                        System.out.println("금액이 부족합니다.");
                        System.out.println("잔액을 받아가세요.");
                    } else {
                        System.out.println("남은 금액이 0원입니다.프로그램 종료합니다.");
                    }
                } else if (choice == 4) {
                    System.out.print("수량 : ");
                    count = sc.nextInt();
                    if (money > don * count) {
                        money -= don * count;
                        System.out.println("잔액 : " + money);
                    } else if (money < don * count) {
                        System.out.println("금액이 부족합니다.");
                        System.out.println("잔액을 받아가세요.");
                    } else {
                        System.out.println("남은 금액이 0원입니다.프로그램 종료합니다.");
                    }
                } else if (choice == 5) {
                    System.out.println("종료");
                    System.out.println("뱉을 돈 : " + money);
                } else {
                    System.out.println(" 메뉴 선택 오류");
                }

            }
        }


    }
}
