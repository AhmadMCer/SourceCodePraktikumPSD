package modul8;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);
        HashMap<Integer, String> hashMap = new HashMap<>();

        int code;
        boolean stop = false;
        do {
            System.out.println("Hash Map");
            System.out.println("1. put");
            System.out.println("2. get");
            System.out.println("3. containsKey");
            System.out.println("4. containsValue");
            System.out.println("5. remove");
            System.out.println("6. size");
            System.out.println("0. Keluar");
            System.out.print("\n> ");
            code = scanInt.nextInt();
            System.out.println();

            int key;
            String value, useKey;
            switch (code) {
                case 1:
                    System.out.print("Apakah menggunakan key? (y/n) ");
                    useKey = scan.nextLine();
                    if (useKey.equalsIgnoreCase("y")) {
                        System.out.print("Masukkan key\t: ");
                        key = scanInt.nextInt();
                        System.out.print("Masukkan value\t: ");
                        value = scan.nextLine();
                        hashMap.put(key, value);
                    } else if (useKey.equalsIgnoreCase("n")) {
                        System.out.print("Masukkan value\t: ");
                        value = scan.nextLine();
                        hashMap.put(null, value);
                    } else {
                        System.out.println("[EROR] Kode salah!");
                    }
                    break;
                case 2:
                    System.out.print("Apakah key-nya null? (y/n) ");
                    useKey = scan.nextLine();
                    if (useKey.equalsIgnoreCase("y")) {
                        System.out.println(hashMap.get(null));
                    } else if (useKey.equalsIgnoreCase("n")) {
                        System.out.print("Masukkan key\t: ");
                        key = scanInt.nextInt();
                        System.out.println(hashMap.get(key));
                    } else {
                        System.out.println("[EROR] Kode salah!");
                    }
                    break;
                case 3:
                    System.out.print("Apakah key-nya null? (y/n) ");
                    useKey = scan.nextLine();
                    if (useKey.equalsIgnoreCase("y")) {
                        System.out.println(hashMap.containsKey(null));
                    } else if (useKey.equalsIgnoreCase("n")) {
                        System.out.print("Masukkan key\t: ");
                        key = scanInt.nextInt();
                        System.out.println(hashMap.containsKey(key));
                    } else {
                        System.out.println("[EROR] Kode salah!");
                    }
                    break;
                case 4:
                    System.out.print("Masukkan value\t: ");
                    value = scan.nextLine();
                    System.out.println(hashMap.containsValue(value));
                    break;
                case 5:
                    System.out.print("Apakah key-nya null? (y/n) ");
                    useKey = scan.nextLine();
                    if (useKey.equalsIgnoreCase("y")) {
                        hashMap.remove(null);
                    } else if (useKey.equalsIgnoreCase("n")) {
                        System.out.print("Masukkan key\t: ");
                        key = scanInt.nextInt();
                        hashMap.remove(key);
                    } else {
                        System.out.println("[EROR] Kode salah!");
                    }
                    break;
                case 6:
                    System.out.println(hashMap.size());
                    break;
                case 0:
                    stop = true;
                    break;
                default:
                    System.out.println("[EROR] Kode salah!");
            }
            System.out.println();
        } while (!stop);
    }
}
