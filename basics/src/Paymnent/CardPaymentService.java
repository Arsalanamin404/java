package Paymnent;

public class CardPaymentService  implements  PaymentService{
    @Override
    public  void pay(double amount){
        System.out.println("Paid "+amount+" via Card");
    }
}
