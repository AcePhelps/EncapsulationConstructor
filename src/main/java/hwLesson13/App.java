package hwLesson13;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Cats myCat = new Cats("Alice", "Ace", 2);
        Cats tomCat = new Cats("Kat", "Tom", 1);
        Cats samCat = new Cats("Lucy", "Sam", 3);
        Cats donutCat = new Cats("Daniel", "Donald", 4);

        Matt matt = new Matt("Junge","bathroom",20);

        List<Matt> mats = new ArrayList<>();

        mats.add(matt);
        mats.add(new Matt("carpet","Living room", 50));

        System.out.println(mats.get(0).getLocation());
       mats.set(1,new Matt("Pepe","Master bedroom",25));
        mats.add(new Matt("Smarpet","Ding dong", 50));
        mats.add(new Matt("carpet","Living room", 3350));
        mats.add(new Matt("cap"," room", 2540));

        System.out.println(mats.get(1).getName());
        System.out.println(mats.get(0).getInfo());
        for (Matt m : mats){
            System.out.println(m.getInfo());

        }







//
//        List<Integer> numbers = new ArrayList<>();
//
//        numbers.add(5);
//        numbers.add(85);
//        numbers.add(2);
//        numbers.add(7);
//        numbers.set(0, 4);
//        Integer oldNumber = numbers.set(0, 5);
//        numbers.add(oldNumber);
//        numbers.remove(1);
//        numbers.set(0, 8);
//        numbers.contains(5);
//
//        System.out.println(numbers);
//        for (int number : numbers) {
//            System.out.println(number);
//        }
//        numbers.contains(4);
//        System.out.println(numbers.contains(4));


//
//
//        List<String> food = new ArrayList<>();
//     food.add("Mango");
//     food.add("Chimichanga");
//     food.add("Pho");
//     food.add("Ramen");
//        System.out.println(food);
//      List<Integer> sum = new ArrayList<>();
//      List<Cats> cats = new ArrayList<>();
//        sum.add(25);
//        sum.add(45);
//        sum.add(55);
//        sum.add(875);
//        sum.add(258);
//        sum.add(4);
//        cats.add(myCat);
//        cats.add(tomCat);
//        cats.add(samCat);
//        cats.add(donutCat);
//        cats.add(new Cats("Tony","HZ",3));
//
//        System.out.println(cats.get(1).getName());
//        System.out.println(cats.get(2).getName());
//        System.out.println(cats.get(3).getInfo());
//        Cats oldCat = cats.set(4,samCat);
//        Cats oldCat1 = cats.set(4,new Cats("Ace","Dan",42));
//        System.out.println(cats.get(1).getInfo());
//        System.out.println(cats.get(4).getInfo());
//
//        System.out.println(myCat.getInfo());
//        System.out.println(tomCat.getInfo());
//
//
//
    }

}




