package Notification;

public class MainApp {
    public static void main(String[] args) {
        NotificationService email_notification_service = new EmailNotification();
        email_notification_service.send("You have received an offer letter!");

        NotificationService sms_notification_service = new SmsNotification();
        sms_notification_service.send("Rs. 23028.00 credited to your JK Bank A/C no. XXXXXXXXXXXX7621");
    }
}
