package modul10;

import java.util.Scanner;
public class Main {
    public static void printMenu() {
        System.out.print("Sorting\n" +
                "1. Bubble Sort\n" +
                "2. Selection Sort\n" +
                "3. Insertion Sort\n" +
                "0. Keluar\n\n" +
                "> "
        );
    }

    static int temp, i, j;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            while (true) {
                printMenu();
                int code = scan.nextInt();

                switch (code) {
                    case 1: {
                        System.out.print("Masukkan jumlah data\t: ");
                        temp = scan.nextInt();
                        int[] data = new int[temp];

                        System.out.println("Masukkan data\t\t\t:");
                        for (i = 0; i < data.length; i++) {
                            data[i] = scan.nextInt();
                        }

                        System.out.print("\nData sebelum disorting\t: ");
                        for (i = 0; i < data.length; i++) {
                            System.out.print(data[i] + " ");
                        }

                        Sorting.bubbleSort(data);

                        System.out.print("\nData setelah disorting\t: ");
                        for (i = 0; i < data.length; i++) {
                            System.out.print(data[i] + " ");
                        }

                        System.out.println("\n");
                        break;
                    }

                    case 2: {
                        System.out.print("Masukkan jumlah data\t: ");
                        temp = scan.nextInt();
                        int[] data = new int[temp];

                        System.out.println("Masukkan data\t\t\t:");
                        for (i = 0; i < data.length; i++) {
                            data[i] = scan.nextInt();
                        }

                        System.out.print("\nData sebelum disorting\t: ");
                        for (i = 0; i < data.length; i++) {
                            System.out.print(data[i] + " ");
                        }

                        Sorting.selectionSort(data);

                        System.out.print("\nData setelah disorting\t: ");
                        for (i = 0; i < data.length; i++) {
                            System.out.print(data[i] + " ");
                        }

                        System.out.println("\n");
                        break;
                    }

                    case 3: {
                        System.out.print("Masukkan jumlah data\t: ");
                        temp = scan.nextInt();
                        int[] data = new int[temp];

                        System.out.println("Masukkan data\t\t\t:");
                        for (i = 0; i < data.length; i++) {
                            data[i] = scan.nextInt();
                        }

                        System.out.print("\nData sebelum disorting\t: ");
                        for (i = 0; i < data.length; i++) {
                            System.out.print(data[i] + " ");
                        }

                        Sorting.insertionSort(data);

                        System.out.print("\nData setelah disorting\t: ");
                        for (i = 0; i < data.length; i++) {
                            System.out.print(data[i] + " ");
                        }

                        System.out.println("\n");
                        break;
                    }

                    case 0: {
                        System.exit(0);
                    }
                }
            }
        } catch (Exception err) {
            System.out.println("[EROR] Masukan bukan angka!");
        }
    }
}
