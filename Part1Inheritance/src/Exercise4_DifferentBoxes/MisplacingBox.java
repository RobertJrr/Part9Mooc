package Exercise4_DifferentBoxes;
//inherits Box class. Can add any items but they are never found when looked for
import java.util.ArrayList;
class MisplacingBox extends Box{
    private ArrayList<Item> items;

    public MisplacingBox(){
        this.items = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        this.items.add(item);
    }

    @Override
    public boolean isInBox(Item item){
        return false;
    }
}
