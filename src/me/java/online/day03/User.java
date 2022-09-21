package me.java.online.day03;

public class User {

    public String id;

    public int old;

    public String pw;


    public void showUserInfo(){
        System.out.println(" ID 는" + id + "이고 pw는" + pw + "입니다.");
    }

    public  void setid(String userid) { id = userid;}

}
