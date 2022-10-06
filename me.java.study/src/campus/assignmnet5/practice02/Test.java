package campus.assignmnet5.practice02;

public class Test {
    public static void main(String[] args) {
        Electronic  e1 =new Electronic("0001", "", Electronic.CompanyName.SAMSUNG, "220110", Electronic.AuthMethod.Hand);


        System.out.println("폰 번호: " +  e1.getProductNo());
    }
}
