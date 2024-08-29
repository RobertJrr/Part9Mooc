package Example3;
//commonly used interfaces built-in by java

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.List; //interface
import java.util.Map; //interface
import java.util.Set; //interface
import java.util.HashSet; //interface
import java.util.Collection; //interface


class Main {
    public static void main(String[] args) {
//
//        List<String> strings = new ArrayList<>();
//        strings.add("string objects inside an arraylist object!");
//        List<String> strings1 = new LinkedList<>();
//        strings.add("string objects inside a linkedlist object!");
//
//        Map<String,String> maps = new HashMap<>();
//        maps.put("Melena","Robert");
//        maps.put("Chicken","Fries");
//
//        //keys to hashtable obtained by using keyset
//        for(String key : maps.keySet()){
//            System.out.println(key + ": " + maps.get(key));
//            System.out.println(maps.get(key).hashCode());
//        }
//
//        Set<String> set = new HashSet<>();
//        set.add("one");
//        set.add("two");
//        set.add("two");
//
//        for(String piece : set){
//            System.out.println(piece);
//        }

        Map<String,String> translations = new HashMap<>();
        translations.put("ganbatte","good luck");
        translations.put("hai", "yes");


        //get keyset and assign to Set a keys
        //keys is a variable of type Set<String>
        //keys hold reference to the set of keys
        Set<String> keys = translations.keySet();

        //keyCollection is a variable of Collection<String> type
        Collection<String> keyCollection = keys;
        System.out.println("keys: " );
        for(String key : keyCollection){
            System.out.println(key);
        }

        System.out.println();
        System.out.println("Values: ");
        Collection<String> values = translations.values();

        for(String value : values){
            System.out.println(value);
        }


    }
}
