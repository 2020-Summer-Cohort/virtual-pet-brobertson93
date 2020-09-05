package virtual_pet;

import java.util.Scanner;

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
            VirtualPet methods = new VirtualPet();
            while (true) {

              methods.printAttributes(selection);

                int answer = input.nextInt();


                if (answer == 1) {  //compares user input to selectable options
                    d.array.get(selection).feed(selection); //runs feed method to feed the pet

                } else if (answer == 2) {
                    d.array.get(selection).drink(selection); //runs drink method to make hydration better

                } else if (answer == 3) {
                    d.array.get(selection).play(selection); //runs play method to increase boredom level

                } else if (answer == 4) {
                    d.array.get(selection).sleep(selection); //runs sleep method to increase sleep level

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