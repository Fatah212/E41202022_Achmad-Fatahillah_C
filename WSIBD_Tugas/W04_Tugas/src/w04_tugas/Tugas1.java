package w04_tugas;

import java.util.Scanner;

public class Tugas1 {

    public static void main(String[] args) {
        int NilaiAwal, NilaiAkhir;
        Scanner scan = new Scanner(System.in);

        System.out.print("Masukkan Nilai awal : ");
        NilaiAwal = scan.nextInt();
        System.out.print("Masukkan Nilai akhir : ");
        NilaiAkhir = scan.nextInt();
        System.out.print("\n");

        if (NilaiAwal > NilaiAkhir) {
            System.out.print("Batas nilai awal tidak boleh lebih dari batas nilai akhir ");
        } else if (NilaiAwal % 2 == 1 & NilaiAkhir == NilaiAkhir) {
            System.out.print("Tidak ada bilangan genap");
        } else {
            for (int i = NilaiAwal; NilaiAwal <= NilaiAkhir; NilaiAwal++) {
                if (NilaiAwal % 2 == 0) {
                    System.out.print(NilaiAkhir + " ");
                }
            }
        }
        System.out.println("\n");
    }
}
