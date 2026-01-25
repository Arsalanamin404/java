package Paymnent;

import Notification.NotificationService;

public class CheckOutService {
    private final PaymentService paymentService;
    private final NotificationService notificationService;

    public CheckOutService(PaymentService paymentService, NotificationService notificationService) {
        this.paymentService = paymentService;
        this.notificationService = notificationService;
    }

    public void checkout(double amount) {
        this.paymentService.pay(amount);
        this.notificationService.send("Thank you for your purchase! ₹" + amount + " has been paid successfully.");

    }
}
