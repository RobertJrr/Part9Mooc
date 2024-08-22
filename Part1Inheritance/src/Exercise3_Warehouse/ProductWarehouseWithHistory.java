package Exercise3_Warehouse;

import java.text.DecimalFormat;
import java.util.Date;

//In addition to all previous features, tthis new warehouse also provides
// services related to the change history of the warehouse inventory
//history managed using ChangeHistory object
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String productName, double capacity,
                                       double intialBalance){
        //calling super constructor to intialize fields
        super(productName,capacity);
        //initializing ChangeHistory object
        this.history = new ChangeHistory();
        //Add balance passed to warehouse using method
        addToWarehouse(intialBalance);
        //So we added balance, now add this to timeline of warehouse status
//        history.add(intialBalance); //no longer needed bc above does it in one
//        (Override method from Warehouse class)
    }

    public String history(){
        return "" + this.history;
    }

    //making history, actually being able to log in the different status of balance

    //Overriding methods from Warehouse
    @Override
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.history.add(getBalance());
    }

    @Override
    public void takeFromWarehouse(double amount){
        super.takeFromWarehouse(amount);
        this.history.add(getBalance());

    }

    //print history related information for product
    public void printAnalysis(){
//        To format the answer for average(should've done it on average method itself)
        DecimalFormat df = new DecimalFormat("#.0");
        System.out.println("------Analysis------");
        System.out.println("Product: " + super.getName());
        System.out.println("History: " + this.history);
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + df.format(this.history.average()));
    }


}
