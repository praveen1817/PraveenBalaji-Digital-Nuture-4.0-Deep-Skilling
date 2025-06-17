public interface Stock {
    void register(observer o);
    void deregister(observer o);
    void notifyUser();
}
