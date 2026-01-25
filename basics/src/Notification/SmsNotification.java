package Notification;

public class SmsNotification implements NotificationService{
    public  void send(String message){
        System.out.println("SMS: "+message);
    }
}
