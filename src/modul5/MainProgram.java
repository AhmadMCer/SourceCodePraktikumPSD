package modul5;

import java.util.Scanner;
public class MainProgram {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        Scanner scan = new Scanner(System.in);

        int code;
        boolean stop = false;
        do {
            System.out.println("Double Linked List");
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
            System.out.println("12. show");
            System.out.println("13. showReversed");
            System.out.println("14. find");
            System.out.println("15. length");
            System.out.println(" 0. Keluar");

            System.out.print("\n> ");
            code = scan.nextInt();
            System.out.println();

            Node input, key, data, data1, data2;
            int index, read;
            switch (code) {
                case 1:
                    System.out.print("Masukkan data\t:");
                    read = scan.nextInt();
                    input = new Node(read);
                    list.addFirst(input);
                    list.show();
                    break;
                case 2:
                    System.out.print("Masukkan data\t:");
                    read = scan.nextInt();
                    input = new Node(read);
                    list.addLast(input);
                    list.show();
                    break;
                case 3:
                    System.out.print("Masukkan key\t:");
                    read = scan.nextInt();
                    key = new Node(read);
                    System.out.print("Masukkan data\t:");
                    read = scan.nextInt();
                    input = new Node(read);
                    list.insertAfter(key, input);
                    list.show();
                    break;
                case 4:
                    System.out.print("Masukkan key\t:");
                    read = scan.nextInt();
                    key = new Node(read);
                    System.out.print("Masukkan data\t:");
                    read = scan.nextInt();
                    input = new Node(read);
                    list.insertBefore(key, input);
                    list.show();
                    break;
                case 5:
                    System.out.print("Masukkan index\t:");
                    index = scan.nextInt();
                    System.out.print("Masukkan data\t:");
                    read = scan.nextInt();
                    input = new Node(read);
                    list.insert(index, input);
                    list.show();
                    break;
                case 6:
                    System.out.print("Masukkan data 1\t:");
                    read = scan.nextInt();
                    data1 = new Node(read);
                    System.out.print("Masukkan data 2\t:");
                    read = scan.nextInt();
                    data2 = new Node(read);
                    list.replace(data1, data2);
                    list.show();
                    break;
                case 7:
                    System.out.print("Masukkan data\t:");
                    read = scan.nextInt();
                    data = new Node(read);
                    list.remove(data);
                    list.show();
                    break;
                case 8:
                    System.out.print("Masukkan index\t:");
                    index = scan.nextInt();
                    list.removeAt(index);
                    list.show();
                    break;
                case 9:
                    list.removeFirst();
                    list.show();
                    break;
                case 10:
                    list.removeLast();
                    list.show();
                    break;
                case 11:
                    list.clear();
                    break;
                case 12:
                    list.show();
                    break;
                case 13:
                    list.showReversed();
                    break;
                case 14:
                    System.out.print("Masukkan data\t:");
                    read = scan.nextInt();
                    data = new Node(read);
                    list.find(data);
                    break;
                case 15:
                    list.length();
                    break;
                case 0:
                    stop = true;
                    break;
            }
            System.out.println();
        } while (!stop);
    }
}
