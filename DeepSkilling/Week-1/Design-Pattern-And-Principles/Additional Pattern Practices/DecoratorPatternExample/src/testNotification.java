public class testNotification {
    public static void main(String[] args) {
        Notifier noramlMessage=new EmailNotifier();
        Notifier smsMessage=new smsNotifier(noramlMessage);
        Notifier whatsappMeassage = new whatsappNotifier(smsMessage);
        whatsappMeassage.send("Hello Every One");
    }
}
