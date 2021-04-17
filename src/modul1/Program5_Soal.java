package modul1;

public class Program5_Soal {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi variabel
        int i, j, num = 1;

        // Outer loop
        for (i = 1; i <= 4; i++) {
            // Inner loop
            for (j = 1; j <= i; j++) {
                // Cetak angka
                System.out.print((num % 10) + " ");
                // Tambah angka
                num++;
            }
            // Cetak baris
            System.out.println();
        }
    }
}
