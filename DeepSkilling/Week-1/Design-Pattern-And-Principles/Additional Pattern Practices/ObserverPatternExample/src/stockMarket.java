import java.util.ArrayList;
import java.util.List;

public class stockMarket implements Stock{
     private List<observer> observers=new ArrayList<observer>();
     public float price;
     private String stockName;

    @Override
    public void register(observer o) {
        observers.add(o);
    }

    @Override
    public void deregister(observer o) {
       observers.remove(o);
    }

    @Override
    public void notifyUser() {
        for(observer o:observers){
            o.update(stockName,price);
        }
        }
    public void setStockPrice(String stockName,float price){
        this.price=price;
        this.stockName=stockName;
        notifyUser();
    }
}
