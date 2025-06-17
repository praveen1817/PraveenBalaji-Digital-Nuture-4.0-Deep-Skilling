public class smsNotifier extends notifierDecorater{
    public smsNotifier(Notifier Notification){
        super(Notification);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("SmS Message Sent:"+message);
    }
}
