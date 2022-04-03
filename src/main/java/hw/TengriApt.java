package hw;

import org.w3c.dom.ls.LSOutput;

public class TengriApt implements Apartment{
    protected String name;
    protected int floor;
    protected int price;

    public TengriApt(String name, int floor, int price) {
        this.name = name;
        this.floor = floor;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int floor() {
        return 10;
    }

    @Override
    public int rooms() {
        return 5;
    }

    @Override
    public String getInfo() {
        return "This "+this.name+" has " + this.floor()+ " Floors and "+this.rooms()+ " rooms and you apartment cost "+this.price+" dollars and located on "+this.floor+" floor";
    }
}
