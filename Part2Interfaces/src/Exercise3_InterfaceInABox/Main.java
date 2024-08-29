package Exercise3_InterfaceInABox;

class Main {
    public static void main(String[] args) {
        //book1 is a reference variable which refers the object of Book class
        //when creating an object of Book class new Book; it returns a reference of the object.
        // this reference is stored in reference variable book1
        Book book1 = new Book("Fyodor Dostoevsky", "Crime and Punishment", 2);
        Book book2 = new Book("Robert Martin", "Clean Code", 1);
        Book book3 = new Book("Kent Beck", "Test Driven Development", 0.7);

        CD cd1 = new CD("Pink Floyd", "Dark Side of the Moon", 1973);
        CD cd2 = new CD("Wigwam", "Nuclear Nightclub", 1975);
        CD cd3 = new CD("Rendezvous Park", "Closer to Being Here", 2012);

        //creating new object which returns a reference of object and assigns to reference variable box
        //box is a reference variable of Box type
        //holds reference to an instance of Box class
        Box box = new Box(10);

        box.add(book1);
        box.add(book2);
        box.add(book3);
        box.add(cd1);
        box.add(cd2);
        box.add(cd3);

        System.out.println(box);

        //creating small boxes

        Box smallBox1 = new Box(10);
        Box smallBox2 = new Box(15);
        Box largeBox = new Box(25);

        smallBox1.add(new Book("Marvel","Spider-Man1",5));
        smallBox1.add(new Book("Marvel","Spider-Man2",3));
        smallBox1.add(new Book("Marvel","Spider-Man3",2));

        smallBox2.add(new Book("Marvel","Wolverine1",1));
        smallBox2.add(new Book("Marvel","Wolverine2",5));
        smallBox2.add(new Book("Marvel","Wolverine3",5));
        smallBox2.add(new Book("Marvel","Wolverine3",3));

        largeBox.add(smallBox1);
        largeBox.add(smallBox2);

        System.out.println(largeBox.weight());

        //when largeBox.weight() method is called
        //it goes through ITS packables which are smallBox1 and smallBox2
        //first smallBox1, which also calls pack.weight() method
        //then WITHIN smallBox1 it loops through ITS packables in  which are the Books(also packables that implement packable interface)
        //those Book objects also call their own weight method, and return each of their own weight to be added
        //returns back to weight method for smallBox1, then returns to Largebox weight method and adds thr weight calcualted
        //then repeat for smallBox2


//        System.out.println(book1);
//        System.out.println(book2);
//        System.out.println(book3);
//        System.out.println(cd1);
//        System.out.println(cd2);
//        System.out.println(cd3);


    }

}
