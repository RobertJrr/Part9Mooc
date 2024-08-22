package Exercise3_Warehouse;
class Main {
    public static void main(String[] args) {
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Cheese",1000.0,1000.0);
        //takes from warehouse and overriden method also adds to history status
        juice.takeFromWarehouse(11.3);
        //get the name of product from ProductWarehouse class
        System.out.println(juice.getName());
        //add to warehouse and overriden method also ads to history status
        juice.addToWarehouse(1.0);
        //calls toString method from ProductWarehouse
        System.out.println(juice);
        // System.out.println(juice.history());
        System.out.println("\n");
        //prints out analysis
        juice.printAnalysis();


    }
}
