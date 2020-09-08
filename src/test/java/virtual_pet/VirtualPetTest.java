package virtual_pet;


import org.junit.jupiter.api.Test;

import virtual_pet.VirtualPet;

import static org.junit.jupiter.api.Assertions.*;


public class VirtualPetTest {
    @Test
    public void testFeed () { //tests feed
        VirtualPet vp = new VirtualPet();
        vp.feed();
        assertEquals(vp.getHunger(), 120);

    }

    @Test
    public void testDrink () { //tests drink
        VirtualPet vp = new VirtualPet();
        vp.drink();
        assertEquals(vp.getThirst(),120);
        assertEquals(vp.getHunger(), 95);
    }

    @Test
    public void testPlay () { //tests play
        VirtualPet vp = new VirtualPet();
        vp.play();
        assertEquals(vp.getBoredom(),120);
        assertEquals(vp.getHunger(),95);
        assertEquals(vp.getThirst(), 92);
        assertEquals(vp.getTiredness(),85);

    }

    @Test
    public void testSleep () { //tests sleep
        VirtualPet vp = new VirtualPet();
        vp.sleep();
        assertEquals(vp.getHunger(),75);
        assertEquals(vp.getThirst(),82);
        assertEquals(vp.getTiredness(),145);

    }
}
