package modul3;

public class Fib2_Timer {
    public static long fib2(int n) {
        if (n <= 1)
            return n;
        else
            return fib2(n - 1) + fib2(n - 2);
    }

    public static void main(String[] args) {
        double timeStart = System.nanoTime();
        long fib = fib2(9);
        double timeFinish = System.nanoTime();
        double timeElapsed = timeFinish - timeStart ;
        System.out.println(fib);
        System.out.println("\nTime execution : " + timeElapsed + " ns");
    }
}
