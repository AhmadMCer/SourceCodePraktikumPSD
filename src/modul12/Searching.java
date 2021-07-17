package modul12;

public class Searching {
    static int temp, pos, i, j, start, end, mid, low, high;

    public static int sequential(int[] data, int cari) {
        for (i = 0; i < data.length; i++) {
            if (data[i] == cari) {
                return i;
            }
        }

        return -1;
    }

    public static int[] selectionSort(int[] data){
        for (i = 0; i < data.length - 1; i++){
            pos = i;
            for (j = i + 1; j < data.length; j++){
                if (data[j] < data[pos]){
                    pos = j;
                }
            }

            if (pos != i){
                temp = data[pos];
                data[pos] = data[i];
                data[i] = temp;
            }
        }

        return data;
    }

    public static int binarySearch(int[] data, int cari) {
        Searching.selectionSort(data);

        start = 0;
        end = data.length - 1;
        while (start <= end) {
            mid = (start + end) / 2;
            if (data[mid] == cari) {
                return mid;
            } else if (data[mid] < cari) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static int interpolationSearch(int[] data, int cari) {
        Searching.selectionSort(data);

        low = 0;
        high = data.length - 1;
        while (cari >= data[low] && cari <= data[high]) {
            pos = ((cari - data[low]) / (data[high] - data[low])) * (high - low) + low;

            if (data[pos] == cari) {
                return pos;
            }

            if (data[pos] > cari) {
                high = pos - 1;
            } else if (data[pos] < cari) {
                low = pos + 1;
            }
        }

        return -1;
    }
}
