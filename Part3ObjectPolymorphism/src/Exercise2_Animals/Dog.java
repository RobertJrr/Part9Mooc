package Exercise2_Animals;

public class Dog extends Animal implements NoiseCapable{

    public Dog(){
        super("Dog");
    }

    //Contsructor that takes name as parameter
    //calls super constructor to intialize name
    public Dog(String name){
        super(name);
    }

    public void bark(){
        System.out.println(this.getName() + " barks");
    }

    public void makeNoise(){
        bark();
    }








}
