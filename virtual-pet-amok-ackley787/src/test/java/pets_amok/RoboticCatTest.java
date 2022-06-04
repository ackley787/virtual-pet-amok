package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboticCatTest {

    RoboticCat underTest = new RoboticCat("Blue", "roboticCat", 45, 50, 55, 60);

    @Test
    public void shouldReturnRobotPetName() {
        String robot = underTest.getPetName();
        assertEquals(robot, "Blue");

    }

    @Test
    public void shouldReturnRobotPetDescription() {
        String robot = underTest.getDescription();
        assertEquals(robot, "roboticCat");
    }

    @Test
    public void shouldReturnRobotHealth() {
        int robot = underTest.getHealth();
        assertEquals(robot, 45);
    }

    @Test
    public void shouldReturnRobotOil() {
        int robot = underTest.getOil();
        assertEquals(robot, 50);
    }

    @Test
    public void shouldReturnRobotBattery() {
        int robot = underTest.getBattery();
        assertEquals(robot, 55);
    }

    @Test
    public void shouldReturnRobotHappiness() {
        int robot = underTest.getHappiness();
        assertEquals(robot, 60);
    }
}