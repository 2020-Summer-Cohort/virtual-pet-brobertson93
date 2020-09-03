package virtual_pet;

import java.util.Scanner;



public class VirtualPetApplication extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        VirtualPetApplication thread = new VirtualPetApplication();
        System.out.println("How many pets do you have?");
        int pets = input.nextInt();

        input.nextLine(); //clears input buffer
        VirtualPet [] ct = new VirtualPet[pets];


        for (int i = 0 ; i < pets ; i++) {
            ct[i] = new VirtualPet();

            System.out.println("Please enter pet name!");
            ct[i].name = input.nextLine();
        }



        thread.start();
        boolean end = false;


        while (!end) {



            //System.out.println("Hunger: " + ct.hunger);
           // System.out.println("Thirst: " + ct.thirst);
            //System.out.println("Boredom: " + ct.boredom);
            //System.out.println("Tiredness: " + ct.tiredness);

            System.out.println("Please select a pet to interact with:");

            for (int i = 0; i < pets; i++) {
                System.out.println("Press " + (i + 1) + " to interact with: " + ct[i].name);
            }


            int selection = input.nextInt() - 1;
            while((selection) != 6) {


                System.out.println("Hunger: " + ct[selection].getHunger());
                System.out.println("Thirst: " + ct[selection].getThirst());
                System.out.println("Boredom: " + ct[selection].getBoredom());
                System.out.println("Tiredness: " + ct[selection].getTiredness());

                System.out.println("1: Feed " + ct[selection].name);
                System.out.println("2: Give " + ct[selection].name + " water");
                System.out.println("3: Play with " + ct[selection].name);
                System.out.println("4: Put " + ct[selection].name + " in bed");
                System.out.println("5: Do nothing.");
                System.out.println("6: Change Pet.");
                System.out.println("9: Quit the program");

                int answer = input.nextInt();


                if (answer == 1) {
                    ct[selection].feed();
                    System.out.println("You feed " + ct[selection].name + "!");
                    System.out.println("");

                } else if (answer == 2) {
                       ct[selection].drink();
                    System.out.println("You give " +  ct[selection].name+ " water!");
                    System.out.println("");
                } else if (answer == 3) {
                     ct[selection].play();
                    System.out.println("You play with " + ct[selection].name + "!");
                } else if (answer == 4) {
                    //   ct.sleep();
                    System.out.println("You let Andy sleep!");
                }

                else if (answer == 6) {
                    break;
                }

            }
            //else if (answer == 9) {
                //VirtualPet.shutdownButton = 9;
             //   System.out.println("Thank you for playing!");
             //  end = true;
            //}


        }



    }
    public void run() {
        VirtualPet thread = new VirtualPet();
        boolean finished = false;
        int i = 0;
        while (!finished){

           // if (thread.shutdown()) {
               // finished = true;
           // }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            ticker.ticker++;
           // System.out.println(ticker.ticker);
           // System.out.println(VirtualPet.ticker);



            //int random = (int) (1 + (Math.random() * 5));








        }
    }
}












