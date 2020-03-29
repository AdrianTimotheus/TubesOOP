public class RegularZombie extends Zombie{
    public RegularZombie()
    {
        super(10,1,1);
        type = "Regular Zombie";
        screenName = "Z";
    }

    public void Spawn(String[][] screen)
    {
        super.Spawn(screen);
    }

    public void Move(String[][] screen)
    {
        super.Move(screen);
    }

    public void Eat(String[][] screen)
    {
        super.Eat(screen);
    }

    public void Die(String[][] screen)
    {
        super.Die(screen);
    }
}
