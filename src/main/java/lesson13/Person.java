package lesson13;

public class Person {
    private String name;
//    public static Person copy(Person p){
//         Person x = new Person;
//
//    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
