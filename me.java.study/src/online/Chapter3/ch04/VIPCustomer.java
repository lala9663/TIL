package online.Chapter3.ch04;

public class VIPCustomer extends Customer {

    double salesRatio;
    String agentID;


    public  VIPCustomer() {
        super(0 , "no-name");

        bonusRatio = 0.05;
        salesRatio = 0.1;
//        customerGrade = "VIP";

    }

    public VIPCustomer(int customerID, String customerName){
        super(customerID,customerName);
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        price -= (int) (price * salesRatio);
        return (price);
    }

    public  String getAgentID(){
        return  agentID;

    }
}
