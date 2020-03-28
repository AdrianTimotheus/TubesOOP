import java.util.Random;

public class Zombie implements Attacker {
    protected String type;
    protected int speed; //zombie speed
    protected int attack; //zombie power
    protected int x;
    protected int y;
    Random random = new Random();

    public Zombie (String type,int speed,int attack) {
        this.type = type;
        this.speed = speed; // speed = jumlah steps sekali jalan
        this.attack = attack; 
        x = random.nextInt(108);
        y = random.nextInt(4);
    }
    public String getType() {
        return this.type;
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public int getSpeed() {
        return this.speed;
    }
    public int getAttack() {
        return this.attack;
    }
    public void showup() {
        System.out.println(" ");
    }
    public void attack() {
        System.out.println(" ");
    }
}
