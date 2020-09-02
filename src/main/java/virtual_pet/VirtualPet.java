package virtual_pet;

public class VirtualPet {

   int  hunger = 40;
   int thirst = 50;
   int boredom = 15;
   int tiredness = 30;

   public void tick() {

    hunger = hunger - 4;
    thirst =  thirst - 2;
    boredom = boredom -5;
    tiredness = tiredness -3;

    if (hunger <= 10) {
        System.out.println("Please feed me I am hungry!\n");
    }

    else if (thirst <= 10) {
        System.out.println("I am thirsty!\n");
    }

    else if (boredom <= 10) {
        System.out.println("I am getting bored\n");
    }

    else if (tiredness <= 10) {
        System.out.println("I am getting pretty tired!\n");
    }


   }

    public void feed() {


       hunger = hunger + 20;
       thirst = thirst - 5;

    }

    public void drink() {
       hunger = hunger - 5;
       thirst = thirst + 15;
    }

    public void play() {
       hunger = hunger -5;
       thirst = thirst -10;
       boredom = boredom + 30;
    }

    public void sleep() {
       hunger = hunger -10;
       thirst = thirst -10;
       tiredness = tiredness + 30;
    }

    public int getHunger() {
        return hunger;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getThirst() {
        return thirst;
    }

    public int getTiredness() {
        return tiredness;
    }

    public boolean random() {
        int random = (int) (1 + (Math.random() * 5));

        if (random == 2) {
            System.out.println("Your pet decided to eat!");
            hunger = hunger + 20;

            return true;

        }
            return false;

    }
}



