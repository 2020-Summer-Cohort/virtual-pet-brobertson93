package virtual_pet;


import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;


public class VirtualPetTest {
    @Test
    public void testFeed () {
        VirtualPet vp = new VirtualPet();
        vp.feed();
        assertEquals(vp.hunger, 60);

    }
    @Test
    public void testThirst () {
        VirtualPet vp = new VirtualPet();
        vp.drink();
        assertEquals(vp.thirst, 115);
        assertEquals(vp.hunger, 35);
    }

    @Test
    public void testBoredom () {
        VirtualPet vp = new VirtualPet();
        vp.play();
        assertEquals(vp.getBoredom(),45);
        assertEquals(vp.getThirst(),40);
        assertEquals(vp.getHunger(),35);
    }
}
