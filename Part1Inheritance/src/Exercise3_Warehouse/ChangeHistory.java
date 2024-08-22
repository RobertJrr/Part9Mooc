package Exercise3_Warehouse;

import java.util.ArrayList;
public class ChangeHistory {

    private ArrayList<Double> history;
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }

    public void add(double status){
        this.history.add(status);
    }

    public void clear(){
        this.history.clear();
    }

    //Analysis methods

    //return largest value in change history
    public double maxValue(){
        if(this.history.isEmpty()){
            return 0;
        }
        double max = this.history.get(0);
        for(Double aChange : history){
            if(aChange > max) {
                max = aChange;
            }
        }
        return max;
    }

    public double minValue(){
        if(this.history.isEmpty()){
            return 0;
        }
        double min = this.history.get(0);
        for(Double aChange : history){
            if(aChange < min) {
                min = aChange;
            }
        }
        return min;
    }

    //return average values of the change history
    public double average(){
        if(this.history.isEmpty()){
            return 0;
        }
        double sum = 0;
        for(Double aChange : history) {
            sum += aChange;
        }
        return sum / history.size();
    }

    @Override
    public String toString(){
        //calls arraylist default string
        return "" + this.history;
    }


}
