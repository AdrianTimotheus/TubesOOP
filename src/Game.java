public class Game {
    public String[][] screen = new String[4][108]; 
    public Plant p;
    public Zombie z;
    public int credits;

    public Game(int c) {
         credits = c;
    } 
    
    public void start() {
        System.out.print("_____________   ");
        System.out.print("|            |  | ");
        System.out.print("|            |  | ");
        System.out.print("|            |  | ");
        System.out.print("|            |  | ");
        System.out.print("|____________|  | ");
        System.out.print("|               | ");
        for (int i=0; i<=3; i++) {
            for (int j=0; j<=107; j++) {
                screen[i][j] =" ";
            }
        }
    }
    public void print() {
        int index=0;
        for (int i=1; i<=9; i++) {
                if (i%2!=0) {
                    for (int j=1; j<=110; j++) {
                        System.out.print("-");
                    }
                    System.out.println("\n");
                }

                else if (i%2==0) {
                    for (int k=1; k<=3; k++) {
                        if (k==2) {
                                if (i==2) {
                                    index = 0;
                                }
                                else if (i==4) {
                                    index = 1;
                                }
                                else if (i==6) {
                                    index = 2;
                                }
                                else if (i==8) {
                                    index = 3;
                        }
                            System.out.print("|");
                                for (int j=0; j<=107; j++) {
                                    System.out.print(screen[index][j] );
                                }
                
                            System.out.print("|");
                        }
                        else {
                            System.out.print("|");
                            for (int j=1; j<=9; j++) {
                                System.out.print("            ");
                            }
                            System.out.print("|");
                        }
                        System.out.println("\n");
                    }
                }
            }
    }
}