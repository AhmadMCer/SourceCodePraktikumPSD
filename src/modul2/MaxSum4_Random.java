package modul2;

import java.util.Random;
public class MaxSum4_Random {
    public static int maxSubSum4(int[] a) {
        int maxSum = 0, thisSum = 0;

        for (int j = 0; j < a.length; j++) {
            thisSum += a[j];
            if (thisSum > maxSum)
                maxSum = thisSum;
            else if (thisSum < 0)
                thisSum = 0;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Random numRandom = new Random();
        int[] a = new int[1000];
        int maxSum;

        for (int i = 0; i <= a.length - 1; i++)
            a[i] = numRandom.nextInt(19) - 9;

        maxSum = maxSubSum4(a);
        System.out.println("Max sum is " + maxSum);
    }
}
