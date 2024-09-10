package Exercise2_Animals;

public class Main {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.eat();
//        dog.bark();
//
//        Dog fido = new Dog("Fido");
//        fido.bark();
//
//
//        Cat cat = new Cat();
//        Cat tom = new Cat("Tom");
//
//        cat.purr();
//        tom.purr();
//        cat.eat();
//        tom.eat();


        NoiseCapable dog = new Dog();
        dog.makeNoise();

        NoiseCapable cat = new Cat("Tom");
        cat.makeNoise();
        Cat c = (Cat)cat;
        c.makeNoise();


    }


}
