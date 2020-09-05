package virtual_pet;

public class VirtualPet {
    String name;
    int hunger = 100;
    int thirst = 100;
    int boredom = 100;
    int tiredness = 100;


    public void feed (int number){
        VirtualPetApplication p = VirtualPetApplication.getInstance(); //brings in singleton array
        p.array.get(number).hunger = p.array.get(number).hunger + 20;//updates hunger
        p.array.get(number).thirst = p.array.get(number).thirst - 5; //updates thirst

    }

    public void drink (int number) {
        VirtualPetApplication p = VirtualPetApplication.getInstance();
        p.array.get(number).thirst = p.array.get(number).thirst + 20;
        p.array.get(number).hunger = p.array.get(number).hunger - 5;

    }

    public void play (int number) {
        VirtualPetApplication p = VirtualPetApplication.getInstance();
        p.array.get(number).boredom = p.array.get(number).boredom + 20;
        p.array.get(number).hunger = p.array.get(number).hunger - 5;
        p.array.get(number).thirst = p.array.get(number).thirst - 8;
        p.array.get(number).tiredness = p.array.get(number).tiredness - 15;


    }

    public void sleep (int number) {
        VirtualPetApplication p = VirtualPetApplication.getInstance();


        p.array.get(number).hunger = p.array.get(number).hunger - 25;
        p.array.get(number).thirst = p.array.get(number).thirst - 18;
        p.array.get(number).tiredness = p.array.get(number).tiredness + 45;

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

