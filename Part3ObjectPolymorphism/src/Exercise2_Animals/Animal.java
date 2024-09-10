package Exercise2_Animals;

public abstract class Animal {

    private String name;

    protected Animal(String name){
        this.name = name;
    }

     public void eat(){
        System.out.println(this.name + " eats");
     }
     public void sleep(){
        System.out.println(this.name + "sleeps");
     }

     public String getName(){
        return this.name;
     }
}
