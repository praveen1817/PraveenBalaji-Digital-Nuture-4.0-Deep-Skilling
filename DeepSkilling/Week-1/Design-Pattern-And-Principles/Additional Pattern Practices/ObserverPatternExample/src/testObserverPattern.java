public class testObserverPattern {
    public static void main(String[] args) {
        observer mobile=new mobileApp("virat");
        observer web=new webApp("ABD");
        stockMarket registerUser=new stockMarket();
        registerUser.register(mobile);
        registerUser.register(web);
        registerUser.setStockPrice("AirIndia",1000);
        registerUser.deregister(web);
        registerUser.setStockPrice("AirIndia",2000);




    }
}
