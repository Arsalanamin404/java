package Paymnent;

import Notification.EmailNotification;
import Notification.NotificationService;
import Notification.SmsNotification;

/* This is called OPEN FOR EXTENSION AND CLOSED FOR MODIFICATION.
We only change the MainApp and inject our new service into it, without modifying our
checkout service and payment interface */
public class MainApp {
    public static void  main(String[] args) {
        PaymentService paymentService = new CardPaymentService();

        NotificationService emailNotification = new EmailNotification();
        NotificationService smsNotification = new SmsNotification();

        System.out.println("-".repeat(80));

        CheckOutService checkOutService = new CheckOutService(paymentService, emailNotification);
        checkOutService.checkout(4000);

        System.out.println("-".repeat(80));

        paymentService = new UpiPaymentService();
        CheckOutService checkOutService1 = new CheckOutService(paymentService, emailNotification);
        checkOutService1.checkout(3000);

        System.out.println("-".repeat(80));

        paymentService = new CryptoPaymentService();
        CheckOutService checkOutService2 = new CheckOutService(paymentService, smsNotification);
        checkOutService2.checkout(8620);

        System.out.println("-".repeat(80));

    }
}
