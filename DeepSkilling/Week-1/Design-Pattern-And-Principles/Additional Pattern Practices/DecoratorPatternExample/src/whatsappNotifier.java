public class whatsappNotifier extends notifierDecorater{
    public whatsappNotifier(Notifier Notification){
        super(Notification);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("WhatsApp Messsage:"+message);
    }
}
