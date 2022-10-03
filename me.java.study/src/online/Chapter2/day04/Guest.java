package online.Chapter2.day04;

public class Guest {

    String guestName;

    int money;

    public Guest(String guestName, int money){
        this.guestName = guestName;
        this.money = money;
    }

    public void takeTexi(Texi texi){
        texi.take(10000);
        this.money -= 10000;
    }

    public void showInfo(){
        System.out.println(guestName + "님의 남은 돈은" + money + "원 입니다.");
    }

}
