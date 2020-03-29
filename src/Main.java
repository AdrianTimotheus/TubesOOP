import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);  // Create a Scanner object

        Game g = new Game(300);
        g.start();
        
        boolean valid = false;
        while (!g.lose() || !valid) {
            g.menu();
            System.out.print("Input command :");

            String command = input.next(); // Read user input
            if (command.equals("BUY") && !g.NoCredits()) {
                valid = true;
                g.print();
                System.out.println("Total credits Anda saat ini :"+g.getCredits());
                System.out.println("Pilihan :");
                System.out.println("1. Sunflower (5 credits)  --> Kekuatan tembakan = 1");
                System.out.println("2. Pea       (10 credits) --> Kekuatan tembakan = 2");
                System.out.print("Input pilihan :");
                int choice = input.nextInt();
                while (choice!=1 && choice!=2) {
                    System.out.println("Command yang Anda masukkan salah. Silahkan input kembali.");
                    System.out.print("Input pilihan :");
                    choice = input.nextInt();
                }
                System.out.println("Anda dapat memilih lokasi untuk meletakkan Plant tsb.");
                System.out.print("Baris ke- (dari atas: 1-4) :");
                int y = input.nextInt();
                System.out.print("Posisi ke- (dari kiri: 1-50) :");
                int x = input.nextInt();
                while (!g.isEmpty(y,x)) {
                    System.out.println("Posisi yang Anda masukkan saat ini tidak kosong. Silahkan input kembali.");
                    System.out.print("Baris ke- (dari atas: 1-4) :");
                    y = input.nextInt();
                    System.out.print("Posisi ke- (dari kiri: 1-50) :");
                    x = input.nextInt();
                }
                if (g.isEmpty(y,x)) {
                    int cek = g.getCredits();
                    int sisa;
                        if (choice == 1) {
                            sisa = cek - 5;
                        }
                        else {
                            sisa = cek - 10;
                        }
                    if (sisa<0) {
                        System.out.println("Maaf, credits yang Anda miliki kurang. Pembelian gagal.");
                    }
                    else {
                        System.out.println("Pembelian berhasil. Total credits Anda saat ini :"+sisa);
                        g.buy(choice,y,x);
                    }
                }
                g.print();
            }
            else if (command.equals("BUY") && g.NoCredits()) {
                System.out.println("Maaf, Anda tidak memiliki sisa credits. Pembelian tidak dapat dilakukan.");
            }
            else if (command.equals("SKIP")) {
                valid = true;
            }
            else {
                System.out.println("Command yang Anda masukkan salah. Silahkan input kembali.");
            }
            g.doZombiesWin();
        }
    }
}
