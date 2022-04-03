package lesson14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class App1 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Banana");


        Iterator<String> iterator= fruits.iterator();
        boolean x = true;
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
