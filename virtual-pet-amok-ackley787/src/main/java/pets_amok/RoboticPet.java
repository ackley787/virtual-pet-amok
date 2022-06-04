package pets_amok;

public class RoboticPet extends VirtualPet{

    protected int oil;
    protected int battery;

    public RoboticPet(String petName, String description, int health, int oil, int battery, int happiness) {
        super(petName, description, health, happiness);
        this.oil = oil;
        this.battery = battery;
    }
    public int getOil() {
        return oil;
    }
    public int getBattery() {
        return battery;
    }

    public void addOil(){
        this.oil += 20;
        this.battery -= 10;
        this.happiness += 5;
    }
    public void addBattery(){
        this.oil -= 10;
        this.battery += 20;
        this.happiness += 5;
    }
    public void roboticTick(){
        this.oil -=10;
        this.battery -=10;
        this.happiness -=10;
    }
}


