package Exercise3_Warehouse;
//
 class Warehouse {

     private double capacity; //total capacity of warehouse
     private double balance; //capacity taken up by items

     public Warehouse(double capacity){
         if(capacity < 0){
             this.capacity = 0;
         } else{
             this.capacity = capacity;
         }
         this.balance = 0;
     }

     //get total balance (capacity) that items are taking up
     public double getBalance(){
         return this.balance;
     }

     //Get total overall capacity of warehouse
     public double getCapacity(){
         return this.capacity;
     }

     //return how much space left available
     public double howMuchSpaceLeft(){
         double space = capacity - balance;
         String spaceString = String.format("%2f",space);
         return Double.parseDouble(spaceString);
     }

     //add to warehouse
    public void addToWarehouse(double amount){
         if(amount > 0){
             if(amount + balance > capacity){
                 this.balance = capacity;
             } else{
                 balance += amount;
             }
         }
    }

     //take desired amount from warehouse
     public void takeFromWarehouse(double amount){
         //if amount to take is greater than balance, take all balance
         if(amount >= balance){
             double tempBalance = this.balance; //temp holder to hold total balance to return
             this.balance -= this.balance; //subtract balance from balance, we take all balance
//             return tempBalance;
         } else if(amount < balance){
             this.balance = this.balance - amount;
//             return this.balance;
         }

         //execute if amount is less than 0
//         return 0;
     }

     //toString method
     @Override
     public String toString(){
         return "balance = " + this.getBalance() + ", space left " + this.howMuchSpaceLeft();
     }

}
