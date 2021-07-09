package modul11;

public class QuickSort {
    static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);
            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, high);
        }
    }

    private static int partition(int[] a, int low, int high) {
        int pivot = a[high];
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            if (a[j] < pivot) {
                i++;
                swap(a, i, j);
            }
        }

        swap(a, i + 1, high);
        return (i + 1);
    }

    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    static void printArray(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }
}
