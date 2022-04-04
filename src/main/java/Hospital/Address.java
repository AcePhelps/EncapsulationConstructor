package Hospital;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.List;

public class Address {
    private String streetAdress;
    private String town;
    private String state;
    private String zip;


    public Address(String streetAdress, String town, String state, String zip) {
        this.streetAdress = streetAdress;
        this.town = town;
        this.state = state;
        this.zip = zip;

    }


    public String getStreetAdress() {
        return streetAdress;
    }

    public void setStreetAdress(String streetAdress) {
        this.streetAdress = streetAdress;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }


    public String getInfo(){
        return "Hospital Adress is : "+streetAdress+" , "+town+" , "+state+" , "+zip;
    }
}
