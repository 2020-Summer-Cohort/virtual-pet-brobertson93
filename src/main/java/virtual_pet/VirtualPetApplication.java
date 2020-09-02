package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication extends Thread {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        VirtualPetApplication thread = new VirtualPetApplication();
        VirtualPet ct = new VirtualPet();
        thread.start();
        boolean end = false;


        while (!end) {


            System.out.println("Andy the Ant-Eater");
            System.out.println("Hunger: " + VirtualPet.hunger);
            System.out.println("Thirst: " + VirtualPet.thirst);
            System.out.println("Boredom: " + VirtualPet.boredom);
            System.out.println("Tiredness: " + VirtualPet.tiredness);
            System.out.println();
            System.out.println("Press the corresponding number to do an action!");
            System.out.println("1: Feed Andy");
            System.out.println("2: Give Andy water");
            System.out.println("3: Play with Andy");
            System.out.println("4: Put Andy in bed");
            System.out.println("5: Do nothing.");
            System.out.println("9: Quit the program");

            int answer = input.nextInt();

            if (answer == 1) {
                ct.feed();
                System.out.println("You feed Andy!");

            } else if (answer == 2) {
                ct.drink();
                System.out.println("You give Andy water!");
            } else if (answer == 3) {
                ct.play();
                System.out.println("You play with Andy!");
            } else if (answer == 4) {
                ct.sleep();
                System.out.println("You let Andy sleep!");
            } else if (answer == 9) {
                VirtualPet.shutdownButton = 9;
                System.out.println("Thank you for playing!");
                end = true;
            }


        }



    }
    public void run() {
        VirtualPet ct = new VirtualPet();
        boolean finished = false;

        while (!finished){

            if (ct.shutdown()) {
                finished = true;
            }
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            VirtualPet.ticker++;
            VirtualPet.hunger--;
            // System.out.println(ClassTest.hunger);
            VirtualPet.thirst--;
            VirtualPet.boredom--;
            VirtualPet.tiredness--;
            VirtualPet.random++;
            ct.random();


            //int random = (int) (1 + (Math.random() * 5));








        }
    }
}












