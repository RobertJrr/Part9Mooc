package Exercise2_TacoBoxes;

public class Main {
    public static void main(String[] args) {
        TripleTacoBox box = new TripleTacoBox();
        System.out.println(box.tacosRemaining());
        box.eat();
        System.out.println(box.tacosRemaining());
    }
}
