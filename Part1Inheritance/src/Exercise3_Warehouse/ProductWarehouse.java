package Exercise3_Warehouse;

//for name for product and wat to handle the name
class ProductWarehouse extends Warehouse {
    private String productName;

    public ProductWarehouse(String productName,double capacity){
        //call super constructor and intialize it
        super(capacity);
        this.productName = productName;
    }

    public String getName(){
        return this.productName;
    }

    public void setName(String productName){
        this.productName = productName;
    }

    @Override
    public String toString(){
        return getName() + ": " + super.toString();
    }

}
