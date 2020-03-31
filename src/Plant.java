import java.util.ArrayList;

public class Plant implements Shield {
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
    public void buy() {
        System.out.println(" ");
    }
    public void gun(String[][] screen, ArrayList<Bullet> bulletArrayList)
    {
//        System.out.println(" ");
        Bullet bullet = new Bullet(shieldpower,xplant+1,yplant);
        bulletArrayList.add(bullet);
        if(type.equals("S"))
        {

            screen[yplant][xplant+1] = "-";
        }
        else if(type.equals("P"))
        {
            screen[yplant][xplant+1] = "="];
        }
    }
}