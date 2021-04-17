package modul1;

public class Program1 {
    public static void main(String[] args) {
        // Deklarasi variabel
        int i, j;

        // Outer loop
        for (i = 1; i <= 5; i++) {
            // Inner loop
            for (j = 1; j <= i; j++) {
                // Cetak bintang
                System.out.print("*");
            }
            // Cetak baris
            System.out.println();
        }
    }
}
