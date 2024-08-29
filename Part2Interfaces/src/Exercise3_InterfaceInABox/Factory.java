package Exercise3_InterfaceInABox;
import java.util.Random;
class Factory {

    //default constructor provided by Java

    //can use Interface as return type (just like classes)
    public Packable produceNew(){
        //using random object to draw random numbers
        Random ticket = new Random();

        //draws a number from [0,4). The number will be 0,1,2 or 3
        int number = ticket.nextInt(4);

        if(number == 0){
            return new CD("Pink Floyd","Dark side of the Moon",1973);
        } else if(number == 1){
            return new CD("Wigwam","Nuclear NightClub",1975);
        }else if(number == 2){
            return new Book("Robert Martin","Clean Code",1);
        }else if(number == 3){
            return new Book("Kent Beck","Test Driven Development",0.7);
        }else{
            return new ChocolateBar();
        }
    }
}
