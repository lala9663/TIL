package online.Chapter3.ch04;

public class CustomerTest {
    public static void main(String[] args) {

        Customer customerLee = new Customer(10020, "이순신");

        customerLee.bonusPoint = 1000;
        int price = customerLee.calcPrice(1000);
        System.out.println(customerLee.showCustomerInfo()+price);

        VIPCustomer customerKim = new VIPCustomer(10120, "김유신");
        customerKim.bonusPoint = 10000;
        price = customerKim.calcPrice(1000);
        System.out.println(customerKim.showCustomerInfo()+price);


    }
}
