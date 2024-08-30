package Exercise5_OnlineShop;

import java.util.Scanner;

public class Store {

    private Warehouse warehouse;
    private Scanner scanner;

    public Store(Warehouse warehouse, Scanner scanner){
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    //method that handles the customers visit to the store
    public void shop(String customer){
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to our store: " + customer);
        System.out.println("Our selection: ");
        for(String product : this.warehouse.products()){
            System.out.println(product);
        }

        while(true){
            System.out.println("What to put int cart (press enter to go to register): ");
            String product = scanner.nextLine();
            if(product.isEmpty()){
                break;
            }

            //add code to add product to cart, if any in warehouse
            //reduce stock in warehouse if we can add to cart
            if(warehouse.take(product)){
                cart.add(product, warehouse.price(product));
                System.out.println("Product added to your cart!");
            } else{
                System.out.println("Product unavailable");
            }
        }

        System.out.println("---------------Shopping cart contents---------------");
        cart.print();
        System.out.println("---------------Total---------------");
        System.out.println("Total: " + " $" + cart.price());

    }



}
