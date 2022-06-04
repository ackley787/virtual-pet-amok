package pets_amok;

public class OrganicDog extends OrganicPet {

    public OrganicDog(String petName, String description, int health, int hunger, int thirst, int boredom, int waste, int happiness) {
        super(petName, description, health, hunger, thirst, boredom, waste, happiness);
    }

    public void cleanDogCage() {
        this.hunger -= 10;
        this.thirst -= 10;
        this.boredom -= 10;
        this.waste = 0;
        this.happiness += 10;

    }

}

