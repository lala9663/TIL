package campus.assignmnet5.practice02;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Electronics electronics = new Electronics(new Electronic[]{
                new Electronic("", Electronic.Company.SAMSUNG, new Date(), new Electronic.AuthMethod[]{Electronic.AuthMethod.PIN, Electronic.AuthMethod.FACE}),
                new Electronic("", Electronic.Company.LG, new Date(), new Electronic.AuthMethod[]{Electronic.AuthMethod.PIN, Electronic.AuthMethod.PATTERN}),
                new Electronic("", Electronic.Company.APPLE, new Date(), new Electronic.AuthMethod[]{Electronic.AuthMethod.PIN}),
                new Electronic("", Electronic.Company.SAMSUNG, new Date(), new Electronic.AuthMethod[]{Electronic.AuthMethod.PIN, Electronic.AuthMethod.HAND}),
                new Electronic("", Electronic.Company.LG, new Date(), new Electronic.AuthMethod[]{Electronic.AuthMethod.PIN, Electronic.AuthMethod.HAND, Electronic.AuthMethod.PATTERN, Electronic.AuthMethod.FACE}),
                new Electronic("", Electronic.Company.APPLE, new Date(), new Electronic.AuthMethod[]{Electronic.AuthMethod.PIN, Electronic.AuthMethod.HAND})});

        Electronic electronic = electronics.find("00003");
        System.out.println("electronic = " + electronic);
    }
}
