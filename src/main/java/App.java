public class App {
    public static void main(String[] args) {
        Person david = new Person();
//        david.name="David";
//        david.year=1995;

        david.setName("David");
        System.out.println(david.getName());
        david.setLastName("Wilson");
        david.setYear(1995);
        Person anna = new Person();
        anna.setName("Anna");
        anna.setLastName("Peterson");
        anna.setYear(1997);
        anna.setYear(1998);
        System.out.println(anna.getYear());
        Vehicle myCar = new Vehicle();
        myCar.setMake("Toyota");
        myCar.setModel("Camry");
        myCar.setYear(2012);
        Person Ace = new Person("Ace","Phelps",1990);
        System.out.println(Ace.getYear());

        System.out.println(myCar.getModel());
        Ace.printInfo();
        myCar.setModel("Ace]5468789@@");
        System.out.println(myCar.getModel());




    }
}

