package modul3;

public class Fib3_Timer {
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
        double timeStart = System.nanoTime();
        long fib = fib3(9);
        double timeFinish = System.nanoTime();
        double timeElapsed = timeFinish - timeStart ;
        System.out.println(fib);
        System.out.println("\nTime execution : " + timeElapsed + " ns");
    }
}
