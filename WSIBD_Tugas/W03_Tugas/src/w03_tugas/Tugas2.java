package w03_tugas;

import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan deret array: ");
        int angka = scan.nextInt();

        int[] data = new int[angka];
        for (int i = 0; i < angka; i++) {
            int dataNumb = (int) (Math.random() * 9 + 1);
            data[i] = dataNumb;
            System.out.print(data[i] + " ");
        }
    }
}
