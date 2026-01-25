package Paymnent;

public class CryptoPaymentService implements  PaymentService{
    @Override
    public  void pay(double amount) {
        System.out.println("Paid "+amount+" via CRYPTO");
    }
}
