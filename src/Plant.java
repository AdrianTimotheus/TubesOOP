public class Plant implements Shield {
    protected String type;
    protected int price;
    protected int shieldpower;

    public Plant (String type, int price,int power) {
        this.type = type;
        this.price = price;
        this.shieldpower = power;
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
