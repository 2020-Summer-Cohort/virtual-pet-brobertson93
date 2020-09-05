package virtual_pet;

import java.util.Scanner;
import java.util.ArrayList;


class VirtualPetApplication {

    private static VirtualPetApplication single_instance = null;


    public ArrayList<VirtualPet> array;


    private VirtualPetApplication() {
        array = new ArrayList<>(); //creates array list of pets that can be accssed globally

    }


    public static VirtualPetApplication getInstance() {
        if (single_instance == null)
            single_instance = new VirtualPetApplication();

        return single_instance;
    }
}


class Main extends Thread {
    public static void main(String[] args) {
        Main thread = new Main();
        Scanner input = new Scanner(System.in);
        System.out.println("How many pets do you have?");

        int pets = input.nextInt();

        input.nextLine(); //clears input buffer

        VirtualPetApplication d = VirtualPetApplication.getInstance();

        for (int i = 0; i < pets; i++) {

            VirtualPet newPet = new VirtualPet();
            System.out.println("Please enter pet name!");
            newPet.name = input.nextLine();
            d.array.add(newPet); //creates a new object of the class Pet and pushes it into the singleton


        }


        thread.start(); //starts the thread that increments the pets attributes

        while (true) {

            System.out.println("Please select a pet!");
            for (int i = 0; i < d.array.size(); i++) {

                System.out.println((i + 1) + ": " + d.array.get(i).name); //prints out pet names


            }

            int selection = input.nextInt() - 1;
            System.out.println("");
            while (true) {

                System.out.println("Hunger: " + d.array.get(selection).hunger); //prints out all the options for interacting with the pet
                System.out.println("Thirst: " + d.array.get(selection).thirst);
                System.out.println("Boredom: " + d.array.get(selection).boredom);
                System.out.println("Tiredness: " + d.array.get(selection).tiredness);
                System.out.println("");
                System.out.println("1: Feed " + d.array.get(selection).name);
                System.out.println("2: Give " + d.array.get(selection).name + " water");
                System.out.println("3: Play with " + d.array.get(selection).name);
                System.out.println("4: Put " + d.array.get(selection).name + " in bed");
                System.out.println("5: Do nothing.");
                System.out.println("");
                System.out.println("6: Change Pet.");
                System.out.println("");
                System.out.println("");
                System.out.println("9: Quit the program");

                int answer = input.nextInt();


                if (answer == 1) {  //compares user input to selectable options
                    d.array.get(selection).feed(selection); //runs feed method to feed the pet
                    System.out.println("You feed " + d.array.get(selection).name + "!");
                    System.out.println("");
                } else if (answer == 2) {
                    d.array.get(selection).drink(selection); //runs drink method to make hydration better
                    System.out.println("You give " + d.array.get(selection).name + " water!");
                    System.out.println("");
                } else if (answer == 3) {
                    d.array.get(selection).play(selection); //runs play method to increase boredom level
                    System.out.println("You play with " + d.array.get(selection).name + "!");
                    System.out.println("");
                } else if (answer == 4) {
                    d.array.get(selection).sleep(selection); //runs sleep method to increase sleep level
                    System.out.println("You let " + d.array.get(selection).name + "sleep!");
                    System.out.println("");
                } else if (answer == 6) {
                    break; //breaks out of while loop and goes back to the pet selection screen
                }
                  else if (answer == 9) {
                    System.out.println("Thank you for playing!");
                    Runtime.getRuntime().exit(0);
                }


            }


        }

    }


    public void run() {

        boolean finished = false; //used to start while loop

        while (!finished) {

            VirtualPetApplication p = VirtualPetApplication.getInstance();
            for (int i = 0; i < p.array.size(); i++) {
                p.array.get(i).incrementAttributes(i); //runs increments
            }
            try {

                Thread.sleep(4000); //increments increase by 4 seconds each time the while loop is ran

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }

}