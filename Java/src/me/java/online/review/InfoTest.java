package me.java.online.review;

public class InfoTest {

    public static void main(String[] args) {

        Info userTomas = new Info();
        userTomas.userName = "Tomas";
        userTomas.userAge = 37;
        userTomas.userWeight = 70;
        userTomas.userHeight = 180;


        System.out.println(userTomas.showInfo());

        Info userKim = new Info("kim", 159, 49, 30);
        System.out.println(userKim.showInfo());
    }
}

