package Computer;

public class Ram {
    private String make;
    private String model;
    private int memorySize;

    public Ram(String make, String model, int memorySize) {
        this.make = make;
        this.model = model;
        this.memorySize = memorySize;
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

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", memorySize=" + memorySize +
                '}';
    }
}
