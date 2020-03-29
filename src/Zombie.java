import java.util.Random;

public abstract class Zombie implements ZombieBehavior {
    //setiap zombie punya health, movement speed, sama damage ke plant so....

    protected int health;
    protected int movementSpeed;
    protected int damage;

    //buat anak'nya punya tipe zombie dan huruf yang ditampilin ke layar pas game berjalan
    protected String type;
    protected String screenName;

    //dan juga koordinat
    protected int x;
    protected int y;

   // konstruktor
    public Zombie(int health, int movementSpeed, int damage)
    {
        this.health = health;
        this.movementSpeed = movementSpeed;
        this.damage = damage;
    }

    //karena implement zombieBehavior maka...

    //ngespawn zombie di kanan layar dengan barisnya random
    //ngeprint "Z" di tempat zombie ngespawn
    public void Spawn(String[][] screen)
    {
        Random random = new Random();
        this.x = 107; //ujung kanan
        this.y = random.nextInt(4); //barisnya random
        //jangan lupa         screen[y][x] = "Z"; //ditulis "Z" di kelas anaknya
    }

    public void Move(String[][] screen)
    {
        this.x -= movementSpeed;
        //kalo x<=0 panggil method gameover
        //jangan lupa update screen[y][x]
        //kalo ada taneman jangan lupa makan, gausah gerak
        //buat zombie yang jalannya cepet jangan sampe tanemannya keloncatin
    }

    //zombie makan kalo didepannya ada taneman
    public void Eat(String[][] screen)
    {
//        screen[y][x-1]
                // kurangin health taneman di depannya, kalo tanemannya kemakan panggil die()
    }

    public void Die(String[][] screen)
    {
        screen[y][x] = "";
        //remove zombie from zombielist
    }

////    protected String type; gaperlu soalnya tipe zombie didefinisiin di kelas anaknya
//    protected int health; //healthnya si zombie
//    protected int speed; //zombie speed
//    protected int attack; //zombie power
////    protected int x;
////    protected int y;
//    Random randomRowSpawn = new Random();
//
//    public Zombie (int speed,int attack) {
////        this.type = type;
//        this.speed = speed; // speed = jumlah steps sekali jalan
//        this.attack = attack;
//        x = random.nextInt(108);
//        y = random.nextInt(4);
//    }
//    public String getType() {
//        return this.type;
//    }
//    public int getX() {
//        return this.x;
//    }
//    public int getY() {
//        return this.y;
//    }
//    public int getSpeed() {
//        return this.speed;
//    }
//    public int getAttack() {
//        return this.attack;
//    }
//    public void showup() {
//        System.out.println(" ");
//    }
//    public void attack() {
//        System.out.println(" ");
//    }
}
