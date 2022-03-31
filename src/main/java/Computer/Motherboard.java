package Computer;

public class Motherboard {
    private String make;
    private String model;
    private Ram memory;
    private CPU cpu;

    public Motherboard(String make, String model, Ram memory, CPU cpu) {
        this.make = make;
        this.model = model;
        this.memory = memory;
        this.cpu = cpu;
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

    public Ram getMemory() {
        return memory;
    }

    public void setMemory(Ram memory) {
        this.memory = memory;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }
}
