import java.util.Random;

public class Zombie implements Attacker {
    protected String type;
    protected int speed; //zombie speed
    protected int attack; //zombie power
    protected int x;
    protected int y;

    public Zombie (String type,int speed,int attack) {
        this.type = type;
        this.speed = speed;
        this.attack = attack;
    }
    public String getType() {
        return this.type;
    }
    public void showup() {
        System.out.println(" ");
    }
    public void attack() {
        System.out.println(" ");
    }
}
