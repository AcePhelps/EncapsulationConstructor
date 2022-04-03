package lesson13;

import java.util.ArrayList;

public class App3 {
    public static void main(String[] args) {
        ArrayList<String> fruits =new ArrayList<>();
        System.out.println(fruits.size());
        fruits.add("Apple");
        System.out.println(fruits);
        fruits.add("Watermalon");
        fruits.add("Plum");
        fruits.add("Kiwi");
        System.out.println(fruits);
        System.out.println(fruits.size());
        fruits.add(1,"Orange");
//        fruits.add(10,"Peach");
        System.out.println(fruits);
        System.out.println(fruits.get(4));
        String oldFruits = fruits.set(1,"Lemon");
        fruits.add(oldFruits);
        System.out.println(fruits);
        fruits.remove(2);
        System.out.println(fruits);
        fruits.remove("Plum");
        System.out.println(fruits);
        System.out.println(fruits.contains("Apple"));
    }
}
