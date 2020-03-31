import java.util.ArrayList;

public class Bullet implements BulletInterface
{
    protected static final int travelSpeed = 1; //kecepatan peluru melayang, konstan buat tiap peluru
    protected int power; //seberapa sakit damagenya

    //posisi bullet
    protected int x;
    protected int y; // konstan

    public Bullet(int damage, int x, int y)
    {
        this.power = damage;
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return this.y;
    }
    public int getPower() {
        return this.power;
    }

    public void Move(String[][] screen)
    {
        x++;
        screen[y][x-1] =" ";

        if (screen[y][x].equals("P")) {
            screen[y][x] = "P";  
        }
        else if (screen[y][x].equals("S")) {
            screen[y][x] = "S";
        }
        else if (power == 2) //pea
        {
            ;//peluru ga ditmapilin biar ga nabrak plantnya
        }
        else if (power == 1) //sunflower
        {
            // asumsi depan peluru kosong, maju
            if(power == 2) //pea
            {
                screen[y][x] = "=";
            }
            else if(power == 1) //sunflower
            {
                screen[y][x] = "-";
            }
        }

        

        //kalo depannya ada zombie, bukan '', lakukan damage() dan destroy() yaitu menghiilangkan peluru dari bulletlist
    }

//    public void Damage(Zombie zombie)
//    {
//        zombie.health -= damage;
//        //destroy bullet
//    }

}
