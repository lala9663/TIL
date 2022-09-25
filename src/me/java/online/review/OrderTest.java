package me.java.online.review;

import javax.crypto.spec.PSource;

public class OrderTest {
    public static void main(String[] args) {

        Order numID = new Order();
        numID.num =  202011020003L;
        numID.phoneNum = 01023450001;
        numID.addre = "서울시 강남구 역삼동";
        numID.date = 20201102;
        numID.time = 130258;
        numID.price = 35000;
        numID.menuNum = 0003;

        System.out.println(numID.showOrder());
    }


}
