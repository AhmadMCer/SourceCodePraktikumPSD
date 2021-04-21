package modul2;

public class MaxSum2_Explanation {
    public static int maxSubSum2(int[] a) {
        int maxSum = 0;

        for (int i = 0; i < a.length; i++) {
            System.out.println();
            System.out.println("<Outer loop (i)>\t\t\t\t: " + i);
            int thisSum = 0;

            for (int j = i; j < a.length; j++) {
                System.out.println("│");
                System.out.println("├─<Inner loop (j)>\t\t\t: " + j);
                System.out.println("│ ├─<Tambah>\t\t: " + thisSum + " + " + a[j]);
                thisSum += a[j];
                System.out.println("│ ├─thisSum\t: " + thisSum);
                System.out.println("│ │");
                System.out.println("│ └─<Banding>\t\t: " + thisSum + " >< " + maxSum);
                if (thisSum > maxSum) {
                    maxSum = thisSum;
                    System.out.println("│   └─<maxSum>\t: " + maxSum);
                }
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] a = {4, -3, 5, -2, -1, 2, 6, -2};
        int maxSum;

        maxSum = maxSubSum2(a);
        System.out.println("Max sum is " + maxSum);
    }
}
