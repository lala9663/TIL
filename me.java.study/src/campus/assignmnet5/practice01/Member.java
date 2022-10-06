package campus.assignmnet5.practice01;

import java.util.Objects;

public class Member {
    int serialNo = 0;
    String memberID= "";
    String memberPassword="";
    int memberPhoneNumber = 0;
    String memberEmail = "";
    String memberBirthDate = "";

    public Member(int serialNo, String memberID, String memberPassword, int memberPhoneNumber, String memberEmail, String memberBirthDate) {
        this.serialNo = serialNo;
        this.memberID = memberID;
        this.memberPassword = memberPassword;
        this.memberPhoneNumber = memberPhoneNumber;
        this.memberEmail = memberEmail;
        this.memberBirthDate = memberBirthDate;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public int getMemberPhoneNumber() {
        return memberPhoneNumber;
    }

    public void setMemberPhoneNumber(int memberPhoneNumber) {
        this.memberPhoneNumber = memberPhoneNumber;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberBirthDate() {
        return memberBirthDate;
    }

    public void setMemberBirthDate(String memberBirthDate) {
        this.memberBirthDate = memberBirthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return serialNo == member.serialNo && memberPhoneNumber == member.memberPhoneNumber && memberID.equals(member.memberID)
                && memberPassword.equals(member.memberPassword) && memberEmail.equals(member.memberEmail) && memberBirthDate.equals(member.memberBirthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNo, memberID, memberPassword, memberPhoneNumber, memberEmail, memberBirthDate);
    }

    @Override
    public String toString() {
        return "Member{" +
                "serialNo=" + serialNo +
                ", memberID='" + memberID + '\'' +
                ", memberPassword='" + memberPassword + '\'' +
                ", memberPhoneNumber=" + memberPhoneNumber +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberBirthDate='" + memberBirthDate + '\'' +
                '}';
    }


}

