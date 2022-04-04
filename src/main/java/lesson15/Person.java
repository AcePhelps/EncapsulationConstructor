package lesson15;

public class Person {
    private String name;
    private String lasName;
    private static int count = 0;


    public Person(String name, String lasName) {
        this.name = name;
        this.lasName = lasName;
        count++;
    }
    public void printCount(){
        System.out.println(count);
    }
    public static void hello(){
        System.out.println("Hello");
    }
    public void hi (){
        System.out.println("Hi");
        hello();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

}
