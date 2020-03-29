import java.util.ArrayList;

public abstract class Bullet implements BulletInterface
{
    protected static final int travelSpeed = 6; //kecepatan peluru melayang, konstan buat tiap peluru
    protected int damage; //seberapa sakit damagenya

    //posisi bullet
    protected int x;
    protected int y; // konstan

    public void Move(String[][] screen, ArrayList<Zombie> zombieArrayList)
    {
        for(int i = 1; i<travelSpeed; i++)
        {
            if (screen[y][x+i].equals("Z") || screen[y][x+i].equals("Y"))
            {
                zombieArrayList[]
            }
        }
        this.x += travelSpeed;
        //kalo depannya ada zombie, bukan '', lakukan damage() dan destroy() yaitu menghiilangkan peluru dari bulletlist
    }

    public void Damage(Zombie zombie)
    {
        zombie.health -= damage;
        //destroy bullet
    }

}
