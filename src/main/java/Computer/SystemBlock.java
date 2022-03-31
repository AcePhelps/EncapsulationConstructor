package Computer;

public class SystemBlock {
    private PowerSupply powerSupply;
    private Disc disc;
    private Motherboard motherboard;
    private GraphicAdapter graphicAdapter;

    public SystemBlock(PowerSupply powerSupply, Disc disc, Motherboard motherboard, GraphicAdapter graphicAdapter) {
        this.powerSupply = powerSupply;
        this.disc = disc;
        this.motherboard = motherboard;
        this.graphicAdapter = graphicAdapter;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Disc getDisc() {
        return disc;
    }

    public void setDisc(Disc disc) {
        this.disc = disc;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public GraphicAdapter getGraphicAdapter() {
        return graphicAdapter;
    }

    public void setGraphicAdapter(GraphicAdapter graphicAdapter) {
        this.graphicAdapter = graphicAdapter;
    }

    @Override
    public String toString() {
        return "SystemBlock{" +
                "powerSupply=" + powerSupply +
                ", disc=" + disc +
                ", motherboard=" + motherboard +
                ", graphicAdapter=" + graphicAdapter +
                '}';
    }
}
