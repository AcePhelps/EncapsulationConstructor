package hwLesson13;

import java.util.ArrayList;

public class Cats {
    private String name;
    private String owner;
    private int year;

    public Cats(String name, String owner, int year) {  ArrayList<String> food = new ArrayList<>();

        this.name = name;
        this.owner = owner;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public String getInfo(){
        return "This cat is "+getName() +" and the owner is = "+getOwner()+" the cat is "+getYear()+" years old";
    }
}
