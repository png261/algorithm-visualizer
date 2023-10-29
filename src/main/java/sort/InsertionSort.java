package sort;

import static sort.SortUtils.*;

public class InsertionSort {
    public static void sort(int[] array) {
        for (int i = 1; i < array.length; ++i) {
            final int current = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > current) {
                swap(array, j, j + 1);
                j--;
            }
            array[j + 1] = current;
        }
    }
}
