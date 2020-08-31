package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method
        Scanner input = new Scanner(System.in);
        VirtualPet pet = new VirtualPet();
        boolean end = false;

        int answer;

        while (!end) {

           if (pet.random()){
               continue;
           }
            System.out.println("Andy the Ant-Eater");
            System.out.println("Hunger: " + pet.hunger);
            System.out.println("Thirst: " + pet.thirst);
            System.out.println("Boredom: " + pet.boredom);
            System.out.println("Tiredness: " + pet.tiredness);

            answer = input.nextInt();

            if (answer == 1) {
                pet.feed();
                System.out.println("You feed Andy!");

            } else if (answer == 2) {
                pet.drink();
                System.out.println("You give Andy water!");
            } else if (answer == 3) {
                pet.play();
                System.out.println("You play with Andy!");
            } else if (answer == 4) {
                pet.sleep();
                System.out.println("You let Andy sleep!");
            } else if (answer == 5) {
                System.out.println("Thank you for playing!");
                end = true;
            }

            pet.tick();


        }

        //System.out.println("What is your pets name?");
        //  pet.name = input.nextLine();

        // System.out.println(pet.name);


    }


}
