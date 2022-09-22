package me.java.online.day04;

public class Birthday {

    private int day;
    private int month;
    private int year;

    private boolean isVaild;

    public int getDay(){
        return  day;
    }

    public  void setDay(int day){
        int n = 0;
        int y = 0;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
//                this.day = day;
                n=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
//                this.day = day;
                n=30;
                break;

            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//                if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
//                    this.day= day;
                    n =29;
                    break;
                }else{
                    n= 28;
                    break;
                }
        }
        if (n < day){
            isVaild = false;
        }else {
            isVaild = true;
            this.day = day;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month <1 || month >12){
            isVaild = false;
        } else {
            isVaild = true;
            this.month = month;
        }

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public  void  showDate(){
        if (isVaild){
            System.out.println(year + "년"+ month + "월" + day + "일 입니다.");
        }else {
            System.out.println("유효하지 않은 날짜 입니다.");
        }
    }
    public boolean getIsValid(){    // Readonly 속성
        return isVaild;
    }
}
