public class Main {
    public static void main(String[] args) {
        boolean gameOver = false; 
        int point = 300;
        while (!gameOver) {
            for (int i=1; i<=9; i++) {
                if (i%2!=0) {
                    for (int j=1; j<=110; j++) {
                        System.out.print("-");
                    }
                    System.out.println("\n");
                }
                else if (i%2==0) {
                    for (int k=1; k<=3; k++) {
                        System.out.print("|");
                        for (int j=1; j<=9; j++) {
                            System.out.print("            ");
                        }
                        System.out.print("|");
                        System.out.println("\n");
                    }
                }
            }
            gameOver = true;
        }
    }
}
