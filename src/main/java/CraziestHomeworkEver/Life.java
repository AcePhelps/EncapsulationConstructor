package CraziestHomeworkEver;

public interface Life {
    void canBreath();
    interface Fungi {
        void Shape();
    };
    interface  Bacteria{
        void Kind();
    };
    interface  Plants{
       boolean Green();
    };
    interface  Animals{
        void isAlive();
        interface Vertebrates{
            void haveASkull();

            interface Reptiles{
               void ColdBlooded();
            };
            interface Fish{
                void SwimBladders();
            };
            interface Amphibians{
                void canBreathinWaterAndInTheAir();
            };
            interface Birds{
                void canFly();
            };
            interface Mammals{
                void iHaveAFur();
                class Carnivores implements Life,Animals,Vertebrates,Mammals{
                    private int Numbers;

                    public Carnivores(int numbers) {
                        Numbers = numbers;
                    }

                    public int getNumbers() {
                        return Numbers;
                    }

                    public void setNumbers(int numbers) {
                        Numbers = numbers;
                    }

                   public void haveASkull() {
                            System.out.println("I have  A Skull ");

                    }
                   public void iHaveAFur(){
                            System.out.println("I have  A Fur ");
                    }

                    @Override
                    public void canBreath() {
                        System.out.println("Yo i can breath");
                    }

                    @Override
                    public void isAlive() {
                        System.out.println("I'm Alive ");
                    }


                    static class Lion extends Carnivores {

                       private String name;

                        public Lion(int numbers, String name) {
                            super(numbers);
                            this.name = name;
                        }

                        public String getName() {
                           return name;
                       }

                       public void setName(String name) {
                           this.name = name;
                       }
                   };
                    static class Wolf{

                        }
                    };

                };
                class Primates{

                };
                class Seals{

                };
                class Rodents {

                };
                class Herbivores{

                };
                class Whales{

                    class BlueWhales{

                    };
                };
            };
        };
        interface Invertebrates{
            void WhoAreWe ();
        };


    };

