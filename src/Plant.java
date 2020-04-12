import java.util.ArrayList;

public abstract class Plant implements Shield {
    protected String type;
    protected int price;
    protected int shieldpower;
    protected int xplant;
    protected int yplant;

    public Plant (String type, int price,int power,int xplant, int yplant) {
        this.type = type;
        this.price = price;
        this.shieldpower = power;
        this.xplant = xplant;
        this.yplant = yplant;
    }
    public String getType() {
        return this.type;
    }
    public int getPrice() {
        return this.price;
    }
    public int getPower() {
        return this.shieldpower;
    }
    public void gun(String[][] screen, ArrayList<Bullet> bulletArrayList)
    {
        Bullet bullet = new Bullet(shieldpower,xplant+1,yplant);
        bulletArrayList.add(bullet);

        if (screen[yplant][xplant+1].equals("P")) { //jika ada tumbuhan lain di depannya
            screen[yplant][xplant+1] = "P";
        }
        else if (screen[yplant][xplant+1].equals("S")) {
            screen[yplant][xplant+1] = "S";
        }
        else if(type.equals("P")) {
            screen[yplant][xplant+1] = "=";
        }
        else if(type.equals("S")) {
            screen[yplant][xplant+1] = "-";
        }


    }
}