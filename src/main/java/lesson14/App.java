package lesson14;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>();
        fruits.add("apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Banana");
        System.out.println(fruits);
        fruits.add("apple");

        System.out.println(fruits);
        System.out.println(fruits.contains("Banana"));

        for (String fruit:fruits
             ) {
            System.out.println(fruit);

        }
    }


}
