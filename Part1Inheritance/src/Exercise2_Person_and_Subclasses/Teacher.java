package Exercise2_Person_and_Subclasses;

//class teacher inherits Person class
class Teacher extends Person{

    private int monthlyIncome;

//    calls default super constructor
    public Teacher(){
        this.monthlyIncome = 0;
    }

    public Teacher(String name,String address,int monthlyIncome){
        super(name,address);
        this.monthlyIncome = monthlyIncome;
    }

    @Override
    public String toString(){
        return super.toString() + "\n\t" + this.monthlyIncome + " dollars/month";
    }




}
