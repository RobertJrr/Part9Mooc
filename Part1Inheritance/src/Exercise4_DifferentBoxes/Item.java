package Exercise4_DifferentBoxes;

import java.util.Objects;

class Item {

    private String name;
    private int weight;

    public Item(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public Item(String name){
        //calls constructor that has two parameters
        this(name,0);
    }

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * 7 + weight;
        hash = 31 * hash + (name == null ? 0 : name.hashCode());
        return hash;
    }
    @Override
    public boolean equals(Object obj){
        //if references same adress in memory, return true
        if(this == obj){
            return true;
        }

        if(obj == null){
            return false;
        }
        if(!(obj instanceof Item)){
            return false;
        }
        //cast obj to item
        Item item = (Item) obj;
        return this.getName().equals(item.getName());
    }
}
