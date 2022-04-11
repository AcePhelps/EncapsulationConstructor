package CraziestHomeworkEver;

public class App {
    public static void main(String[] args) {

        Life.Animals.Vertebrates.Mammals.Carnivores.Lion  we = new Life.Animals.Vertebrates.Mammals.Carnivores.Lion(23,"asd");

       we.canBreath();
       we.iHaveAFur();
       we.isAlive();

    }
}
//Life
//=======================
//
//interface - Life
//
//in Life
//interface - Fungi
//interface - Bacteria
//interface - Plants
//interface - Animals
//
//in Animals
//interface Vertebrates
//interface Invertebrates
//
//in Vertebrates
//interface Reptiles
//interface Fish
//interface Amphibians
//interface Birds
//interface Mammals
//
//in Mammals
//class Carnivores
//class Primates
//class Seals
//class Rodents
//class Herbivores
//class Whales
//
//in Carnivores
//class - Lion
//class - Wolf
//
//in Whales
//class - BlueWhale
//
//
//create at least one abstract method for each interface
//
//create instances of each class
//
//For example:
//interface Life{
//	void canBreath();
//}
//
//in the Lion class you can give body to this method like
//public void canBreath(){
// System.out.println("I can breath!!!!");
//}
