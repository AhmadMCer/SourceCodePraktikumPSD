package modul11;

public class MergeSort {
    public static void mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int middle = left + (right - left) / 2;

            mergeSort(a, left, middle);
            mergeSort(a, middle + 1, right);

            merge(a, left, middle, right);
        }
    }

    private static void merge(int[] a, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] l = new int[n1];
        int[] r = new int[n2];

        for (int i = 0; i < n1; i++) {
            l[i] = a[left + i];
        }

        for (int i = 0; i < n2; i++) {
            r[i] = a[middle + 1 + i];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (l[i] <= r[j]) {
                a[k] = l[i];
                i++;
            } else {
                a[k] = r[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            a[k] = l[i];
            i++;
            k++;
        }

        while (j < n2) {
            a[k] = r[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }
}
