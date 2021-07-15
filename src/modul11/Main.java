package modul11;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[] {12, 4, 8, 5, 7, 3, 22, 4, 5, 13};
        System.out.println("Quick Sort");

        System.out.print("Sebelum sorting\t: ");
        QuickSort.printArray(array);

        QuickSort.quickSort(array, 0, array.length - 1);

        System.out.print("Sesudah sorting\t: ");
        QuickSort.printArray(array);

        int[] array2 = new int[] {12, 4, 8, 5, 7, 3, 22, 4, 5, 13};
        System.out.println("\nMerge Sort");

        System.out.print("Sebelum sorting\t: ");
        MergeSort.printArray(array2);

        MergeSort.mergeSort(array2, 0, array2.length - 1);

        System.out.print("Sesudah sorting\t: ");
        MergeSort.printArray(array2);
    }
}
