public class Racecar {
    private int speed;
    private int damage;

    public Racecar(int speed, int damage) {
        this.speed = speed;
        this.damage = damage;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}

abstract class PowerUp {
    private int intensity;

    public PowerUp(int intensity) {
        this.intensity = intensity;
    }

    public int getIntensity() {
        return intensity;
    }

    public void setIntensity(int intensity) {
        this.intensity = intensity;
    }

    public abstract void apply(Racecar car);
}

 class SpeedPowerUp extends PowerUp {
    public SpeedPowerUp(int intensity) {
        super(intensity);
    }

    @Override
    public void apply(Racecar car) {
        car.setSpeed(car.getSpeed() + getIntensity() * 10);
    }
}

class DamagePowerUp extends PowerUp {
    public DamagePowerUp(int intensity) {
        super(intensity);
    }

    @Override
    public void apply(Racecar car) {
        car.setDamage(car.getDamage() + getIntensity());
    }
}