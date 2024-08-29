package Exercise3_InterfaceInABox;
import java.util.ArrayList;
public class Box implements Packable{

    private double maxCapacity;
    private ArrayList<Packable> packables;
    public Box(double maxCapacity){
        this.maxCapacity = maxCapacity;
        this.packables = new ArrayList<>();
    }


    //add items as long as total isnt above weight capacity
    public void add(Packable packable){
        //if weight of packable plus currentWeight is less or equal to capacity
        //add the item
        double total = packable.weight() + this.weight();
        if(total <= maxCapacity){
            packables.add(packable);
        }
    }


    //to calculate total weight of box
    public double weight(){
        double weight = 0;
        for(Packable pack : packables){
            weight += pack.weight();
        }
        return weight;
    }

    @Override
    public String toString(){
        return "Box: " + this.packables.size() + " items, total weight: " + this.weight()
                + " kg";
    }


}
