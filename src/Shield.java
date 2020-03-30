import java.util.ArrayList;

public interface Shield {
    public String getType();
    public void buy();
//    public void gun();
    public void gun(String[][] screen, ArrayList<Bullet> bulletArrayList);
}