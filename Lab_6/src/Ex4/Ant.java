package Ex4;

public abstract class Ant {
    protected float health = 100;
    protected boolean checkDead = false;
    public Ant() {

    }

    public float getHealth() {
        return health;
    }

    public boolean checkDead(){
        return checkDead;
    }

    public void damage(int percent){
        if (checkDead == false){
            health = health - (health*(percent/100f));
        }
    }
}
