package me.java.online.day03;

public class PersonTest {
    public static void main(String[] args) {

        Person Tomas = new Person();
        Tomas.setName("Tomas");
        Tomas.height = 180;
        Tomas.weight = 78;
        Tomas.age = 37;
        Tomas.gender = "남성";

        System.out.println(Tomas.showUserInfo());

    }
}
