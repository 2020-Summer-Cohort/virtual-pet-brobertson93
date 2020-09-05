package virtual_pet;

import java.util.Scanner;
import java.util.ArrayList;



import java.util.Scanner;

// Java program implementing Singleton class
// with getInstance() method
class VirtualPetApplication
{
    // static variable single_instance of type Singleton
    private static VirtualPetApplication single_instance = null;

    // variable of type String
    public ArrayList<VirtualPet> array = new ArrayList<VirtualPet>();

    // private constructor restricted to this class itself
    private VirtualPetApplication()
    {
        array = new ArrayList<VirtualPet>();

    }

    // static method to create instance of Singleton class
    public static VirtualPetApplication getInstance()
    {
        if (single_instance == null)
            single_instance = new VirtualPetApplication();

        return single_instance;
    }
}

// Driver Class
class Main extends Thread {
    public static void main(String args[]) {
        Main thread = new Main();
        Scanner input = new Scanner(System.in);
        System.out.println("How many pets do you have?");

        int pets = input.nextInt();

        input.nextLine(); //clears input buffer

        VirtualPetApplication d = VirtualPetApplication.getInstance();

        for (int i = 0; i < pets; i++) {

            VirtualPet test = new VirtualPet();
            System.out.println("Please enter pet name!");
            test.name = input.nextLine();
            d.array.add(test);


        }



        thread.start();
        boolean end = false;
        while(!end){

            System.out.println("Please select a pet!");
            for (int i = 0; i < d.array.size(); i++) {

                System.out.println((i + 1 ) + ": " + d.array.get(i).name);


            }

            int selection = input.nextInt() - 1;
            System.out.println("");
            while(!end) {

                System.out.println("Hunger: " + d.array.get(selection).hunger);
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


                if (answer == 1) {
                    d.array.get(selection).feed(selection);
                    System.out.println("You feed " + d.array.get(selection).name + "!");
                    System.out.println("");
                }

                else if (answer == 2) {
                    d.array.get(selection).drink(selection);
                    System.out.println("You give " +  d.array.get(selection).name + " water!");
                    System.out.println("");
                } else if (answer == 3) {
                    d.array.get(selection).play(selection);
                    System.out.println("You play with " + d.array.get(selection).name + "!");
                } else if (answer == 4) {
                    d.array.get(selection).sleep(selection);
                    System.out.println("You let " +  d.array.get(selection).name + "sleep!");
                }

                else if (answer == 6) {
                    break;
                }



            }





        }

    }


    public void run() {

        boolean finished = false;

        while (!finished) {

            VirtualPetApplication p = VirtualPetApplication.getInstance();
            for (int i = 0; i < p.array.size(); i++) {
                p.array.get(i).incrementAttributes(i);

                if (p.array.get(i).hunger <= 0 || p.array.get(i).thirst <= 0 || p.array.get(i).boredom <= 0 || p.array.get(i).tiredness <= 0 ) {

                    System.out.println("One of your pets has died: GAME OVER!");
                    Runtime.getRuntime().exit(0);
                }

            }
            try {

                Thread.sleep(4000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }

}