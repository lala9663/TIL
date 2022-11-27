package me.java.online.day03;

public class Student {

        public int studentID;
        public String studentName;
        public String address;

        public Student(int studentID, String studentName, String address){
            this.studentID = studentID;
            this.studentName = studentName;
            this.address = address;

        }

        public String showStudentInfo(){
            return  studentName + "학생의 학번은" + studentID + "이고, 주소는" + address + "입니다.";
        }

        public void setStudentName(String name){
            studentName = name;
        }
}
