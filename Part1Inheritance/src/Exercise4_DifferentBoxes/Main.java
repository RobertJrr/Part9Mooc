package Exercise4_DifferentBoxes;

class Main {
    public static void main(String[] args) {
        BoxWithMaxWeight coffeebox = new BoxWithMaxWeight(10);

        //calling add method and creating new Item object to be added to list
        //within BoxWithMaxWeight class
//        coffeebox.add(new Item("Saludo",5));
//        coffeebox.add(new Item("Creamer",5));
//        coffeebox.add(new Item("Sugar",5));
//
//        //Print out if items are in box or not
//        System.out.println(coffeebox.isInBox(new Item("Saludo")));
//        System.out.println(coffeebox.isInBox(new Item("Creamer")));
//        System.out.println(coffeebox.isInBox(new Item("Sugar")));



        OneItemBox box = new OneItemBox();
        box.add(new Item("Saludo",5));
        box.add(new Item("Pirkka",5));

        System.out.println(box.isInBox(new Item("Saludo"))); //true
        System.out.println(box.isInBox(new Item("Pirkka"))); //false

        MisplacingBox misplacingBox = new MisplacingBox();
        misplacingBox.add(new Item("Saludo", 5));
        misplacingBox.add(new Item("Pirkka", 5));

        System.out.println(misplacingBox.isInBox(new Item("Saludo"))); //false
        System.out.println(misplacingBox.isInBox(new Item("Pirkka"))); //false

    }
}
