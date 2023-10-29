package sort;

import static sort.SortUtils.*;

public class BubbleSort {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; ++i) {
            boolean swapped = false;
            for (int j = 0; j < array.length - 1 - i; ++j) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    swapped = true;
                }
            }
            if (swapped == false) {
                return;
            }
        }
    }
}
