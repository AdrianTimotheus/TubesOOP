import java.util.ArrayList;

public interface Shield {
    public String getType();    
    public int getPrice();
    public int getPower();
    public void gun(String[][] screen, ArrayList<Bullet> bulletArrayList);
}