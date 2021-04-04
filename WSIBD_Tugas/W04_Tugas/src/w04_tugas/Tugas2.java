package w04_tugas;

import java.util.Scanner;

public class Tugas2 {

    public static void main(String[] args) {
        int number = 1;
        int data = 0;

        System.out.println("         Do__While");
        System.out.println("Perkalian 2 setiap bilangan (1-100)");
        System.out.println("==================================");

        System.out.print("         " + number + " ");
        do {
            number *= 2;
            System.out.print(number + " ");
        } while (number < 100 - number);
        System.out.println(" \n");

        System.out.println("Bilangan Kelipatan 2 (1-100)");
        System.out.println("====================================================================================================================================================");;
        System.out.print(data + " ");
        while (data <= 100 - 2) {
            data += 2;
            System.out.print(data + " ");
        }
        System.out.println("");
    }
}
