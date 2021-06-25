package modul9;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();

        int code;
        boolean stop = false;
        do {
            System.out.println("Binary Search Tree");
            System.out.println("1. insert");
            System.out.println("2. find");
            System.out.println("3. findMax");
            System.out.println("4. findMin");
            System.out.println("5. remove");
            System.out.println("6. removeAll");
            System.out.println("7. findDirectory");
            System.out.println("8. getLeafCount");
            System.out.println("0. Keluar");
            System.out.print("\n> ");
            code = scanInt.nextInt();
            System.out.println();

            int data;
            Node input;
            switch (code) {
                case 1:
                    System.out.print("Masukkan data: ");
                    data = scanInt.nextInt();
                    input = new Node(data);
                    bst.insert(input);
                    break;
                case 2:
                    System.out.print("Data yang dicari: ");
                    data = scanInt.nextInt();
                    bst.find(data);
                    break;
                case 3:
                    System.out.println("Data yang terbesar: " + bst.findMax().data);
                    break;
                case 4:
                    System.out.println("Data yang terkecil: " + bst.findMin().data);
                    break;
                case 5:
                    System.out.print("Data yang dihapus: ");
                    data = scanInt.nextInt();
                    bst.remove(data);
                    break;
                case 6:
                    bst.removeAll();
                    break;
                case 7:
                    System.out.print("Data yang dicari: ");
                    data = scanInt.nextInt();
                    bst.findDirectory(data);
                    break;
                case 8:
                    System.out.println("Jumlah leaf: " + bst.getLeafCount());
                    break;
                case 0:
                    stop = true;
                    break;
            }

            System.out.println();
        } while (!stop);
    }
}
