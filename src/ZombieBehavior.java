public interface ZombieBehavior
{
    public void Spawn(String[][] screen);
    public void Move(String[][] screen);
    public void Eat(String[][] screen);
    public void Die(String[][] screen);
//    public void EnterHouse();
//    public void Damaged();
}
