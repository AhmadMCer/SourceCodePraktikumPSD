package modul2;

import java.util.Random;
public class MaxSum2_Random {
    public static int maxSubSum2(int[] a) {
        int maxSum = 0;

        for (int i = 0; i < a.length; i++) {
            int thisSum = 0;

            for (int j = i; j < a.length; j++) {
                thisSum += a[j];
                if (thisSum > maxSum)
                    maxSum = thisSum;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Random numRandom = new Random();
        int[] a = new int[1000];
        int maxSum;

        for (int i = 0; i <= a.length - 1; i++)
            a[i] = numRandom.nextInt(19) - 9;

        maxSum = maxSubSum2(a);
        System.out.println("Max sum is " + maxSum);
    }
}
