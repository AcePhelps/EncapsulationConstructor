package lesson11;

public class App {
    public static void main(String[] args) {
        Address myAdress = new Address("12 elm st","Gotham City",33604,State.Fl);

        Person anna = new Person("Anna","Willson",1995,myAdress);

        String city = anna.getAddress().getCity();
        System.out.println(city);


        Address davidAddress = new Address("345 qeens bld","New york city ",11223,State.NY);

        Person david = new Person("David","Peterson",1990,davidAddress);
        Team dreamTeam = new Team(anna,david);

        State state = dreamTeam.getMember().getAddress().getState();
        System.out.println(state);
    }

}
