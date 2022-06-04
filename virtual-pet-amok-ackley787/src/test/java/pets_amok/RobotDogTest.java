package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RobotDogTest {

    RoboticDog underTest = new RoboticDog("Pudge","its a robot",10,15,20,25);

    @Test
    public void shouldReturnRobotPetName(){
        String robot = underTest.getPetName();
        assertEquals(robot, "Pudge");

    }
    @Test
    public void shouldReturnRobotPetDescription(){
        String robot = underTest.getDescription();
        assertEquals(robot, "its a robot");
    }
    @Test
    public void shouldReturnRobotHealth(){
        int robot = underTest.getHealth();
        assertEquals(robot, 10);
    }
    @Test
    public void shouldReturnRobotOil(){
        int robot = underTest.getOil();
        assertEquals(robot, 15);
    }
    @Test
    public void shouldReturnRobotBattery(){
        int robot = underTest.getBattery();
        assertEquals(robot, 20);
    }
    @Test
    public void shouldReturnRobotHappiness(){
        int robot = underTest.getHappiness();
        assertEquals(robot, 25);
    }

}
