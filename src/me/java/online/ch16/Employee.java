package me.java.online.ch16;

 public class Employee {

    public static int serialNum = 1000;     // 기준이 되는 변수 이기 때문에 바꾸면 안된다.
    private  int employeeId;
    private  String employeeName;
    private  String department;

    public  Employee(){
        serialNum++;
        employeeId =serialNum;
    }
    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public static int getSerialNum() {
        return serialNum;
    }
    public static void setSerialNum(int serialNum) {
        Employee.serialNum = serialNum;
    }

}
