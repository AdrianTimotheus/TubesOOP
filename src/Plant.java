public class Plant implements Shield {
    protected String type;
    protected int price;
    protected int shieldpower;

    public Plant (int price,int power) {
        this.price = price;
        this.shieldpower = power;
    }
    public String getType() {
        return this.type;
    }
    public void buy() {
        System.out.println(" ");
    }
    public void gun() {
        System.out.println(" ");
    }
}
