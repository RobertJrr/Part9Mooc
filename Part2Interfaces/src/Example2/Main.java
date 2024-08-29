package Example2;

import org.w3c.dom.Text;

import java.sql.Array;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

//        TextMessage message = new TextMessage("ope", "Oh wow, this printer knows how to print these as well!");
//
//        ArrayList<String> pages = new ArrayList<>();
//
//        pages.add("Values common to both {1, 3, 5} and {2, 3, 4, 5} are {3, 5}.");
//
//        Ebook ebook = new Ebook("Introduction to Uni. Math", pages);
//        Printer printer = new Printer();
//        printer.print(ebook);
//        printer.print(message);

        //---------------
//        ReadingList jonisList = new ReadingList();
//        ArrayList<String> pages = new ArrayList<>();
//        pages.add("First page and some words");
//        pages.add("Second pages and some words");
//
//        jonisList.add(new Ebook("Harry Potter",pages));
//        jonisList.add(new TextMessage("arto", "have you written the tests yet?"));
//
//        System.out.println("Jonis to-read stuff: " + jonisList.toRead());

        ReadingList jonisList = new ReadingList();
        int i = 0;
        while(i < 1000){
            jonisList.add(new TextMessage("Arto","Did you study for test?"));
            i++;
        }

        System.out.println("Jonis's to read list: " + jonisList.toRead());
        System.out.println("Delegating reading ot verna");

        ReadingList verna = new ReadingList();
        //ReadingList is of type Readable so we can pass jonisList to
        //add method that takes Readable type
        verna.add(jonisList);
        System.out.println(verna.read()); //reads all the pages in Jonis list, thus pages left is 0 after call
        System.out.println("Joni's to-read: " + jonisList.toRead());




    }
}
