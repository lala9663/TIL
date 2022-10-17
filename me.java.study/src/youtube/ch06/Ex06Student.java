package youtube.ch06;

public class Ex06Student {
        String name;
        int ban;
        int no;
        int kor;
        int eng;
        int math;

    public Ex06Student() {
    }

    public Ex06Student(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public static void main(String[] args) {
        Ex06Student s = new Ex06Student("홍길동", 1, 1, 100, 60, 76);

        String str = s.info();
        System.out.println(str);
    }

    private String info() {
        Ex06Student s = new Ex06Student();
        return null;
    }
}
