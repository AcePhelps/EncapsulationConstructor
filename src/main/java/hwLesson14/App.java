package hwLesson14;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        DogsBreed dogsBreed =new DogsBreed("puppy");
        Dogs tony = new Dogs("Tony","FB",Breed.FRENCH_BULLDOG);

        tony.getBreed();
        System.out.println(tony.breed + " ---> "+dogsBreed.getType());


        Map<Dogs,DogsBreed> forSale = new HashMap<>();
        forSale.put(tony,dogsBreed);
        System.out.println(forSale.entrySet());
        System.out.println(forSale.put(new Dogs("Antony","DB",Breed.DOBERMAN),new DogsBreed("Adult")));
        System.out.println();

        Map<String,String> computers = new HashMap<>();
        computers.put("Dell","Monitor");
        computers.put("Samsung","Motherboard");
        computers.put("MSI","Processor");
        computers.put("Sony","Mouse");

        System.out.println(computers);
        System.out.println(computers.get("MSI"));
        System.out.println(computers.get(("Sony")));
        System.out.println(computers);

        for (String s : computers.values()){
            System.out.println(s);
        }
        for (String s : computers.keySet()){
            System.out.println(s);
        }

        for (Map.Entry<String,String> a : computers.entrySet()){
            System.out.println(a);
        }


        System.out.println("----------------------------------------------------------");

        Map<Integer,String > lockers = new HashMap<>();
        lockers.put(0,"Boots");
        lockers.put(1,"backPack");
        lockers.put(5,"Top");
        lockers.put(8,"Pants");
        lockers.put(12,"Glasses");
        lockers.put(254,"Basketball ball");

        lockers.replace(5,"T-shirt");
        lockers.remove(0);
        System.out.println(lockers.get(8));

        System.out.println(lockers.get(5));

        for (Integer v:lockers.keySet()) {
            System.out.println(v);

        }
        for (String s : lockers.values()){
            System.out.println(s);
        }

        for (Map.Entry<Integer,String > get : lockers.entrySet()){
            System.out.println(get);
        }








    }
}
//Create 3 HashMap- <String,String>, <Integer,String> and custom classes <Class1,Class2>
//add 4 elements to each hashmap
//        try methods  put/replace/remove/get/foreach
//        Create 2 HashSet- <String>,  and custom classes <Class1>
//add 4 elements to each hashset
//        try methods  put/replace/remove/get/foreach

