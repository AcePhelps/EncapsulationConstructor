package lesson18HW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {







    public static void main(String[] args) {
        Address address = new Address("4400 s aurora st","Denver","Co",80012);
        Map<Cattle,Integer> cattle = new HashMap<>();
        cattle.put(Cattle.TURKEYS,5);
        cattle.put(Cattle.SHIPS,10);
        cattle.put(Cattle.PIGS,24);
        cattle.put(Cattle.COWS,50);
        cattle.put(Cattle.CHICKEN,250);
        List<AgreeCultural> cultural = new ArrayList<>();
        cultural.add(new AgreeCultural("Pea",25));
        cultural.add(new AgreeCultural("Garbanzo",10));
        cultural.add(new AgreeCultural("Rose",45));
        Farm ace = new Farm("Ace farm ",address,cattle,cultural);

        ace.getInfo1();



























    }

}
//Create a class Farm
//fields
//private String name;
//private Address address; ()
//private Map<Cattle,Integer> cattle; (Cattle - enum - Cattle.COWS,     Cattle.SHEEPS, Cattle.PIGS, Cattle.CHICKENS, Cattle.TURKEYS... Value    - Integer - number of animals of each kind)
//private List<AgreeCultural> agreeCultural;
//    AgreeCultural - class
//    private String nameOfCulture; Wheet, Soya, Pea
//    private int fielsNumber;
//
//method printInfo() - print out all info
