package youtube.ch06;

public class Ex6 {
    static {
        System.out.println("static { }");
    }
    {
        System.out.println("{ }");
    }

    public  Ex6(){
        System.out.println("생성자");
    }

    public static void main(String[] args){
        System.out.println("Ex6 = new Ex6(); ");
        Ex6  bt = new Ex6();
        System.out.println("Ex6 = new Ex6(); ");
        Ex6 bt1 = new Ex6();
    }
}
