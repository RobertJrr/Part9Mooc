package Exercise5_OnlineShop;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

//        Item item = new Item("milk",4,2);
//        System.out.println("an item that contains 4 milks has the total price of " + item.price());
//
//        System.out.println(item);
//        item.increaseQuantity();
//        System.out.println(item);

        //Creating Scanner object, warehosue object and store object
        Scanner scanner = new Scanner(System.in);
        Warehouse warehouse = new Warehouse();
        Store store = new Store(warehouse,scanner);
        //Adding products to warehouse
        warehouse.addProduct("coffee",5,10);
        warehouse.addProduct("milk",3,20);
        warehouse.addProduct("cream",2,55);
        warehouse.addProduct("bread",7,8);
        //name of customer
        String customer = "Robert";
        //Intializing shopping process
        store.shop(customer);


//        cart.add("milk",3);
//        cart.add("buttermilk",2);
//        cart.add("cheese",5);
//        cart.add("Computer",899);
//        cart.print();




//----------------------------------------------

//        Warehouse warehouse = new Warehouse();
//        warehouse.addProduct("milk",3,10);
//        warehouse.addProduct("coffee",5,6);
//        warehouse.addProduct("buttermilk",2,20);
//        warehouse.addProduct("yogurt",2,20);
//
//        System.out.println("Products: ");
//        for(String product : warehouse.products()){
//            System.out.println(product);
//        }

//----------------------------------------------


//        System.out.println("stock: ");
//        System.out.println("coffee: " + warehouse.stock("coffee"));
//        System.out.println("sugar: " + warehouse.stock("sugar"));
//
//        System.out.println("taking coffee " + warehouse.take("coffee"));
//        System.out.println("taking coffee " + warehouse.take("coffee"));
//        System.out.println("taking sugar " + warehouse.take("sugar"));
//
//        System.out.println("stock:");
//        System.out.println("coffee:  " + warehouse.stock("coffee"));
//        System.out.println("sugar: " + warehouse.stock("sugar"));


//----------------------------------------------
//        warehouse.addProduct("milk",3,10);
//        warehouse.addProduct("coffee",5,7);
//
//        System.out.println("prices: ");
//        System.out.println("milk:  " + warehouse.price("milk"));
//        System.out.println("milk:  " + warehouse.price("coffee"));
//        System.out.println("milk:  " + warehouse.price("sugar"));

    }
}
