package campus.assignmnet5.practice02;

import java.util.Objects;

public class User extends Member {

    public User(int serialNo, String memberID, String memberPassword, int memberPhoneNumber, String memberEmail, String memberBirthDate, String electronicDevice, String paymentPolicy) {
        super(serialNo, memberID, memberPassword, memberPhoneNumber, memberEmail, memberBirthDate);
        this.electronicDevice = electronicDevice;
        this.paymentPolicy = paymentPolicy;
    }

    private String electronicDevice = "";
    private String paymentPolicy="";

    public String getElectronicDevice() {
        return electronicDevice;
    }

    public void setElectronicDevice(String electronicDevice) {
        this.electronicDevice = electronicDevice;
    }

    public String getPaymentPolicy() {
        return paymentPolicy;
    }

    public void setPaymentPolicy(String paymentPolicy) {
        this.paymentPolicy = paymentPolicy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        User user = (User) o;
        return Objects.equals(electronicDevice, user.electronicDevice) && Objects.equals(paymentPolicy, user.paymentPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), electronicDevice, paymentPolicy);
    }

    @Override
    public String toString() {
        return "User{" +
                "electronicDevice='" + electronicDevice + '\'' +
                ", paymentPolicy='" + paymentPolicy + '\'' +
                ", serialNo=" + serialNo +
                ", memberID='" + memberID + '\'' +
                ", memberPassword='" + memberPassword + '\'' +
                ", memberPhoneNumber=" + memberPhoneNumber +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberBirthDate='" + memberBirthDate + '\'' +
                '}';
    }
}
