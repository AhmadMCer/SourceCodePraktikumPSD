package modul12;

import java.util.Scanner;
public class Main {
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if ((i + 1) % 20 == 0){
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] data = new int[10];
        System.out.println("Masukkan data array: ");
        for (int i = 0; i < data.length; i++) {
            data[i] = scn.nextInt();
        }

        System.out.println("\n\nData array: ");
        printArray(data);

        System.out.print("\nCari data: ");
        int cari = scn.nextInt();
        int found = Searching.interpolationSearch(data, cari);
        if (found != -1) {
            System.out.println("Data " + cari + " di indeks: " + found);
        } else {
            System.out.println("Data " + cari + " tidak ditemukan!");
        }
    }
}
