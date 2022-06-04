package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicDogTest {

    OrganicDog underTest = new OrganicDog("Mia", "its a dog",
            10,15,20,25,30,35);

    @Test
    public void shouldReturnDogName(){
        String dog = underTest.getPetName();
        assertEquals(dog, "Mia");
    }
    @Test
    public void shouldReturnDogDescription(){
        String dog = underTest.getDescription();
        assertEquals(dog, "its a dog");
    }
    @Test
    public void shouldReturnDogHealth(){
        int dog = underTest.getHealth();
        assertEquals(dog, 10);
    }
    @Test
    public void shouldReturnDogHunger(){
        int dog = underTest.getHunger();
        assertEquals(dog, 15);
    }
    @Test
    public void shouldReturnDogThirst(){
        int dog = underTest.getThirst();
        assertEquals(dog, 20);
    }
    @Test
    public void shouldReturnDogBoedom(){
        int dog = underTest.getBoredom();
        assertEquals(dog, 25);
    }
    @Test
    public void shouldReturnDogWaste(){
        int dog = underTest.getWaste();
        assertEquals(dog, 30);
    }
    @Test
    public void shouldReturnDogHappiness(){
        int dog = underTest.getHappiness();
        assertEquals(dog, 35);
    }

    @Test
    public void shouldCleanDogCage(){
        underTest.cleanDogCage();
        int dog = underTest.getWaste();
        assertEquals(dog, 0);
    }
}
