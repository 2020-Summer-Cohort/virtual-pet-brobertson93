package virtual_pet;

import java.util.InputMismatchException;
import java.util.Scanner;

class VirtualPetApplication {

	public void start() { //creates pets and starts incrementing time/input
		Scanner input = new Scanner(System.in);
		createPets(input);
		
		startIncrementingTime();
		
		playGame(input);
		

	}

	public void startIncrementingTime() {
		TimeIncrementer thread = new TimeIncrementer();
		thread.start(); // starts the thread that increments the pets attributes
	}

	public void createPets(Scanner input) {
		

		System.out.println("How many pets do you have?");

		int pets = input.nextInt();

		input.nextLine(); // clears input buffer

		VirtualPetsContainer d = VirtualPetsContainer.getInstance();

		for (int i = 0; i < pets; i++) {

			VirtualPet newPet = new VirtualPet();
			System.out.println("Please enter pet name!");
			newPet.name = input.nextLine();
			d.array.add(newPet); // creates a new object of the class Pet and pushes it into the singleton

		}
		
	}

	public void playGame(Scanner input2) {
		VirtualPetsContainer d = VirtualPetsContainer.getInstance();
		
		
		while (d.running) {
			try {
			System.out.println("Please select a pet!");
			for (int i = 0; i < d.array.size(); i++) {

				System.out.println((i + 1) + ": " + d.array.get(i).name); // prints out pet names

			}

			int selection = input2.nextInt() - 1;
			System.out.println("");

			while (true) {

				d.array.get(selection).printAttributes();

				int answer = input2.nextInt();

				if (answer == 1) { // compares user input to selectable options
					d.array.get(selection).feed(); // runs feed method to feed the pet

				} else if (answer == 2) {
					d.array.get(selection).drink(); // runs drink method to make hydration better

				} else if (answer == 3) {
					d.array.get(selection).play(); // runs play method to increase boredom level

				} else if (answer == 4) {
					d.array.get(selection).sleep(); // runs sleep method to increase sleep level

				} else if (answer == 6) {
					break; // breaks out of while loop and goes back to the pet selection screen
				} else if (answer == 9) {
					System.out.println("Thank you for playing!");
					input2.close();
					d.running = false;
				}

			}
			}
			catch (InputMismatchException e){
				System.out.println("Please input an integer!");
				input2.nextLine();
				
			}
		}
	}
}
