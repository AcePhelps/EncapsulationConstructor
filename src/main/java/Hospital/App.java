package Hospital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class App {
    private static Map<Integer,String> rooms = new HashMap<>();
    private static List<Insurance> insuranses = new ArrayList<>();
    private static List<Doctors> doctors = new ArrayList<>();
    public static void main(String[] args) {
        rooms.put(100,"ANESTHESIOLOGIST");
        rooms.put(101,"PHYSICIAN");
        rooms.put(203,"NEUROLOGIST");
        rooms.put(205,"RADIOLOGIST");
        rooms.put(209,"PEDIATRICIANS");
        insuranses.add(Insurance.ALLSTATE);
        insuranses.add(Insurance.MEDICARE);
        insuranses.add(Insurance.GEICO);
        insuranses.add(Insurance.FARMERS);
        insuranses.add(Insurance.LIBERTY);









        Doctors andy = new Doctors("Andy","Peterson",Position.NEUROLOGIST);
        Doctors tomas = new Doctors("Tomas","Gardner",Position.ANESTHESIOLOGIST);
        Doctors anderson = new Doctors("Anderson","KC",Position.PEDIATRICIANS);
        Doctors david = new Doctors("David","Griffin",Position.PHYSICIAN);
        Doctors patric = new Doctors("Patric","Wilson",Position.RADIOLOGIST);
        doctors.add(0,anderson);
        doctors.add(1,andy);
        doctors.add(2,tomas);
        doctors.add(3,david);
        doctors.add(4,patric);

        Hospital gmc = new Hospital("GMC",new Address("1254 SW 154 st ","Seattle","WA","98156"));
        for(int  i = 0; i <5;i++){

            System.out.println(doctors.get(i).getInfo());

        }
        System.out.println(rooms.entrySet());
        for (Map.Entry a:rooms.entrySet()) {
            System.out.println(a);

        }



    }



}
