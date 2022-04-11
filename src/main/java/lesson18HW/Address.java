package lesson18HW;

public class Address {
    private String numberofStreet;
    private String city;
    private String state;
    private int zip;

    public Address(String numberofStreet, String city, String state, int zip) {
        this.numberofStreet = numberofStreet;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public String getNumberofStreet() {
        return numberofStreet;
    }

    public void setNumberofStreet(String numberofStreet) {
        this.numberofStreet = numberofStreet;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }
    public String getInfo(){
        return "\n Address is "+getNumberofStreet()+ ", " + getCity()+", "+getState()+", "+getZip();
    }
}
