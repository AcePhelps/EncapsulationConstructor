package lesson10;

public class Cats extends Pet{
    protected String spray;

    public Cats(String name, String gender, String breed, int year, String spray) {
        super(name, gender, breed, year);
        this.spray = spray;
    }

    public String getSpray() {
        return spray;
    }

    public void setSpray(String spray) {
        this.spray = spray;
    }
}
