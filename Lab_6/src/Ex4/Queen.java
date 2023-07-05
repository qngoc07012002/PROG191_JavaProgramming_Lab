package Ex4;

public class Queen extends Ant{
    public Queen() {
        super();
    }

    @Override
    public void damage(int percent) {
        super.damage(percent);
        if (checkDead == false && health < 20) checkDead = true;
    }
}
