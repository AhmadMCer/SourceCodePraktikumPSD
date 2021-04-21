package modul2;

import java.util.Random;
public class MaxSum1_Random {
    public static int maxSubSum1(int[] a) {
        int maxSum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                int thisSum = 0;

                for (int k = i; k <= j; k++)
                    thisSum += a[k];

                if (thisSum > maxSum)
                    maxSum = thisSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Random acak = new Random();
        int[] a = new int[1000];
        int maxSum;

        for (int i = 0; i < a.length - 1; i++)
            a[i] = acak.nextInt(19) - 9;

        maxSum = maxSubSum1(a);
        System.out.println("Max sum is " + maxSum);
    }
}
