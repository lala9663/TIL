package me.java.online.day04;

public class Texi {

    String texiBrand;
    int guestCount;
    int money;

    public Texi(String texiBrand){
        this.texiBrand = texiBrand;
    }

    public  void  take(int money){
        this.money += money;
        guestCount++;
    }

    public void showTexiInfo(){
        System.out.println(texiBrand + "택시 수입은 " + money+ "입니다.");
    }

}


