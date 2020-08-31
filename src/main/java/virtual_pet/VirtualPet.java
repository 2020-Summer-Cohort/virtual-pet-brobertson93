package virtual_pet;

public class VirtualPet {

   int  hunger = 40;
   int thirst = 100;
   int boredom = 40;
   int tiredness = 120;

   public void tick() {

    hunger = hunger - 4;
    thirst =  thirst - 2;


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



