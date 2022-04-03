package lesson14;

import java.util.*;

public class App2 {
    public static void main(String[] args) {
        Map<String,String> capitals = new HashMap<>();

        capitals.put("Germany","Berlin");
        capitals.put("China","Bejing");
        capitals.put("India","New Delhi");
        capitals.put("Canada","Ottawa");


        System.out.println(capitals);
        System.out.println(capitals.get("Canada"));

        List<String> colors1 = new ArrayList<>();
        colors1.add("Red");
        colors1.add("Green");
        colors1.add("Yellow");
        colors1.add("Red");
        colors1.add("Pink");


        System.out.println(colors1.get(2));

        Map<Integer,String> colors = new HashMap<>();
        colors.put(0,"Red");
        colors.put(1,"Green");
        colors.put(2,"Yellow");
        colors.put(3,"Red");
        colors.put(10,"Pink");
        System.out.println(colors.get(2));
        capitals.put("Germany","Bonn");
        capitals.put("Great Britain","London");
        capitals.put("England","London");

        System.out.println(capitals);
        capitals.remove("England");
        capitals.replace("Germany","Berlin");
        System.out.println(capitals);
for (String keys : capitals.keySet()){
    System.out.println(keys);

    for (String v:capitals.values()){
        System.out.println(v);
    }



    for(Map.Entry<String,String> entry: capitals.entrySet()){
        System.out.println(entry.getKey()+" "+entry.getValue());
    }





}

//      Collection<String> values = capitals.values();
//        System.out.println(values);
//        for (String value:values){
//            System.out.println(value);
//        }

//        Set<String> key = capitals.keySet();
//        System.out.println(key);
//        for(String keys : key ){
//            System.out.println(keys);
//        }
//

    }

}
