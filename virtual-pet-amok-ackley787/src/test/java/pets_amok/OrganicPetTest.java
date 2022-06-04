package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicPetTest {
    OrganicCat underTest = new OrganicCat("Dusty", "cat",
            10, 15, 20, 25, 30, 35);
    OrganicDog underTest2 = new OrganicDog("Mia", "dog",
            25, 30, 35, 40, 45, 50);

    @Test
    public void shouldFeedCat() {
        assertEquals(15, underTest.getHunger());
        underTest.feed();
        int cat = underTest.getHunger();
        assertEquals(cat, 55);
    }

    @Test
    public void shouldFeedDog() {
        assertEquals(30, underTest2.getHunger());
        underTest2.feed();
        int dog = underTest2.getHunger();
        assertEquals(dog, 70);
    }

    @Test
    public void shouldWaterCat() {
        assertEquals(20, underTest.getThirst());
        underTest.watered();
        int cat = underTest.getThirst();
        assertEquals(cat, 40);
    }

    @Test
    public void shouldWaterDog() {
        assertEquals(35, underTest2.getThirst());
        underTest2.watered();
        int dog = underTest2.getThirst();
        assertEquals(dog, 55);
    }

    @Test
    public void shouldPlayWithCat() {
        assertEquals(25, underTest.getBoredom());
        underTest.played();
        int cat = underTest.getBoredom();
        assertEquals(cat, 45);
    }

    @Test
    public void shouldPlayWithDog() {
        assertEquals(40, underTest2.getBoredom());
        underTest2.played();
        int dog = underTest2.getBoredom();
        assertEquals(dog, 60);
    }

    @Test
    public void shouldAddWasteToCat() {
        assertEquals(30, underTest.getWaste());
        underTest.waste();
        int cat = underTest.getWaste();
        assertEquals(cat, 50);
    }

    @Test
    public void shouldAddWasteToDog() {
        assertEquals(45, underTest2.getWaste());
        underTest2.waste();
        int dog = underTest2.getWaste();
        assertEquals(dog, 65);
    }
    @Test
    public void shouldDecreasePetValuesBy10(){
        assertEquals(15, underTest.getHunger());
        assertEquals(20, underTest.getThirst());
        assertEquals(25, underTest.getBoredom());
        assertEquals(30, underTest.getWaste());
        assertEquals(35, underTest.getHappiness());
        underTest.OrganicTick();
        assertEquals(5, underTest.getHunger());
        assertEquals(10, underTest.getThirst());
        assertEquals(15, underTest.getBoredom());
        assertEquals(20, underTest.getWaste());
        assertEquals(25, underTest.getHappiness());
    }
}
