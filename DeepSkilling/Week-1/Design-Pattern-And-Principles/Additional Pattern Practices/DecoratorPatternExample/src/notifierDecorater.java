public class notifierDecorater implements Notifier{
    protected Notifier Notification;
    public notifierDecorater(Notifier Notification){
        this.Notification=Notification;
    }

    @Override
    public void send(String message) {
        Notification.send(message);
    }
}
