package online.Chapter2.review;

public class Order {

    public long num;
    public long phoneNum;
    public String addre;
    public long date;
    public long time;
    public int price;
    public int menuNum;

    public Order(){}

    public Order(long num, long phoneNum, String addre, long date, long time, int price, int menuNum){
        this.num = num;
        this.phoneNum = phoneNum;
        this.addre = addre;
        this.date = date;
        this.time = time;
        this.price = price;
        this.menuNum = menuNum;

    }


    public String showOrder(){
        return "주문 접수 번호 : "+num+ "\n 주문 핸드폰 번호 : "+ phoneNum + "\n 주문 집 주소"
                + addre + "\n 주문 날짜" + date + "\n 주문 시간" + time + "\n 주문가격 : "
                + price + "\n 메뉴 번호 : " + menuNum;
    }


}
