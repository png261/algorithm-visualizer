package sort;

import static utils.Utils.swap;;

public class CombSort {
    public static void sort(int[] array) {
        int gap = array.length;
        boolean swapped = true;

        while (gap != 1 || swapped) {
            gap = Math.max((gap * 10) / 13, 1);
            swapped = false;

            for (int j = 0; j < array.length - gap; ++j) {
                if (array[j] > array[j + gap]) {
                    swap(array, j, j + gap);
                    swapped = true;
                }
            }
        }
    }
}
