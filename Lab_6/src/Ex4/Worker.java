package Ex4;

public class Worker extends Ant{
    public Worker() {
        super();
    }

    @Override
    public void damage(int percent) {
        super.damage(percent);
        if (checkDead == false && health < 70) checkDead = true;
    }
}
