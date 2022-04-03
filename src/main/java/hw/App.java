package hw;

public class App {
    public static void main(String[] args) {
        TengriApt tengriApt = new TengriApt("Tengri Apartments",4,1550);
        System.out.println(tengriApt.getInfo());
        BiGroup biGroup = new BiGroup("Bi group",7,2200);
        System.out.println(biGroup.getInfo());

    }
}
