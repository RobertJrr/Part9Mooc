package Exercise2_Person_and_Subclasses;

//Class Student inherits Person Class
class Student extends Person{

    private int credits;

//    Calls default Super constructor
    public Student(){
        super();
        this.credits = 0;
    }
    public Student(String name, String address){
        super(name,address);
        this.credits = 0;
    }

    public int credits(){
        return this.credits;
    }

//    Adds one credit everytime student studies
    public void study(){
        this.credits++;
    }

    //override super method of toString
    @Override
    public String toString(){
        return super.toString() + "\n\tStudy Credits " + this.credits;
    }


}
