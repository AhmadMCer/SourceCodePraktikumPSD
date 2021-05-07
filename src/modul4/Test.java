package modul4;

import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList list = new LinkedList();

        int code;
        boolean stop = false;
        do {
            System.out.println("Single Linked List");
            System.out.println(" 1. addFirst");
            System.out.println(" 2. addLast");
            System.out.println(" 3. insertAfter");
            System.out.println(" 4. insertBefore");
            System.out.println(" 5. insert");
            System.out.println(" 6. replace");
            System.out.println(" 7. remove");
            System.out.println(" 8. removeAt");
            System.out.println(" 9. removeFirst");
            System.out.println("10. removeLast");
            System.out.println("11. clear");
            System.out.println("12. find");
            System.out.println("13. printNode");
            System.out.println("14. length");
            System.out.println(" 0. Keluar");

            System.out.print("\n> ");
            code = scan.nextInt();
            System.out.println();

            Node input = new Node();
            int index, key, data, data1, data2;
            switch (code) {
                case 1:
                    System.out.print("Masukkan angka\t: ");
                    input.data = scan.nextInt();
                    list.addFirst(input);
                    list.printNode();
                    break;
                case 2:
                    System.out.print("Masukkan angka\t: ");
                    input.data = scan.nextInt();
                    list.addLast(input);
                    list.printNode();
                    break;
                case 3:
                    System.out.print("Masukkan key\t: ");
                    key = scan.nextInt();
                    System.out.print("Masukkan angka\t: ");
                    input.data = scan.nextInt();
                    list.insertAfter(key, input);
                    list.printNode();
                    break;
                case 4:
                    System.out.print("Masukkan key\t: ");
                    key = scan.nextInt();
                    System.out.print("Masukkan angka\t: ");
                    input.data = scan.nextInt();
                    list.insertBefore(key, input);
                    list.printNode();
                    break;
                case 5:
                    System.out.print("Masukkan index\t: ");
                    index = scan.nextInt();
                    System.out.print("Masukkan angka\t: ");
                    input.data = scan.nextInt();
                    list.insertBefore(index, input);
                    list.printNode();
                    break;
                case 6:
                    System.out.print("Masukkan angka 1\t: ");
                    data1 = scan.nextInt();
                    System.out.print("Masukkan angka 2\t: ");
                    data2 = scan.nextInt();
                    list.replace(data1, data2);
                    list.printNode();
                    break;
                case 7:
                    System.out.print("Masukkan angka\t: ");
                    data = scan.nextInt();
                    list.remove(data);
                    list.printNode();
                    break;
                case 8:
                    System.out.print("Masukkan index\t: ");
                    index = scan.nextInt();
                    list.removeAt(index);
                    list.printNode();
                    break;
                case 9:
                    list.removeFirst();
                    list.printNode();
                    break;
                case 10:
                    list.removeLast();
                    list.printNode();
                    break;
                case 11:
                    list.clear();
                    list.printNode();
                    break;
                case 12:
                    System.out.print("Masukkan angka\t: ");
                    data = scan.nextInt();
                    list.find(data);
                    list.printNode();
                    break;
                case 13:
                    list.printNode();
                    break;
                case 14:
                    list.length();
                    list.printNode();
                    break;
                case 0:
                    stop = true;
                    break;
            }
            System.out.println();
        } while (!stop);
    }
}
