package Exercise4_DifferentBoxes;
import java.util.ArrayList;

//can add an item to BoxWithMaxWeight
class BoxWithMaxWeight extends Box{

    //max weight for box
    private int capacity;
    //list of items in boxwithmaxweight
    ArrayList<Item> items;


    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    //implementing abstract add method from Box class
    @Override
    public void add(Item item){
        //if sum of total weight and item is less than capacity, add to item list
        if(this.totalWeightOfItems() + item.getWeight() <= capacity){
            this.items.add(item);
        }
    }

    //implementing isInBox method
    @Override
    public boolean isInBox(Item item){
        return this.items.contains(item);
    }

    private int totalWeightOfItems(){
        int totalWeight = 0;
        for(Item item : items){
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }





}
