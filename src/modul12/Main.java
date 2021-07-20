package modul12;

import java.util.Scanner;
import java.util.Random;
public class Main {
    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rdm = new Random();

        System.out.println("Searching\n" +
                "1. Sequential Search\n" +
                "2. Binary Search\n" +
                "3. Interpolation Search\n");

        System.out.print("> ");
        int code = scn.nextInt();

        int[] data = new int[10];
        for (int i = 0; i < data.length; i++) {
            data[i] = rdm.nextInt(10);
        }

        System.out.println("\nData array: ");
        printArray(data);

        System.out.print("\nCari data: ");
        int cari = scn.nextInt();

        int found = -1;
        boolean error = false;
        switch (code) {
            case 1:
                found = Searching.sequentialSearch(data, cari);
                break;
            case 2:
                found = Searching.binarySearch(data, cari);
                break;
            case 3:
                found = Searching.interpolationSearch(data, cari);
                break;
            default:
                error = true;
        }

        if (!error) {
            if (code == 2 || code == 3) {
                System.out.println("\nData array sorted: ");
                printArray(data);
            }

            if (found != -1) {
                System.out.println("\nData " + cari + " di indeks: " + found);
            } else {
                System.out.println("\nData " + cari + " tidak ditemukan!");
            }
        } else {
            System.out.println("[EROR] Kode tidak dikenal!");
        }
    }
}
