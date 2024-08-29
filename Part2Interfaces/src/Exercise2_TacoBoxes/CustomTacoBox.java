package Exercise2_TacoBoxes;

public class CustomTacoBox implements TacoBox{

    private int tacos;
    public CustomTacoBox(int tacos){
        this.tacos = tacos;
    }

    public int tacosRemaining(){
        return this.tacos;
    }

    public void eat(){
        this.tacos--;
    }

}
