package virtual_pet;

public class VirtualPet {
    String name;
    int hunger = 100;
    int thirst = 100;
    int boredom = 100;
    int tiredness = 100;


    public void printAttributes(int number){
        VirtualPetApplication d = VirtualPetApplication.getInstance();
        System.out.println("Hunger: " + d.array.get(number).hunger);//prints out all the options for interacting with the pet
        System.out.println("Thirst: " + d.array.get(number).thirst);
        System.out.println("Boredom: " + d.array.get(number).boredom);
        System.out.println("Tiredness: " + d.array.get(number).tiredness);

        System.out.println("");
        System.out.println("1: Feed " + d.array.get(number).name);
        System.out.println("2: Give " + d.array.get(number).name + " water");
        System.out.println("3: Play with " + d.array.get(number).name);
        System.out.println("4: Put " + d.array.get(number).name + " in bed");
        System.out.println("5: Do nothing.");
        System.out.println("");
        System.out.println("6: Change Pet.");
        System.out.println("");
        System.out.println("");
        System.out.println("9: Quit the program");
    }

    public int getHunger(int number){
        VirtualPetApplication p = VirtualPetApplication.getInstance();
        return p.array.get(number).hunger;
    }

    public int getThirst(int number){
        VirtualPetApplication p = VirtualPetApplication.getInstance();
        return p.array.get(number).thirst;
    }

    public void feed (int number){
        VirtualPetApplication p = VirtualPetApplication.getInstance(); //brings in singleton array
        p.array.get(number).hunger = p.array.get(number).hunger + 20;//updates hunger
        p.array.get(number).thirst = p.array.get(number).thirst - 5; //updates thirst
        System.out.println("You feed " + p.array.get(number).name + "!");
        System.out.println("");

    }

    public void drink (int number) {
        VirtualPetApplication p = VirtualPetApplication.getInstance();
        p.array.get(number).thirst = p.array.get(number).thirst + 20;
        p.array.get(number).hunger = p.array.get(number).hunger - 5;
        System.out.println("You give " + p.array.get(number).name + " water!");
        System.out.println("");

    }

    public void play (int number) {
        VirtualPetApplication p = VirtualPetApplication.getInstance();
        p.array.get(number).boredom = p.array.get(number).boredom + 20;
        p.array.get(number).hunger = p.array.get(number).hunger - 5;
        p.array.get(number).thirst = p.array.get(number).thirst - 8;
        p.array.get(number).tiredness = p.array.get(number).tiredness - 15;

        System.out.println("You play with " + p.array.get(number).name + "!");
        System.out.println("");


    }

    public void sleep (int number) {
        VirtualPetApplication p = VirtualPetApplication.getInstance();


        p.array.get(number).hunger = p.array.get(number).hunger - 25;
        p.array.get(number).thirst = p.array.get(number).thirst - 18;
        p.array.get(number).tiredness = p.array.get(number).tiredness + 45;

        System.out.println("You let " + p.array.get(number).name + " sleep!");
        System.out.println("");

    }

    public void incrementAttributes(int selection) {
        VirtualPetApplication p = VirtualPetApplication.getInstance();

        p.array.get(selection).hunger = p.array.get(selection).hunger - 2;
        if(p.array.get(selection).hunger < 0) {
            System.out.println("");
            System.out.println("***" + p.array.get(selection).name + " died from hunger!***"+'\n' + "GAME OVER!"); //lets you know which pet died from a particular attribute hitting < 0
            Runtime.getRuntime().exit(0); //exits program
        }

        else if(p.array.get(selection).hunger < 40) {
            System.out.println("");
            System.out.println("***" + p.array.get(selection).name + " is dying from hunger!***"); // warns that a pet is getting closed to dying
            System.out.println("");
        }

        p.array.get(selection).thirst = p.array.get(selection).thirst - 3;

        if(p.array.get(selection).thirst < 0) {
            System.out.println("");
            System.out.println("***" + p.array.get(selection).name + " died from thirst!***" +'\n' + "GAME OVER!");
            Runtime.getRuntime().exit(0); //exits program


        }

        else if(p.array.get(selection).thirst < 40) {
            System.out.println("");
            System.out.println("***" + p.array.get(selection).name + " is dying from thirst!***");
            System.out.println("");
        }

        p.array.get(selection).boredom = p.array.get(selection).boredom - 1;

        if(p.array.get(selection).boredom < 0) {
            System.out.println("");
            System.out.println("***" + p.array.get(selection).name + " died from boredom!***"+'\n' + "GAME OVER!");
            Runtime.getRuntime().exit(0); //exits program
        }

        else if(p.array.get(selection).boredom < 40) {
            System.out.println("");
            System.out.println("***" + p.array.get(selection).name + " is dying from boredom!***");
            System.out.println("");
        }

        p.array.get(selection).tiredness = p.array.get(selection).tiredness - 2;

        if(p.array.get(selection).tiredness < 0) {
            System.out.println("");
            System.out.println("***" + p.array.get(selection).name + " died from exhaustion!***"+'\n' + "GAME OVER!");
            Runtime.getRuntime().exit(0); //exits program
        }

        else if(p.array.get(selection).tiredness < 40) {
            System.out.println("");
            System.out.println("***" + p.array.get(selection).name + " is dying from exhaustion!***");
            System.out.println("");
        }

    }
}

