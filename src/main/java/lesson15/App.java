package lesson15;

public class App {
    public static void main(String[] args) {
        Person anna = new Person("Anna","Willson");
        Person daid = new Person("David","Kingston");
      //  Person.hello();// static function works only for class;
//        anna.hi();
        anna.printCount();
        daid.printCount();
        Person robert = new Person("Bob","Digenston");
    anna.printCount();
    daid.printCount();
    robert.printCount();
    }
}
