package pets_amok;

public class OrganicPet extends VirtualPet {


    public OrganicPet(String petName, String description, int health,
                      int hunger, int thirst, int boredom, int waste,
                      int happiness) {
        super(petName, description, health, happiness);
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.waste = waste;
    }

}