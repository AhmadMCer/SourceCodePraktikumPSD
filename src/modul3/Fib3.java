package modul3;

public class Fib3 {
    public static long fib3(int n) {
        long fib1 = 0;
        long fib2 = 1;
        long result = 0;
        for (int ii = 2; ii <= n; ii++) {
            result = fib2 + fib1;
            fib1 = fib2;
            fib2 = result;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("n\t\t: " + n);
        System.out.println("fib(n)\t: " + fib3(n));
    }
}
