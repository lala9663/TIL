package me.java.online.review;

public class Info{
   public String userName;
   public int  userWeight;
   public int  userHeight;
   public int  userAge;

    public  Info(){}

    public  Info(String userName, int userHeight, int userWeight, int userAge){
        this.userName = userName;
        this.userAge = userAge;
        this.userHeight = userHeight;
        this.userWeight = userWeight;
    }

    public  String showInfo(){
        return "키가" + userHeight + "이고 몸무게가" + userWeight + "키로인 남성이 있습니다. 이름은"
                + userName + "이고 나이는 " + userAge + "세 입니다.";

    }

};


