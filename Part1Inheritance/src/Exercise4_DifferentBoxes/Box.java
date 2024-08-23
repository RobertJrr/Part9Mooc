package Exercise4_DifferentBoxes;
import java.util.ArrayList;
abstract class Box {

    //abstract method that subclass must implement
    //meant to add a single item. subclass will have  own implementation of this
    public abstract void add(Item item);

    public void add(ArrayList<Item> items){
        for(Item item : items){
            //calling method add of this class
            Box.this.add(item);
        }
    }

    public abstract boolean isInBox(Item item);
}
