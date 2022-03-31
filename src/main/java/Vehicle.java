import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vehicle {
    private String make;
    private String model;
    private int year;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        ifContainSpecialCharachter(model);

        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public static void ifContainSpecialCharachter(String model) {
        Pattern p = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher("I am a string");
        boolean b = m.find();
        if (b)
            System.out.println("There is a special character in my string");
    }

}
