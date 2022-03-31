package Computer;

public class GraphicAdapter {
    private String make;
    private String model;
    private int memorySize;
    private String gpu;

    public GraphicAdapter(String make, String model, int memorySize, String gpu) {
        this.make = make;
        this.model = model;
        this.memorySize = memorySize;
        this.gpu = gpu;
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

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return "GraphicAdapter{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", memorySize=" + memorySize +
                ", gpu='" + gpu + '\'' +
                '}';
    }
}
