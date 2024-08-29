package Exercise5_OnlineShop;

public class Main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("coffee",5,1);

        System.out.println("stock: ");
        System.out.println("coffee: " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));

        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking coffee " + warehouse.take("coffee"));
        System.out.println("taking sugar " + warehouse.take("sugar"));

        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse.stock("coffee"));
        System.out.println("sugar: " + warehouse.stock("sugar"));


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
