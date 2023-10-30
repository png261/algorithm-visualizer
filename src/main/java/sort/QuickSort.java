package sort;

import static sort.SortUtils.*;

public class QuickSort {
    public static int partition(int[] array, int begin, int end) {
        final int randomIndex = (int) ((Math.random() * (end - begin)) + begin);
        final int pivot = array[randomIndex];

        int pivotIndex = begin;
        for (int i = begin; i <= end; ++i) {
            if (array[i] < pivot) {
                ++pivotIndex;
            }
        }
        swap(array, randomIndex, pivotIndex);

        int i = begin;
        int j = end;
        while (true) {
            while (i <= end && array[i] <= pivot) {
                ++i;
            }

            while (j >= begin && array[j] > pivot) {
                --j;
            }

            if (i > pivotIndex || j < pivotIndex) {
                return pivotIndex;
            }

            swap(array, i, j);
        }
    }

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    public static void sort(int[] array, int begin, int end) {
        if (begin >= end) {
            return;
        }

        final int i = partition(array, begin, end);
        sort(array, begin, i - 1);
        sort(array, i + 1, end);
    }
}
