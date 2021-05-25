package modul6;

import java.util.Scanner;
public class KonversiBinerKeDesimal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack stack = new Stack();

        System.out.println("Konversi Biner ke Desimal");
        System.out.println("Masukkan Biner (ketik 2 untuk selesai)");

        boolean stop = false;
        do {
            int biner;
            System.out.print("> ");
            biner = scan.nextInt();
            if (biner >= 0 && biner < 2) {
                Node input = new Node(biner);
                stack.push(input);
            } else if (biner == 2) {
                stop = true;
            } else {
                System.out.println("[EROR] Bukan bilangan biner!");
            }
        } while (!stop);

        int exponent = 0;
        int decimal = 0;
        while (!stack.isEmpty()) {
            int biner;
            biner = stack.popReturn();
            decimal += biner * Math.pow(2, exponent);
            exponent++;
        }

        System.out.println("\n" + decimal);
    }
}
