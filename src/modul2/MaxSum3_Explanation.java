package modul2;

public class MaxSum3_Explanation {
    private static int maxSumRec(int[] a, int left, int right) {
        if (left == right) {
            if (a[left] > 0)
                return a[left];
            else
                return 0;
        }

        int center = (left + right) / 2;
        System.out.println("Left\t: " + left);
        System.out.println("Right\t: " + right);
        System.out.println("Center\t: " + center);
        System.out.println();

        int maxLeftSum = maxSumRec(a, left, center);
        int maxRightSum = maxSumRec(a, center + 1, right);

        System.out.println("---");
        int maxLeftBorderSum = 0, leftBorderSum = 0;
        for (int i = center; i >= left; i--) {
            leftBorderSum += a[i];
            System.out.println("leftBorderSum (" + i + ") = " + leftBorderSum);
            if (leftBorderSum > maxLeftBorderSum)
                maxLeftBorderSum = leftBorderSum;
        }

        int maxRightBorderSum = 0, rightBorderSum = 0;
        for (int i = center + 1; i <= right; i++) {
            rightBorderSum += a[i];
            System.out.println("rightBorderSum (" + i + ") = " + rightBorderSum);
            if (rightBorderSum > maxRightBorderSum)
                maxRightBorderSum = rightBorderSum;
        }

        System.out.println("---");
        for (int i = left; i <= right; i++)
            System.out.print(a[i] + " ");
        System.out.println();
        System.out.println("maxLeftSum = " + maxLeftSum + "\nmaxRightSum = " + maxRightSum + "\nmaxLeftBorderSum = " + maxLeftBorderSum + "\nmaxRightBorderSum = " + maxRightBorderSum + "\nmaxLeftBorderSum + maxRightBorderSum = " + (maxLeftBorderSum + maxRightBorderSum));
        System.out.println("maxSum = " + max3(maxLeftSum, maxRightSum, maxLeftBorderSum + maxRightBorderSum));
        System.out.println("---");
        System.out.println();

        return max3(maxLeftSum, maxRightSum, maxLeftBorderSum + maxRightBorderSum);
    }

    public static int maxSubSum3(int[] a) {
        return maxSumRec(a, 0, a.length - 1);
    }

    public static int max3(int a, int b, int c) {
        return a > b ? (a > c ? a : c) : (b > c ? b : c);
    }

    public static void main(String[] args) {
        int[] a = {4, -3, 5, -2, -1, 2, 6, -2};
        int maxSum;

        maxSum = maxSubSum3(a);
        System.out.println("Max sum is " + maxSum);
    }
}
