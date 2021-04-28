package modul3;

public class Fib2 {
    public static long fib2(int n) {
        if (n <= 1)
            return n;
        else
            return fib2(n - 1) + fib2(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        long fib = fib2(n);
        System.out.println("n\t\t: " + n);
        System.out.println("fib(n)\t: " + fib);
    }
}
