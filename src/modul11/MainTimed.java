package modul11;

import java.util.Scanner;
import java.util.Random;
public class MainTimed {
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
        Random rdm = new Random();

        System.out.print("Sorting\n" +
                "1. Quick Sort\n" +
                "2. Merge Sort\n\n" +
                "> ");
        int code = scn.nextInt();

        double start, finish, duration;
        switch (code) {
            case 1: {
                System.out.println("\nQuick Sort");

                int[] array = new int[100];
                for (int i = 0; i < array.length; i++) {
                    array[i] = rdm.nextInt(10);
                }
                System.out.println("\nSebelum sorting\t: ");
                printArray(array);

                start = System.currentTimeMillis();
                QuickSort.quickSort(array, 0, array.length - 1);
                finish = System.currentTimeMillis();

                System.out.println("\nSesudah sorting\t: ");
                printArray(array);

                duration = (finish - start) / 1000;
                System.out.println("\nDurasi sorting\t: " + duration + " detik");
                break;
            }
            case 2: {
                System.out.println("\nMerge Sort");

                int[] array = new int[100];
                for (int i = 0; i < array.length; i++) {
                    array[i] = rdm.nextInt(10);
                }
                System.out.println("\nSebelum sorting\t: ");
                printArray(array);

                start = System.currentTimeMillis();
                MergeSort.mergeSort(array, 0, array.length - 1);
                finish = System.currentTimeMillis();

                System.out.println("\nSesudah sorting\t: ");
                printArray(array);

                duration = (finish - start) / 1000;
                System.out.println("\nDurasi sorting\t: " + duration + " detik");
                break;
            }
            default: {
                System.out.println("[EROR] Kode tidak dikenal!");
            }
        }
    }
}
