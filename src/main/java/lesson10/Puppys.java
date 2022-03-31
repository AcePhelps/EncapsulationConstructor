package lesson10;

public class Puppys extends Dogs{
    private int Price;

    public Puppys(String name, String gender, String breed, int year, String fixeness, int price) {
        super(name, gender, breed, year, fixeness);
        Price = price;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}
