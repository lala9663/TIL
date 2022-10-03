package online.Chapter2.ch24;

import java.util.ArrayList;

public class Student {

    int studentId;
    String studentName;

    ArrayList<Subject> subjectList;

    public Student(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;

        subjectList = new ArrayList<>();
    }

    public void addSubject(String name, int point){
        Subject subject = new Subject();

        subject.setName(name);
        subject.setScorePoint(point);
        subjectList.add(subject);
    }

    public void showScoreInfo(){

        int total = 0;

        for (Subject s : subjectList){

            total += s.getScorePoint();
            System.out.println(studentName + "학생의 "+s.getName() + "과목의 성적은 "+ s.getScorePoint()+"입니다.");
          }

        System.out.println(studentName + "학생의 총점은" + total+ "점 입니다.");
    }

}
