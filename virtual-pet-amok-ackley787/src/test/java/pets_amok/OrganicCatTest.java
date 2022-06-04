package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicCatTest {

    OrganicCat underTest = new OrganicCat("Dusty", "its a cat",
            10,15,20,25,30, 35);

    @Test
    public void shouldReturnACatName(){
        String cat = underTest.getPetName();
        assertEquals(cat, "Dusty");
    }
    @Test
    public void shouldReturnCatDescription(){
        String cat = underTest.getDescription();
        assertEquals(cat, "its a cat");
    }
    @Test
    public void shouldReturnCatHealth(){
        int cat = underTest.getHealth();
        assertEquals(cat, 10);
    }
    @Test
    public void shouldReturnCatHunger(){
        int cat = underTest.getHunger();
        assertEquals(cat, 15);
    }
    @Test
    public void shouldReturnCatThirst(){
        int cat = underTest.getThirst();
        assertEquals(cat, 20);
    }
    @Test
    public void shouldReturnCatBoredom(){
        int cat = underTest.getBoredom();
        assertEquals(cat, 25);
    }
    @Test
    public void shouldReturnCatWaste(){
        int cat = underTest.getWaste();
        assertEquals(cat, 30);
    }
    @Test
    public void shouldReturnCatHappiness(){
        int cat = underTest.getHappiness();
        assertEquals(cat, 35);
    }
}
