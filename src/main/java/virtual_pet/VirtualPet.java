package virtual_pet;
class ticker {
    public static int ticker = 0;
}

public class VirtualPet {


    public int hunger = 100;
    public int hungerHold = 0;
    public int thirst = 100;
    public int thirstHold = 0;
    public int boredom = 100;
    public int boredomHold = 0;
    public int tiredness = 100;
    public int tirednessHold = 0;
    public String name;
    public static int shutdownButton = 9;
    int petTotal = 0;

public void hungerCalc(int number){
    hungerHold = hungerHold + ticker.ticker;
    hunger = hunger + number - hungerHold;
    hungerHold = -(ticker.ticker);


}

public void thirstCalc(int number){
    thirstHold = thirstHold + ticker.ticker;
    thirst = thirst + number - thirstHold;
    thirstHold = -(ticker.ticker);

}

public void boredomCalc(int number){
    boredomHold = boredomHold + ticker.ticker;
    boredom = boredom + number + boredomHold;
    boredomHold = -(ticker.ticker);
}

public void tirednessCalc(int number){
    tirednessHold = tirednessHold + ticker.ticker;
    tiredness = tiredness + number + tirednessHold;
    tirednessHold = -(ticker.ticker);
}

    public int getHunger() {
        hungerCalc(0);
        return  hunger;
    }

    public int getThirst(){
          thirstCalc(0);
        return thirst;
    }

    public int getBoredom(){
        boredomCalc(0);
        return boredom;
    }

    public int getTiredness() {
        tirednessCalc(0);
        return tiredness;
    }

    public void feed() {
        hungerCalc(10);
        thirstCalc(-5);
    }



    public void drink() {
        hungerCalc(-5);
        thirstCalc(15);
    }

    public void play() {
        hungerCalc(-5);
        thirstCalc(-10);
        boredomCalc(30);
        tirednessCalc(-20);
    }

    public void sleep() {
        hungerCalc(-10);
        thirstCalc(-10);
        tirednessCalc(30);
    }

    public void random() {
        int random = (int) (1 + (Math.random() * 5));

        if (random == 2) {
            System.out.println("Your pet decided to eat!");
            feed();
        }

    }

    public boolean shutdown() {
        return shutdownButton == 9;
    }
}



