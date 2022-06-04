package pets_amok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {

    VirtualPetShelter underTest = new VirtualPetShelter();
    OrganicCat organicCat1 = new OrganicCat("Dusty", "cat",10,15,20,25,30, 35);
    OrganicDog organicDog1 = new OrganicDog("Mia", "dog",25,30,35,40,45,50);
    RoboticCat roboticCat1 = new RoboticCat("Blue","roboticCat",45,50,55,60);
    RoboticDog roboticDog1 = new RoboticDog("Pudge","roboticDog",60,65,70,75);

    @BeforeEach
    public void setup() {
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.addPet(organicCat1);
    }
    @Test
    public void shouldBeAbleToAddAOrganicCat(){
        underTest.addPet(organicCat1);
        VirtualPet Pet = (underTest.findPet("Dusty"));
        assertEquals("Dusty", Pet.getPetName());
    }
    @Test
    public void shouldBeAbleToAddMultiplePets(){
        underTest.addPet(organicCat1);
        underTest.addPet(organicDog1);
        underTest.addPet(roboticCat1);
        underTest.addPet(roboticDog1);
        Collection<VirtualPet> shelter = underTest.shelter();
        assertThat(shelter, containsInAnyOrder(roboticCat1, roboticDog1, organicCat1, organicDog1));
    }
    @Test
    public void shouldFeedOrganicPets(){
        underTest.addPet(organicCat1);
        underTest.addPet(organicDog1);
        underTest.addPet(roboticCat1);
        underTest.addPet(roboticDog1);
        underTest.feedAllOrganics();
        assertEquals(organicCat1.getHunger(),55);
        assertEquals(organicDog1.getHunger(),70);
        assertEquals(0,roboticCat1.getHunger() );

    }
}
