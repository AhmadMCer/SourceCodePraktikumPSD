package modul3;

public class Fib1_Timer {
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
        double timeStart = System.currentTimeMillis();
        int n = 50;
        System.out.println("n\t\t: " + n);
        System.out.println("fib(n)\t: " + fib1(n));
        double timeFinish = System.currentTimeMillis();
        double timeElapsed = (timeFinish - timeStart) / 1000;
        System.out.println("\nTime execution : " + timeElapsed + " s");
    }
}