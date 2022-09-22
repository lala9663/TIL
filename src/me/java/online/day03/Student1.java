package me.java.online.day03;

public class Student1 {

    int studentId;
    String studentName;

    Subject korea;
    Subject math;
    Student1(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;

        korea = new Subject();
        math = new Subject(); //  사용하기 전에 만들어야 한다.
    }

    public void setKoreaSubject(String name, int score){
        korea.subjectName = name;
        korea.score = score;
    }

    public  void setMathSubject(String name, int score){
        math.subjectName = name;
        math.score = score;
    }

    public void setScoreInfo(){
        int total = korea.score + math.score;
        System.out.println(studentName = "학새의 총점은 " + total +"점 입니다.");
    }



}
