package Example4;
//public abstract class *NameOfClass*
//public abstract returnType nameOfMethod

import java.util.Scanner;
abstract class Operation {
    private String name;

    public Operation(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public abstract void execute(Scanner scanner);
}
