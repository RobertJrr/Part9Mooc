package Example2;

class Main {
    public static void main(String[] args) {
        //calls its own constructor default
        Superclass sup = new Superclass();
        //this intialization calls the super constructor w/ one parameter
        Subclass sub = new Subclass();


        System.out.println(sup);
        //uses toString method from Super
        System.out.println(sub);


    }
}

class Superclass {

    private String objectVariable;

    public Superclass() {
        this("Example");
    }

    public Superclass(String value) {
        this.objectVariable = value;
    }

    public String toString() {
        return this.objectVariable;
    }
}

class Subclass extends Superclass {

    //default constructor calls super constructor with one parameter
    public Subclass() {
        super("Subclass");
    }

    @Override
    public String toString(){
        return super.toString() + " sub class toString";
    }
}


