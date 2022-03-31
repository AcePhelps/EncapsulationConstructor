package Computer;

public class PowerSupply {
    private String make;
    private String model;
    private int power;

    public PowerSupply(String make, String model, int power) {
        this.make = make;
        this.model = model;
        this.power = power;
    }

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
        this.model = model;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "PowerSupply{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", power=" + power +
                '}';
    }
}
