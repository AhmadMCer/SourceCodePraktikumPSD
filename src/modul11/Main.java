package modul11;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{12, 4, 8, 5, 7, 3, 22, 4, 5, 13};
        System.out.println("Array sebelum di sort :");
        QuickSort.printArray(array);
        QuickSort.quickSort(array, 0, array.length-1);
        QuickSort.printArray(array);

        int[] array2 = new int[]{12, 4, 8, 5, 7, 3, 22, 4, 5, 13};
        System.out.println("Array sebelum di sort :");
        MergeSort.printArray(array2);
        MergeSort.mergeSort(array2, 0, array2.length-1);
        MergeSort.printArray(array2);
    }
}
