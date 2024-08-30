package Exercise5_OnlineShop;

public class Item {

    private String product;
    private int quantity;
    private int unitPrice;

    public Item(String product, int quantity, int unitPrice){
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    //returns price of the item
    public int price(){
        return unitPrice * quantity;
    }

    public void increaseQuantity(){
        this.quantity++;
    }

    public String toString(){
        return this.product + ": " + quantity;
    }
}
