package exercise1_herds;

import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {

    private List<Movable> organisms;

    public Herd(){
        this.organisms = new ArrayList<>();
    }

    public void addtoHerd(Movable movable){
        this.organisms.add(movable);
    }

    @Override
    public String toString(){
        String info = "";

        for(Movable movable : organisms){
            info += movable.toString();
        }
        return info;
    }

    public void move(int x, int y){
        for(Movable organism : organisms){
            organism.move(x,y);
        }
    }


}
