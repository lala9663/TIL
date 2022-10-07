package campus.assignmnet5.practice02;

public class Test {
    public static void main(String[] args) {



        Electronics electronics = new Electronics(new Electronic[]{
                new Electronic("0001", "", CompanyName.SAMSUNG, "220110", new AuthMethod[]{AuthMethod.PIN, AuthMethod.FACE}),
                new Electronic("0002", "", CompanyName.LG, "211010", new AuthMethod[]{AuthMethod.PIN, AuthMethod.PATTERN}),
                new Electronic("0003", "", CompanyName.APPLE, "220722", new AuthMethod[]{AuthMethod.PIN}),
                new Electronic("0004", "", CompanyName.SAMSUNG, "220310", new AuthMethod[]{AuthMethod.PIN, AuthMethod.HAND}),
                new Electronic("0005", "", CompanyName.LG, "210722", new AuthMethod[]{AuthMethod.PIN, AuthMethod.HAND, AuthMethod.PATTERN, AuthMethod.FACE}),
                new Electronic("0006", "", CompanyName.APPLE, "200310", new AuthMethod[]{AuthMethod.PIN, AuthMethod.HAND})});

    Electronic findResult = electronics.findByProductNo("0001");

        System.out.println(findResult);
        }

//        Electronic  e1 =new Electronic("0001", "", CompanyName.SAMSUNG, "220110", new AuthMethod[]{AuthMethod.PIN, AuthMethod.FACE});
//        Electronic  e2 =new Electronic("0002", "", CompanyName.SAMSUNG, "211010", new AuthMethod[]{AuthMethod.PIN, AuthMethod.PATTERN});
//        Electronic[] b = {e1,e2};
//
//        Electronics A = new Electronics(b);

//        System.out.println(A.findByProductNo(e2.getProductNo()));

    }

