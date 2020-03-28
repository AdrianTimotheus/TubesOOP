public class Main {
    public static void main(String[] args) {
        boolean gameOver = false; 
        Game g = new Game(300);
        g.start();
        g.print();
        while (!gameOver) {

            gameOver = true;
        }
    }
}
