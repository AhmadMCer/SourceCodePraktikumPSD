package modul4;

import java.util.Scanner;
public class Tes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList list = new LinkedList();
        boolean found = false;
        do {
            System.out.println("1. addFirst");
            System.out.println("2. cetak list");
            System.out.println("3. exit");
            System.out.print("Masukkan pilihan : ");
            int menu = s.nextInt();
            switch (menu){
                case 1:
                    String lagi;
                    do {
                        Node obj = new Node();
                        System.out.print("Masukkan data : ");
                        int data = s.nextInt();
                        obj.data = data;
                        list.addFirst(obj);
                        System.out.println("Ingin input lagi? [ya/tidak] : ");
                        lagi = s.next();
                    } while (lagi.equals("ya"));
                    break;
                case 2:
                    System.out.print("Isi list saat ini :");
                    list.printNode();
                    break;
                case 3:
                    found = true;
                    System.out.println("Anda memilih keluar");
                    break;
                default:
                    System.out.println("Tolong input angka saja");
                    break;
            }
        } while (found == false);
    }
}
