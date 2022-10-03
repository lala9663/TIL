package online.Chapter3.ch09;

public abstract class Computer {

    public abstract void typing();
    public abstract void display();

    void turnOn(){
        System.out.println("전원을 켭니다");
    }

    void  turnOff(){
        System.out.println("전원을 끕니다");
    }



}


