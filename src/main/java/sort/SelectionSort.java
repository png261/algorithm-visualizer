package sort;

import static sort.SortUtils.*;

public class SelectionSort {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; ++j) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                swap(array, i, minIndex);
            }
        }
    }
}
