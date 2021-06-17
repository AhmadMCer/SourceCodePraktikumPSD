package modul7;

import java.util.Scanner;
public class CircularArray {
    public static void main(String[] args) {
        // DECLARATION
        Scanner scan = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);
        Queue nim = new Queue();
        Queue nama = new Queue();
        Queue alamat = new Queue();

        // INPUT
        System.out.print("Masukkan jumlah mahasiswa\t: ");
        int jumlahMahasiswa = scanInt.nextInt();

        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + i);

            System.out.print("NIM\t\t: ");
            Node nimInput = new Node(scanInt.nextInt());
            nim.enqueue(nimInput);

            System.out.print("Nama\t: ");
            Node namaInput = new Node(scan.nextLine());
            nama.enqueue(namaInput);

            System.out.print("Alamat\t: ");
            Node alamatInput = new Node(scan.nextLine());
            alamat.enqueue(alamatInput);

            System.out.println();
        }

        // OUTPUT
        System.out.print("Keluaran mulai dari mahasiswa ke\t: ");
        int mahasiswaMulai = scanInt.nextInt();

        if (mahasiswaMulai == 1) {
            for (int i = 1; i < jumlahMahasiswa; i++) {
                System.out.println(nim.dequeue().data);
                System.out.println(nama.dequeue().data);
                System.out.println(alamat.dequeue().data);
            }
        } else if (mahasiswaMulai > 1 && mahasiswaMulai <= jumlahMahasiswa) {
            Queue nimTemp = new Queue();
            Queue namaTemp = new Queue();
            Queue alamatTemp = new Queue();

            for (int i = 1; i < mahasiswaMulai; i++) {
                nimTemp.enqueue(nim.dequeue());
                namaTemp.enqueue(nama.dequeue());
                alamatTemp.enqueue(alamat.dequeue());
            }

            for (int i = 1; i <= jumlahMahasiswa - (mahasiswaMulai - 1); i++) {
                System.out.println(nim.dequeue().data);
                System.out.println(nama.dequeue().data);
                System.out.println(alamat.dequeue().data);
                System.out.println();
            }

            for (int i = 1; i < mahasiswaMulai; i++) {
                System.out.println(nimTemp.dequeue().data);
                System.out.println(namaTemp.dequeue().data);
                System.out.println(alamatTemp.dequeue().data);
                System.out.println();
            }
        }
    }
}
