package me.java.online.day04;

public class TexiTest {
    public static void main(String[] args) {

        Guest guestI = new Guest("apple", 20000);

        Texi brand = new Texi("잘나간다 운수");

        guestI.takeTexi(brand);

        guestI.showInfo();

        brand.showTexiInfo();
    }
}
