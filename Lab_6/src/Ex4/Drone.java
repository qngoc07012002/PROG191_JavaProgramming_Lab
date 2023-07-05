package Ex4;

public class Drone extends Ant{
    public Drone() {
        super();
    }

    @Override
    public void damage(int percent) {
        super.damage(percent);
        if (checkDead == false && health < 50) checkDead = true;
    }
}
