package Exercise4_DifferentBoxes;

//inherits box clas
//has capacity of only one item

import java.util.ArrayList;
class OneItemBox extends Box{

    private ArrayList<Item> items;

    public OneItemBox(){
        this.items = new ArrayList<>();
    }

    //implementing abstract methods in parent class

    @Override
    public void add(Item item){
        //if no item (can only hold one) add item to list
        if(items.size() < 1){
            items.add(item);
        }
    }

    @Override
    public boolean isInBox(Item item){
        return this.items.contains(item);
    }





}
