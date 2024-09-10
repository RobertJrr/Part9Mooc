package exercise1_herds;

public class Main {
    public static void main(String[] args) {

        Herd herd = new Herd();
        herd.addtoHerd(new Organism(57, 66));
        herd.addtoHerd(new Organism(73, 56));
        herd.addtoHerd(new Organism(46, 52));
        herd.addtoHerd(new Organism(19, 107));

        herd.move(20,20);
        System.out.println(herd);
    }
}
