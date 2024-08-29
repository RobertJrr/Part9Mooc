package Example1;
//When  a class implements an interface, it signs an agreement
public class TextMessage implements Readable{

    private String sender;
    private String content;

    public TextMessage(String sender, String content){
        this.sender = sender;
        this.content = content;
    }

    public String getSender(){
        return this.sender;
    }

//    class must contain implementation of String read() method
    public String read(){
        return this.content;
    }

}
