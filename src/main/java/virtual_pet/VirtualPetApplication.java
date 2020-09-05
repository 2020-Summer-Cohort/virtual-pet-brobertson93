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


