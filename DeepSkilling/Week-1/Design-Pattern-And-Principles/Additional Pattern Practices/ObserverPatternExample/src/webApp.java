public class webApp implements observer{
    String user;
    public webApp(String user){
        this.user=user;
    }

    @Override
    public void update(String stockName, float price) {
        System.out.println("Hello user:"+user+"The Stock "+stockName+" Price is Changed to "+price);
    }
}
