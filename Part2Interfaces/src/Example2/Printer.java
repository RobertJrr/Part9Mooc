package Example2;

public class Printer {
    //method can be given any class that implements Readable interface
    public void print(Readable readable){
        System.out.println(readable.read());
    }
}
