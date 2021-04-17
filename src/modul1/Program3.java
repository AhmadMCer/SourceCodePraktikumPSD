package modul1;

public class Program3 {
    public static void main(String[] args) {
        // Deklarasi variabel
        int a, b;

        // Outer loop
        for (a = 7; a >= 0; a--) {
            // Cetak baris
            System.out.println();
            // Inner loop
            for (b = 7; b > a; b--) {
                // Cetak angka
                System.out.print(b + " ");
            }
        }
    }
}
