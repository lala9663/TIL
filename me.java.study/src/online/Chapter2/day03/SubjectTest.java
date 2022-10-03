package online.Chapter2.day03;

public class SubjectTest {

    public static void main(String[] args) {

        Student1 studentLee = new Student1(100, "Lee");
        studentLee.setKoreaSubject("국어", 100);
        studentLee.setMathSubject("수학", 99);

        Student1 studentKim = new Student1(200, "Kim");
        studentLee.setKoreaSubject("국어", 50);
        studentLee.setKoreaSubject("수학", 65);

    }
}
