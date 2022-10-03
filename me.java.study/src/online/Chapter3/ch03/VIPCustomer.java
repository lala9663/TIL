package online.Chapter3.ch03;

public class VIPCustomer extends Customer {

    double salesRatio;
    String agentID;


    public  VIPCustomer() {
        super();

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";

        System.out.println("VIPCustomer() call");
    }

    public  String getAgentID(){
        return  agentID;

    }
}
