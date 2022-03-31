package Computer;

public class CPU {
    private String make;
    private String model;
    private int frequency;

    public CPU(String make, String model, int frequency) {
        this.make = make;
        this.model = model;
        this.frequency = frequency;
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

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}
