package Exercise2_Person_and_Subclasses;

import java.util.ArrayList;
class Main {
    public static void main(String[] args) {

//        Teacher robert = new Teacher("Robert Melena", "123 lettuce Avenue, Bean CA",3000);
//        Teacher esme = new Teacher("Esme Melena", "124 lettuce Avenue, Bean CA",3000);
//        System.out.println(robert);
//        System.out.println(esme);
//
//        Student choco = new Student("Choco","123 elm Street");
//
//        int i = 0;
//        while(i < 25){
//            choco.study();
//            i++;
//        }
//
//        System.out.println(choco);

//         If Person has methods that are overridden in Student, calling
//         these methods on a Person reference pointing to a Student object
//         will invoke the Student version of the method.
//         This is a key feature of polymorphism.

        //reference type is Person, actual type is Student
        //referencing Student type object in Person type variable
        Student robert = new Student("Robert", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(robert); //calls student toString method

        Person robertPerson = new Student("Robert", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(robertPerson); //calls toString in Student class bc its overriding Person

        Object robertObject = new Student("Robert", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(robertObject); ////calls student toString method

        Object esme = new Student("Esme", "177 Stewart" +
                " Ave. Farmington, ME 04938");
        System.out.println(esme);//calls student toString method

        //The method to be executed is chosen based
        // on the actual type of the object (Student),
        // which means the class whose constructor is
        // called when the object is created(Student).
    }


    public static void printPersons(ArrayList<Person> persons){
        for(Person p : persons){

        }
    }
}






