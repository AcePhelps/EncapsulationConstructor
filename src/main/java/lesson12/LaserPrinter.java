package lesson12;

public class LaserPrinter implements UsElectricalPlug{

    @Override
    public void keepPlugStandard() {
        System.out.println("Hi i can work in US");
    }
}
