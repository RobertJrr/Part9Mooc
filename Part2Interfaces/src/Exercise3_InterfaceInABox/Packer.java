package Exercise3_InterfaceInABox;

//this class gives a box of things
//defines a factory which is used to create the things
class Packer {
    private Factory factory;

    public Packer(){
        this.factory = new Factory();
    }

    public Box giveABoxOfThings(){
        //create a new BOx object that has max capacity of 10
        Box box = new Box(10);
        int i = 0;
        while(i < 10){
            //produceNew() returns a Packable object,
            // (or more correct, a reference to a Packable object)
            Packable newThing = factory.produceNew();
            box.add(newThing);
            i++;
        }
        return box;
    }
}
