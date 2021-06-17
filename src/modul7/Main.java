package modul7;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Queue queue = new Queue();

        int code;
        boolean stop = false;
        do {
            System.out.println("Queue");
            System.out.println("1. enqueue");
            System.out.println("2. dequeue");
            System.out.println("3. show");
            System.out.println("4. makeEmpty");
            System.out.println("0. Keluar");

            System.out.print("\n> ");
            code = scan.nextInt();
            System.out.println();

            Node input;
            int read;
            switch (code) {
                case 1:
                    System.out.print("Masukkan angka\t: ");
                    read = scan.nextInt();
                    input = new Node(read);
                    queue.enqueue(input);
                    break;
                case 2:
                    System.out.println(queue.dequeue().data + "\n");
                    break;
                case 3:
                    queue.show();
                    break;
                case 4:
                    queue.makeEmpty();
                    break;
                case 0:
                    stop = true;
                    break;
                default:
                    System.out.println("[EROR] Kode salah!");
            }
        } while (!stop);
    }
}
