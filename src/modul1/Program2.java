package modul1;

public class Program2 {
    public static void main(String[] args) {
        // Deklarasi variabel
        int i, j, k;

        // Outer loop
        for (i = 1; i <= 5; i++) {
            // Inner loop pertama
            for (j = 5; j > i; j--) {
                // Cetak spasi
                System.out.print(" ");
            }
            // Inner loop kedua
            for (k = 1; k < (2 * i); k++) {
                // Cetak bintang
                System.out.print("*");
            }
            // Cetak baris
            System.out.println();
        }
    }
}
