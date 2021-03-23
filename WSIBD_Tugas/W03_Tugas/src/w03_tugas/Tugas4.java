package w03_tugas;

import java.util.Scanner;
public class Tugas4 {
    
    public static void main(String[] args) {
       String nama;
        Scanner scan = new Scanner(System.in);
        int[] barang = new int[5];
        int harga = 0;
        int total = 0;
        System.out.println("--------------------------------------------");
        System.out.println("        Kharisma Agung Plaza < KAP >        ");
        System.out.println("          Promo Belanja Berhadiah           ");
        System.out.println("     Khusus Pembelian 5 Barang Pertama      ");
        System.out.println("     Dengan harga minimum Rp. 10000,00      ");
        System.out.println("--------------------------------------------");
        System.out.print("Masukkan nama pembeli : ");
        nama = scan.nextLine();
        System.out.println("");

        for (int i = 1; i < 6; i++) {
            System.out.print("Masukkan harga barang ke-" + i + " : ");
            harga = scan.nextInt();
            barang[i - 1] = harga;
            total = total + harga;
        }
        System.out.println("Total harga pembelian atas nama " + nama + " adalah Rp. " + total);
        System.out.println("");

        if (barang[0] < 10000 || barang[1] < 10000 || barang[2] < 10000 || barang[3] < 10000 || barang[4] < 10000) {
            System.out.println("---------------------------------------------");
            System.out.println("                 Terima Kasih");
            System.out.println(" Anda sudah belanja di Kharisma Agung Plaza ");
        } else {
            System.out.println("Selamat....");
            System.out.println("Anda mendapat hadiah 1 buah mug cantik");
            System.out.println("--------------------------------------------");
            System.out.println("                Terima Kasih");
            System.out.println(" Anda sudah belanja di Kharisma Agung Plaza ");
        }

    }
}
