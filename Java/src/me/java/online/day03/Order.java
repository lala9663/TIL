package me.java.online.day03;

public class Order {

    public long orderNum;
    public int phoneNum;
    public String addr;
    public String date;
    public String time;
    public int price;
    public int menuNum;

    public Order() {
    }

    public Order(long orderNum, int phoneNum, String addr, String date, String time, int price, int menuNum) {
        this.orderNum = orderNum;
        this.phoneNum = phoneNum;
        this.addr = addr;
        this.date = date;
        this.time = time;
        this.price = price;
        this.menuNum = menuNum;
    }

    public void setOrderNum(long orderNum1) {orderNum = orderNum1;}

    public String showOrder() {
        return "주문 접수 번호 : " + orderNum + "\n 주문 핸드폰 번호 : " + phoneNum +
                "\n 주문 집 주소 번호 : " + addr + "\n 주문날짜 : " + date + "\n 주문 시간 : " + time +
                "\n 주문 가격 : " + price + "\n 메뉴 번호 : " + menuNum;
    }
}





