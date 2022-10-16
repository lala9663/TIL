package campus.assignmnet5.practice02;

import java.util.Objects;

public class Member {
    private String serialNo;
    protected String memberID;
    protected String memberPw;
    protected String phoneNum;
    protected String memberEmail;
    protected String memberBrithDate;
    private static int count = 0;
    private static final int MAX_MEMBER = 10000;

    public Member() {
    generateKey();
    }

    public Member(String memberID, String memberPw, String phoneNum, String memberEmail, String memberBrithDate) {
        this.memberID = memberID;
        this.memberPw = memberPw;
        this.phoneNum = phoneNum;
        this.memberEmail = memberEmail;
        this.memberBrithDate = memberBrithDate;
        generateKey();
    }

    public void generateKey(){
        if(count < MAX_MEMBER) {
            count++;
        }
        serialNo = String.format("%05d", count);
    }

    public String getSerialNo() {
        return serialNo;
    }

   private void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getMemberPw() {
        return memberPw;
    }

    public void setMemberPw(String memberPw) {
        this.memberPw = memberPw;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberBrithDate() {
        return memberBrithDate;
    }

    public void setMemberBrithDate(String memberBrithDate) {
        this.memberBrithDate = memberBrithDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return serialNo.equals(member.serialNo) && memberID.equals(member.memberID) && memberPw.equals(member.memberPw) && phoneNum.equals(member.phoneNum) && memberEmail.equals(member.memberEmail) && memberBrithDate.equals(member.memberBrithDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNo, memberID, memberPw, phoneNum, memberEmail, memberBrithDate);
    }

    @Override
    public String toString() {
        return "Member{" +
                "serialNo='" + serialNo + '\'' +
                ", memberID='" + memberID + '\'' +
                ", memberPw='" + memberPw + '\'' +
                ", phoneNum='" + phoneNum + '\'' +
                ", memberEmail='" + memberEmail + '\'' +
                ", memberBrithDate='" + memberBrithDate + '\'' +
                '}';
    }
}
