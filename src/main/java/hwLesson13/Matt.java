package hwLesson13;

public class Matt {
    private String name;
    private String location;
    private int price;

    public Matt(String name, String location, int price) {
        this.name = name;
        this.location = location;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String getInfo(){

        return this.name+" "+this.location+" "+this.price;
    }

}
