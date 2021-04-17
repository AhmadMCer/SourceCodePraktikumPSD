package modul1;

import java.util.Scanner;
public class Program4_LuasLing {
    public static void main(String[] args) {
        // Instansiasi objek
        Scanner input = new Scanner(System.in);
        // Deklarasi dan inisialisasi variabel
        double luas, phi = 3.14;
        int r;

        // Input jari-jari
        System.out.print("Masukkan jari-jari : ");
        r = input.nextInt();
        // Menghitung luas lingkaran
        luas = phi * r * r;
        // Cetak luas lingkaran
        System.out.println("Luas lingkaran = " + luas);
    }
}
