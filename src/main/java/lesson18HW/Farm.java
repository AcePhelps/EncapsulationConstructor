package lesson18HW;

import java.util.*;

public class Farm {
    private String name;
    private Address adress;
    private Map<Cattle, Integer> cattle;
    private List<AgreeCultural> cultural;

    public Farm(String name, Address adress, Map<Cattle, Integer> cattle, List<AgreeCultural> cultural) {
        this.name = name;
        this.adress = adress;
        this.cattle = cattle;
        this.cultural = cultural;
    }

    public Farm() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAdress() {
        return adress;
    }

    public void setAdress(Address adress) {
        this.adress = adress;
    }

    public Map<Cattle, Integer> getCattle() {
        return cattle;
    }

    public void setCattle(Map<Cattle, Integer> cattle) {
        this.cattle = cattle;
    }

    public List<AgreeCultural> getCultural() {
        return cultural;
    }

    public void setCultural(List<AgreeCultural> cultural) {
        this.cultural = cultural;
    }


    public void getInfo1() {
       System.out.println("Farm  " + getName() + " " + getAdress().getInfo());
        System.out.println(" Agrecultural info  = ");
       getAllinfoOfAgreeCultural();
        System.out.println(" Cattle  info  = ");
       getMapInfo();
    }
    public List getlistInfo() {
        return getCultural();
    }

    public void getMapInfo() {
        for (Map.Entry<Cattle, Integer> entry : cattle.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }


    }

    public void getAllinfoOfAgreeCultural(){
        for (AgreeCultural a : cultural ){
            System.out.println(a.getNameOfCulture()+"  "+a.getFieldNumber());
        }

        }
}


