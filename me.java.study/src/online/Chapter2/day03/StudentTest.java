package online.Chapter2.day03;

public class StudentTest {
    public static void main(String[] args) {

//        Student studentLee = new Student();
//                // 참조변수       // 생성자
//        studentLee.studentID = 12345;
//        studentLee.setStudentName("Lee");
//        studentLee.address = "서울 강남구";
//
//        studentLee.showStudentInfo();

      Student studentLee = new Student(12345, "Lee", "강남");

      String data = studentLee.showStudentInfo();
        System.out.println(data);


//        Student studentKim = new Student();
//        studentKim.studentID = 54321;
//        studentKim.setStudentName("Kim");
//        studentKim.address = "서울 강동구";
//
//        studentKim.showStudentInfo();
//
//        System.out.println(studentKim);
//        System.out.println(studentLee);

    }

}
