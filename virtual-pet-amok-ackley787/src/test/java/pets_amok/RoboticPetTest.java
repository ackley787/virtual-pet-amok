package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboticPetTest {

    RoboticCat underTest = new RoboticCat("Blue", "roboticCat",
            45, 50, 55, 60);
    RoboticDog underTest1 = new RoboticDog("Pudge","its a robot",
            10,15,20,25);

    @Test
    public void shouldOilRoboticCat(){
       assertEquals(50, underTest.getOil());
       underTest.addOil();
       assertEquals(70,underTest.getOil());
    }
    @Test
    public void shouldOilRoboticDog(){
        assertEquals(15, underTest1.getOil());
        underTest1.addOil();
        assertEquals(35,underTest1.getOil());
    }
    @Test
    public void shouldAddBatteryToRoboticCatBy20(){
        assertEquals(55, underTest.getBattery());
        underTest.addBattery();
        assertEquals(75,underTest.getBattery());
    }
    @Test
    public void shouldAddBatteryToRoboticDogBy20(){
        assertEquals(20, underTest1.getBattery());
        underTest1.addBattery();
        assertEquals(40,underTest1.getBattery());
    }
    @Test
    public void shouldDecreaseRoboticCatValuesBy10(){
        assertEquals(50, underTest.getOil());
        assertEquals(55, underTest.getBattery());
        assertEquals(60, underTest.getHappiness());
        underTest.roboticTick();
        assertEquals(40, underTest.getOil());
        assertEquals(45, underTest.getBattery());
        assertEquals(50, underTest.getHappiness());
    }
    @Test
    public void shouldDecreaseRoboticDogValuesBy10(){
        assertEquals(15, underTest1.getOil());
        assertEquals(20, underTest1.getBattery());
        assertEquals(25, underTest1.getHappiness());
        underTest1.roboticTick();
        assertEquals(5, underTest1.getOil());
        assertEquals(10, underTest1.getBattery());
        assertEquals(15, underTest1.getHappiness());
    }
}
