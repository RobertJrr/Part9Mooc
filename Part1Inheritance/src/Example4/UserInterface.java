package Example4;

import java.util.Scanner;
import java.util.ArrayList;
public class UserInterface {
    private Scanner scanner;
    private ArrayList<Operation> operations;

    public UserInterface(Scanner scanner){
        this.scanner = scanner;
        this.operations = new ArrayList<>();
    }

    public void addOperation(Operation operation){
        operations.add(operation);
    }

    public void start(){
        while(true){
            //print operations we have
            printOperations();
            //get choice operation
            System.out.println("\tChoice: ");
            String choice = this.scanner.nextLine();
            //if user enters 0, break
            if(choice.equals("0")){
                break;
            }

            //execute operation based on user input
            executeOperation(choice);
            System.out.println();
        }
    }

    //method to print operation
    private void printOperations(){
        System.out.println("\t0: Stop");
        int i = 0;
        while(i < this.operations.size()){
            //get name of operation, should only be PlusOperation in this example
            String operationName = this.operations.get(i).getName();
            //print the operations available
            System.out.println("\t" + (i + 1) + ": " + operationName);
            //increment
            i++;
        }
    }

    //method to execute operation
    private void executeOperation(String choice){
        //parse String to Integer
        int operation = Integer.valueOf(choice);
        //get specified Operation in operations arraylist based on index(choice number)
        //Declare a variable named chosen of operation type to hold Operation object
        Operation chosen = this.operations.get(operation - 1);
        //call execute method of chosen Operation object
        chosen.execute(scanner);
    }
}
