public class Main {
    public static void main(String[] args) {
        boolean gameOver = false; 
        Game g = new Game(300);
        g.start();
        g.menu();
        

        while (!gameOver) {

            gameOver = true;
        }
    }
}
