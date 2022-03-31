package lesson10;

public class Kitties extends Cats{
    private int price;

    public Kitties(String name, String gender, String breed, int year, String spray, int price) {
        super(name, gender, breed, year, spray);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
