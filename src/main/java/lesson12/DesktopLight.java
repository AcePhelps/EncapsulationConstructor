package lesson12;

public class DesktopLight implements UsElectricalPlug{
    private String model;
    private int price;

    public DesktopLight(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void keepPlugStandard() {
        System.out.println("I keep US plug Standart");
    }
}
