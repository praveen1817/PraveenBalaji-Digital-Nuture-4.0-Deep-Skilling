public class mobileApp implements observer{
    String user;

    public mobileApp(String stockName){
        this.user=stockName;

    }

    @Override
    public void update(String stockName,float price) {
        System.out.println("Hello user:"+user+"The Stock "+stockName+" Price is Changed to "+price);
    }
}
