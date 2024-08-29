package Example2;
import java.util.ArrayList;

public class ReadingList implements Readable{
    //list that takes readable objects
    private ArrayList<Readable> readables;

    public ReadingList(){
        this.readables = new ArrayList<>();
    }

    public void add(Readable readable){
        this.readables.add(readable);
    }

    public int toRead(){
        return this.readables.size();
    }

    //reads all objects in readables list and addes to the string returned
    //by the read method
    public String read(){
        String read = "";

        for(Readable readable : this.readables){
            read += readable.read() + "\n";
        }
        //once reading list has been read. lets empty readable list
        readables.clear();
        return read;


    }




}
