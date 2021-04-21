package modul2;

public class MaxSum4_Explanation {
    public static int maxSubSum4(int[] a) {
        int maxSum = 0, thisSum = 0;

        for (int j = 0; j < a.length; j++) {
            System.out.println("<Penambahan>\t: " + thisSum + " + " + a[j]);
            thisSum += a[j];
            System.out.println("thisSum\t\t\t: " + thisSum);
            System.out.println();
            System.out.println("<Banding>\t\t: " + thisSum + " >< " + maxSum);
            if (thisSum > maxSum) {
                maxSum = thisSum;
                System.out.println("└─maxSum\t\t: " + maxSum);
            } else if (thisSum < 0) {
                thisSum = 0;
            }
            System.out.println();
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] a = {4, -3, 5, -2, -1, 2, 6, -2};
        int maxSum;

        maxSum = maxSubSum4(a);
        System.out.println("Max sum is " + maxSum);
    }
}
