package Computer;

public class Disc {
    private String make;
    private String model;
    private int size;
    private DiscType discType;

    public Disc(String make, String model, int size,DiscType discType) {
        this.make = make;
        this.model = model;
        this.size = size;
        this.discType = discType;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public DiscType getDiscType() {
        return discType;
    }

    public void setDiscType(DiscType discType) {
        this.discType = discType;
    }

    @Override
    public String toString() {
        return "Disc{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                ", discType=" + discType +
                '}';
    }
}
