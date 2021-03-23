package w03_latihan;

public class ArraySatuDimensi {

    public static void main(String[] args) {
        int[] angka = {10, 22, 34, 46, 58, 80};
        String[] teks = {"Saya", "Sedang", "Belajar", "OOP", "Java"};

        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);

        }
        for (int j = 0; j < teks.length; j++) {
            System.out.print(teks[j]);
            System.out.print(" ");
        }

    }
}
