import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Game {
    public String[][] screen = new String[4][108]; 
    private ArrayList<Plant> p;
    private ArrayList<Zombie> z;
    public int credits;
    public boolean gameover = false;
    public int score;
    Random random = new Random();

    public Game(int c) {
         credits = c;
         p = new ArrayList<Plant>();
         z = new ArrayList<Zombie>();
    } 
    
    public int getCredits() {
        return this.credits;
    }

    public int getScore() {
        return this.score;
    }

    public boolean NoCredits() {
        if (credits <= 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public void start() {
        System.out.println("_____________                                                                    __________                                            ");
        System.out.println("|            |  |                                                                         /                         |                  ");
        System.out.println("|            |  |                                                                        /                          |                  ");
        System.out.println("|            |  |                                                                       /                           |                  ");
        System.out.println("|            |  |                            |                                         /                            |         |        ");
        System.out.println("|____________|  |   _________   _______  ____|___                    ________         /      _________  __________  |_______    _______");
        System.out.println("|               |  /         | |       |     |             \\      / |                /       |        | |    |    | |       | | |      |");
        System.out.println("|               | |          | |       |     |              \\    /  |_______        /        |        | |    |    | |       | | |______|");
        System.out.println("|               | |          | |       |     |               \\  /           |      /         |        | |    |    | |       | | |       ");
        System.out.println("|               |  \\_________| |       |     |____            \\/    ________|     /_________ |________| |    |    | |_______| | |_______");
        for (int i=0; i<=3; i++) {
            for (int j=0; j<=107; j++) {
                screen[i][j] =" ";
            }
        }
    }

    public void menu() {
        System.out.println("Command pilihan:");
        System.out.println("1. BUY (Beli Plants)");
        System.out.println("2. SKIP (Play game)");
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
                        System.out.println("|");
                }
                
        }
            
    }
    public boolean isEmpty(int y,int x) {
        if (screen[y-1][x-1].equals(" ")) {
            return true;
        }
        else {
            return false;
        }
    }

    public void buy(int command,int y, int x) {
        if (command==1) {
            Plant ss = new SunFlower(y-1, x-1);
            p.add(ss);
            screen[y-1][x-1] ="S";
            credits -= 5;
        }
        else  if (command==2) {
            Plant pp = new Pea(y-1, x-1);
            p.add(pp);
            credits -= 10;
            screen[y-1][x-1] ="P";
        }
    }

    public void zombieAttack() {
        int n = random.nextInt(4);
        for (int i=0; i<n;i++) {
            int m = random.nextInt(2);
            if (m==0) {
                Zombie zz = new Zambi();
                z.add(zz);
                screen[zz.getY()][107] ="Z";
            }
            else {
                Zombie yy = new Yombie();
                z.add(yy);
                screen[yy.getY()][107] ="Y";
            }
        } 
    }

    public void zombieMoving() {
        int x,y,s;
        String tipe;
        
        for (int i=0; i<z.size(); i++) {
			Zombie now = z.get(i);
			x = now.getX();
            y = now.getY();
            s = now.getSpeed();
            tipe = now.getType();
            screen[y][x] = " ";
            if (isEmpty(y+1,x+1-s)) {
                screen[y][x-s] = tipe;
            }
            else {
                now.setX(x+1);
                if (tipe.equals("Z")) {
                    screen[y][x-1] = tipe;
                }
                else {
                    screen[y][x] = "Y";
                }
            }
		}
        for (Zombie all:z) {
            all.move();
        }
    }

//    public void Shoot()
//    {
//        for (Plant allPlants:p)
//        {
//            allPlants.gun();
//        }
//    }

    public void doZombiesWin() {
        for (int i=0; i<=3;i++) {
            if ((screen[i][0].equals("Z")) || (screen[i][0].equals("Y"))) {
                this.gameover = true;
            }
        }
    }

    public boolean lose() {
        return gameover;
    }
}
