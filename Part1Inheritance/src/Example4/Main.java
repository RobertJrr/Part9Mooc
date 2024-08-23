package Example4;

//Generally, abstract classes are used in situations where the concept
// that the class represents is not a clear independent concept.
// In such a case you shouldn't be able to create instances of it.

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface(new Scanner(System.in));
        ui.addOperation(new PlusOperation());

        ui.start();

    }
}
