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
    public void gun() {
        System.out.println(" ");
    }
}