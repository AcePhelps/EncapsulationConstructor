package lesson10;

public class App {
    public static void main(String[] args) {
        Person david = new Person("David","Samznaesh",1990);
        Student Ace = new Student("Ace","Phelps",1990,1111,"math");
        Teacher Sam = new Teacher("Sam","Johns",1956,"History");
        System.out.println(Ace.getLastName());
        ParttimeTeacher Alice = new ParttimeTeacher("Alice","Dawny",1986,"Biology","9-5");
        System.out.println(Alice.lastName);
    }
}
