package lesson10;

public class Dogs extends Pet{
    protected String fixeness;

    public Dogs(String name, String gender, String breed, int year, String fixeness) {
        super(name, gender, breed, year);
        this.fixeness = fixeness;
    }

    public String getFixeness() {
        return fixeness;
    }

    public void setFixeness(String fixeness) {
        this.fixeness = fixeness;
    }
}
