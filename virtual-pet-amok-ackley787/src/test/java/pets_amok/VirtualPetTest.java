package pets_amok;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {

    VirtualPet underTest = new VirtualPet("Mia", "dog",
            10, 15) {
    };
    @Test
    public void shouldReturnPetName(){
        String test = underTest.getPetName();
        assertEquals(test, "Mia");
    }
    @Test
    public void shouldReturnPetDescription(){
        String test = underTest.getDescription();
        assertEquals(test, "dog");
    }
    @Test
    public void shouldReturnPetHealth(){
        int test = underTest.getHealth();
        assertEquals(test, 10);
    }
    @Test
    public void shouldReturnPetHappiness(){
        int test = underTest.getHappiness();
        assertEquals(test, 15);
    }
}
