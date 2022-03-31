package Computer;

import org.w3c.dom.ls.LSOutput;

public class App {
    public static void main(String[] args) {


        CPU cpu = new CPU("Microsoft", "T250", 1000);
        Disc disc = new Disc("Japan", "Int100", 256, DiscType.HDD);
        GraphicAdapter graphicAdapter = new GraphicAdapter("USA", "intel500", 512, "Anti2");
        Keyboard keyboard = new Keyboard("Intel", "Ace111");
        Monitor monitor = new Monitor("Samsung", "9000", 17);
        Ram ramAce = new Ram("Sony", "r200", 2000);
        Motherboard motherboard = new Motherboard("Lenovo", "t200", ramAce, cpu);
        Mouse mouse = new Mouse("logitech", "m100");
        PowerSupply powerSupply = new PowerSupply("China", "A500", 2400);
        SystemBlock systemBlock = new SystemBlock(powerSupply, disc, motherboard, graphicAdapter);
        Computer computerAce = new Computer(keyboard, mouse, monitor, systemBlock);
        Computer computerSankriti = new Computer(new Keyboard("HP","t022"),new Mouse("logitech","E200"),new Monitor("MSI","Y2",17),new SystemBlock(new PowerSupply("HP","122",564),new Disc("HP","p51",512,DiscType.SSD),new Motherboard("HP","Y987",new Ram("Sony","544",1024),new CPU("hp","t200",500)),new GraphicAdapter("Japan","rt800",500,"fan")));

        System.out.println(computerAce.getSystemBlock().getMotherboard().getCpu());
        System.out.println(computerSankriti.getSystemBlock().getMotherboard().getCpu());
    }
}