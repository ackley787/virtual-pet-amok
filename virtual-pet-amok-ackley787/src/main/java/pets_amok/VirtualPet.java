package pets_amok;

public abstract class VirtualPet {

    protected String petName;
    protected String description;
    protected int health;
    protected int happiness;
    protected int hunger;
    protected int thirst;
    protected int boredom;
    protected int waste;


    public VirtualPet(String petName, String description, int health, int happiness) {
        this.petName = petName;
        this.description = description;
        this.health = health;
        this.happiness = happiness;
    }

    public String getPetName() {
        return petName;
    }

    public String getDescription() {
        return description;
    }

    public int getHealth() {
        return health;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getWaste() {
        return waste;
    }
    public void feed() {
        this.hunger += 40;
        this.thirst -= 20;
        this.boredom -= 20;
        this.waste -= 20;
        this.happiness += 5;
    }
    public void watered() {
        this.hunger -= 10;
        this.thirst += 20;
        this.boredom -= 10;
        this.waste -= 10;
        this.happiness += 5;
    }

    public void played() {
        this.hunger -= 10;
        this.thirst -= 10;
        this.boredom += 20;
        this.waste -= 10;
        this.happiness += 5;
    }

    public void waste() {
        this.hunger -= 10;
        this.thirst -= 10;
        this.boredom -= 10;
        this.waste += 20;
        this.happiness += 5;
    }
    public void OrganicTick(){
        this.hunger -= 10;
        this.thirst -= 10;
        this.boredom -= 10;
        this.waste -= 10;
        this.happiness -= 10;
    }
}

