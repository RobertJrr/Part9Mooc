package Example4;
import java.util.Scanner;
public class PlusOperation extends Operation{

    public PlusOperation(){
        super("PlusOperation");
    }

    //overrding abstract execute method in super class Operation
    @Override
    public void execute(Scanner scanner){
        System.out.print("First number: ");
        int first = Integer.valueOf(scanner.nextLine());
        System.out.print("Second number: ");
        int second = Integer.valueOf(scanner.nextLine());

        System.out.println("The sum of the numbers is " + (first + second));
    }

}
