package virtual_pet;

public class VirtualPet {
    String name;
    int hunger = 100;
    int thirst = 100;
    int boredom = 100;
    int tiredness = 100;


    public void printAttributes() {

        System.out.println("Hunger: " + hunger);//prints out all the options for interacting with the pet
        System.out.println("Thirst: " + thirst);
        System.out.println("Boredom: " + boredom);
        System.out.println("Tiredness: " + tiredness);

        System.out.println("");
        System.out.println("1: Feed " + name);
        System.out.println("2: Give " + name + " water");
        System.out.println("3: Play with " + name);
        System.out.println("4: Put " + name + " in bed");
        System.out.println("5: Do nothing.");
        System.out.println("");
        System.out.println("6: Change Pet.");
        System.out.println("");
        System.out.println("");
        System.out.println("9: Quit the program");
    }

    public int getHunger() {

        return hunger;
    }

    public int getThirst() {

        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getTiredness() {
        return tiredness;
    }

    public void feed() {
        //brings in singleton array
        hunger = hunger + 20;//updates hunger
        thirst = thirst - 5; //updates thirst

        System.out.println("You feed " + name + "!");
        System.out.println("");

    }

    public void drink() {
        thirst = thirst + 20;
        hunger = hunger - 5;
        System.out.println("You give " + name + " water!");
        System.out.println("");

    }

    public void play() {
        boredom = boredom + 20;
        hunger = hunger - 5;
        thirst = thirst - 8;
        tiredness = tiredness - 15;

        System.out.println("You play with " + name + "!");
        System.out.println("");


    }

    public void sleep() {


        hunger = hunger - 25;
        thirst = thirst - 18;
        tiredness = tiredness + 45;

        System.out.println("You let " + name + " sleep!");
        System.out.println("");

    }

    public void incrementAttributes() {

        hunger = hunger - 2;
        if (hunger < 0) {
            System.out.println("");
            System.out.println("***" + name + " died from hunger!***" + '\n' + "GAME OVER!"); //lets you know which pet died from a particular attribute hitting < 0
            Runtime.getRuntime().exit(0); //exits program
        } else if (hunger < 40) {
            System.out.println("");
            System.out.println("***" + name + " is dying from hunger!***"); // warns that a pet is getting closed to dying
            System.out.println("");
        }

        thirst = thirst - 3;

        if (thirst < 0) {
            System.out.println("");
            System.out.println("***" + name + " died from thirst!***" + '\n' + "GAME OVER!");
            Runtime.getRuntime().exit(0); //exits program


        } else if (thirst < 40) {
            System.out.println("");
            System.out.println("***" + name + " is dying from thirst!***");
            System.out.println("");
        }

        boredom = boredom - 1;

        if (boredom < 0) {
            System.out.println("");
            System.out.println("***" + name + " died from boredom!***" + '\n' + "GAME OVER!");
            Runtime.getRuntime().exit(0); //exits program
        } else if (boredom < 40) {
            System.out.println("");
            System.out.println("***" + name + " is dying from boredom!***");
            System.out.println("");
        }

        tiredness = tiredness - 2;

        if (tiredness < 0) {
            System.out.println("");
            System.out.println("***" + name + " died from exhaustion!***" + '\n' + "GAME OVER!");
            Runtime.getRuntime().exit(0); //exits program
        } else if (tiredness < 40) {
            System.out.println("");
            System.out.println("***" + name + " is dying from exhaustion!***");
            System.out.println("");
        }


    }


}
 


