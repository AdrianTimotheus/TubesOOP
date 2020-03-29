public abstract class Bullet implements BulletInterface
{
    protected int travelSpeed; //kecepatan peluru melayang
    protected int damage; //seberapa sakit damagenya

    //posisi bullet
    protected int x;
    protected int y; // konstan

    public void Move()
    {
        this.x += travelSpeed;
    }

    public void Damage(Zombie zombie)
    {
        zombie.health -= damage;
        //destroy bullet
    }
}
