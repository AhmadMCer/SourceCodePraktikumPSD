package modul3;

public class Fib1 {
    public static long fib1(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else {
            long x = 0;
            long y = 1;
            for (int k = 2; k <= n; k++) {
                y = x + y;
                x = y - x;
            }
            return y;
        }
    }

    public static void main(String[] args) {
        long fib = fib1(9);
        System.out.println(fib);
    }
}
