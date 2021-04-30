package modul3;

public class Fib4_Timer {
    public static long fib4(int n) {
        return fiboHelp(0, 1, n);
    }

    public static long fiboHelp(long x, long y, int n) {
        if (n == 0)
            return x;
        else if (n == 1)
            return y;
        else
            return fiboHelp(y, x + y, n - 1);
    }

    public static int rekursif(int pangkat, int bilangan) {
        if (pangkat == 0)
            return 1;
        else
            return bilangan * rekursif(pangkat - 1, bilangan);
    }

    public static void main(String[] args) {
        double timeStart = System.currentTimeMillis();
        int n = 50;
        int bilangan = 2;
        int pangkat = 10;
        System.out.println("n\t\t: " + n);
        System.out.println("fib(n)\t: " + fib4(n));
        System.out.println("pangkat\t: " + rekursif(pangkat, bilangan));
        double timeFinish = System.currentTimeMillis();
        double timeElapsed = (timeFinish - timeStart) / 1000;
        System.out.println("\nTime execution : " + timeElapsed + " s");
    }
}
