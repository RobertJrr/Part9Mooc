package Exercise5_OnlineShop;

import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
    private Map<String,Item> items;

    public ShoppingCart(){
        this.items = new HashMap<>();
    }

    public void add(String item, int price){
        Item product = new Item(item,1,price);
        //if product in map, increase quantity of product(item)
        if(items.containsKey(item)){
            items.get(item).increaseQuantity();
        }else{
            items.put(item, product);

        }
    }

    //return total price
    public int price(){
        int totalPrice = 0;
        //iterate trough values in Map which are Item type
        for(Item item : items.values()){
            //call price() method for each Item object to add to total price
            totalPrice += item.price();
        }
        //return total price
        return totalPrice;
    }

    public void print(){
        for(Item item : items.values()){
            //calls item toString() method to print product and price
            System.out.println(item);
        }
    }


}
