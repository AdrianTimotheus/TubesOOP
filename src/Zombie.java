import java.util.Random;

public abstract class Zombie implements Attacker {
    protected String type;
    protected int speed; //zombie speed
    protected int attack; //zombie power
    protected int x = 40; //muncul dari paling kanan
    protected int y;
    Random random = new Random();

    public Zombie (String type,int speed,int attack) {
        this.type = type;
        this.speed = speed; // speed = jumlah steps sekali jalan
        this.attack = attack;
        this.y = random.nextInt(4);
    }
    public String getType() {
        return this.type;
    }
    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void move() {
        x = x - speed;
        if (x<0) {
            x=0;
        }
    }

    public int getY() {
        return this.y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int getSpeed() {
        return this.speed;
    }
    public int getAttack() {
        return this.attack;
    }
    public int points() {
        if (type.equals("Y")) {
            return 10;
        }
        else {
            return 20;
        }
    }
    public boolean dead() {
        return (attack==0);
    }
    public void decrease (String[][] screen, int x, int y) {
        if (screen[y][x-1].equals("-")) {
            this.attack -= 1;
            
        }
        else {
            this.attack -= 2;
        }

        if (attack<0) {
            attack = 0;
        }
    }
    public boolean isShot(String[][] screen, int x, int y)
    {
        return (screen[y][x-1].equals("-") || screen[y][x-1].equals("="));
    }
}