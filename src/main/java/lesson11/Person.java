package lesson11;

public class Person {
    private String name;
    private String lasName;
    private int year;
    private Address address;

    public Person(String name, String lasName, int year, Address address) {
        this.name = name;
        this.lasName = lasName;
        this.year = year;
        this.address = address;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
