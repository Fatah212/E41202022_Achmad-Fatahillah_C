package w03_tugas;

import java.util.Scanner;

public class Tugas5 {

    public static void main(String[] args) {
        String[] menu = {"Soft drinks", "Mix juice", "Nescafe", "Soda milk", "Tea"};

        System.out.println("      CAFE CERIA");
        System.out.println("    ANEKA MINUMAN");
        System.out.println("----------------------");
        System.out.println("    SPECIAL MENU :");

        String name;
        int pilihan;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < menu.length; i++) {
            System.out.println("   " + (i + 1) + ". " + menu[i]);
        }
        System.out.println("----------------------");

        System.out.print("Masukkan nama pembeli : ");
        name = scan.nextLine();

        System.out.println("");
        System.out.print("Silahkan masukkan pilihan anda : ");
        pilihan = scan.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Minuman yang anda pesan adalah Soft drinks");
                break;
            case 2:
                System.out.println("Minuman yang anda pesan adalah Mix juice");
                break;
            case 3:
                System.out.println("Minuman yang anda pesan adalah Nescafe");
                break;
            case 4:
                System.out.println("Minuman yang anda pesan adalah Soda milk");
                break;
            case 5:
                System.out.println("Minuman yang anda pesan adalah Tea");
                break;
            default:
                System.out.println("Nomor yang anda masukkan salah!");
        }

        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima kasih " + name + " telah berkunjung di Cafe Ceria");
    }
    static void stripLine() {
        String line;
        line = "------------------------------------------------";
        System.out.println(line);

    }

}
