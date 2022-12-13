import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PowerUpTest {
    private Racecar racecar;

    @Before
    public void setup() {
        racecar = new Racecar(100, 10);
    }

    @Test
    public void testSpeedPowerup() {
        PowerUp speedPowerup = new SpeedPowerUp(10);
        speedPowerup.apply(racecar);
        assertEquals(200, racecar.getSpeed());
    }

    @Test
    public void testDamagePowerup() {
        PowerUp damagePowerup = new DamagePowerUp(4);
        damagePowerup.apply(racecar);
        assertEquals(14, racecar.getDamage());
    }
}