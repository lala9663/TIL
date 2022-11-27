package me.java.online.ch16;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        System.out.println(Employee.serialNum); // 클래스 이름으로 변수를 작성
        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");

        System.out.println(Employee.serialNum);

        System.out.println(employeeLee.getEmployeeName()+"님의 사번은 " +employeeLee.getEmployeeId());
        System.out.println(employeeKim.getEmployeeName()+ "님의 사번은" +employeeKim.getEmployeeId());



    }
}
