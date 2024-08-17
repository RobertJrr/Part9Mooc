package Exercise2_Person_and_Subclasses;

class Person {
    private String name;
    private String address;

    public Person(){
        this.name = "N/A";
        this.address = "N/A";
    }
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    @Override
    public String toString(){
        return this.name + "\n\t" + this.address;
    }
}
