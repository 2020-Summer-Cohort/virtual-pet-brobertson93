package virtual_pet;

public class VirtualPet {

    public static int ticker = 0;
    public static int hunger = 100;
    public static int thirst = 100;
    public static int boredom = 100;
    public static int tiredness = 100;
    public static int random = 0;
    public static int shutdownButton = 0;


    public int change(int number) {


        ticker = ticker + number;
        return ticker;

    }

    public void feed() {

        hunger = hunger + 40;
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

    public void random() {
        int random = (int) (1 + (Math.random() * 5));

        if (random == 2) {
            System.out.println("Your pet decided to eat!");
            feed();
        }

    }

    public boolean shutdown() {
        return shutdownButton == 9;
    }
}



