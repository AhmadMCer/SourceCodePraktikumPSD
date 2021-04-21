package modul2;

public class MaxSum1_Explanation {
    public static int maxSubSum1(int[] a) {
        // Inisialisasi variabel
        int maxSum = 0;

        // Outer loop
        for (int i = 0; i < a.length; i++) {
            System.out.println("<Outer loop (i)>\t\t: " + i);
            System.out.println("│");

            // Inner loop 1
            for (int j = i; j < a.length; j++) {
                System.out.println("├─<Inner loop 1 (j)>\t: " + j);
                // Inisialisasi variabel
                int thisSum = 0;

                // Inner loop 2
                for (int k = i; k <= j; k++) {
                    System.out.println("│ │");
                    System.out.println("│ ├─<Inner loop 2 (k)>\t: " + k);
                    System.out.println("│ │ │");
                    System.out.println("│ │ ├─<Penjumlahan>\t\t: " + thisSum + " + " + a[k]);
                    thisSum += a[k];
                    System.out.println("│ │ └─thisSum\t\t\t: " + thisSum);
                }
                System.out.println("│ │");

                // Membandingkan sum sementara dengan sum maximal
                System.out.println("│ ├─<Perbandingan>\t\t: " + thisSum + " >< " + maxSum);
                if (thisSum > maxSum) {
                    maxSum = thisSum;
                    System.out.println("│ │ └─maxSum\t\t\t: " + maxSum);
                }
                System.out.println();
            }
            System.out.println();
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] a = {4, -3, 5, -2, -1, 2, 6, -2};
        int maxSum;

        maxSum = maxSubSum1(a);
        System.out.println("Max sum is " + maxSum);
    }
}
