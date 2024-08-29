package Exercise5_OnlineShop;
import java.util.Map;
import java.util.HashMap;

public class Warehouse {

    private Map<String, Integer> products;
    private Map<String,Integer> stocks;

    public Warehouse(){
        //object created is hashmap but type is Map Interface
        //parent reference used to store a child object

        this.products = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    //add product and price and stcok
    public void addProduct(String product,int price,int stock){
        this.products.put(product,price);
        this.stocks.put(product,stock);
    }

    public int price(String product){
        //return value of product, if not in map, value is -99 and is returned
        return products.getOrDefault(product,-99);
    }

    //return current remaining stock
    public int stock(String product){
        //if product key not present in stock map , default to 0
        return this.stocks.getOrDefault(product,0);
    }

    //reduce by one, true if stock remaining and false if 0 or no stock
    public boolean take(String product){
        //if in stock or not avaiable at all, in stock equals false
        if(stocks.getOrDefault(product,0) == 0){
            return false;
        }
        //otherwise decrease value(stock) for key(product)
        int remaining = stocks.get(product) - 1;
        stocks.put(product,remaining);
        return true; //return true bc had stock
    }


}
