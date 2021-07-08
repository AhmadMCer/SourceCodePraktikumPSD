package modul10;

import java.util.Scanner;
public class MainLinkedList {
    public static void printMenu() {
        System.out.print("Linked List Sorting\n" +
                "1. Bubble Sort\n" +
                "2. Selection Sort\n" +
                "3. Insertion Sort\n" +
                "0. Keluar\n\n" +
                "> "
        );
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            while (true) {
                LinkedListSort sort = new LinkedListSort();

                printMenu();
                int code = scan.nextInt();

                switch (code) {
                    case 1: {
                        System.out.print("Masukkan jumlah data\t: ");
                        int jumlah = scan.nextInt();

                        System.out.println("Masukkan data\t\t\t:");
                        for (int i = 1; i <= jumlah; i++) {
                            sort.add(scan.nextInt());
                        }

                        System.out.print("\nData sebelum sorting\t: ");
                        sort.printNodes();

                        sort.bubbleSort();
                        System.out.print("Data setelah sorting\t: ");
                        sort.printNodes();

                        System.out.println();
                        break;
                    }

                    case 2: {
                        System.out.print("Masukkan jumlah data\t: ");
                        int jumlah = scan.nextInt();

                        System.out.println("Masukkan data\t\t\t:");
                        for (int i = 1; i <= jumlah; i++) {
                            sort.add(scan.nextInt());
                        }

                        System.out.print("\nData sebelum sorting\t: ");
                        sort.printNodes();

                        sort.selectionSort();
                        System.out.print("Data setelah sorting\t: ");
                        sort.printNodes();

                        System.out.println();
                        break;
                    }

                    case 3: {
                        System.out.print("Masukkan jumlah data\t: ");
                        int jumlah = scan.nextInt();

                        System.out.println("Masukkan data\t\t\t:");
                        for (int i = 1; i <= jumlah; i++) {
                            sort.add(scan.nextInt());
                        }

                        System.out.print("\nData sebelum sorting\t: ");
                        sort.printNodes();

                        sort.insertionSort();
                        System.out.print("Data setelah sorting\t: ");
                        sort.printNodes();

                        System.out.println();
                        break;
                    }

                    case 0: {
                        System.exit(0);
                        break;
                    }
                }
            }
        } catch (Exception err) {
            System.out.println("[EROR] Masukan bukan angka!");
        }
    }
}
