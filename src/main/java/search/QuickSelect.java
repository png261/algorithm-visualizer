package search;

import static sort.SortUtils.*;

import java.util.Arrays;

public class QuickSelect {
    private static int partition(int[] array, int begin, int end) {
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

    public static int select(int[] array, int target) {
        return select(Arrays.copyOf(array, array.length), 0, array.length - 1, target);
    }

    private static int select(int[] array, int begin, int end, int target) {
        if (begin > target || end < target) {
            return -1;
        }

        final int i = partition(array, begin, end);
        if (i == target) {
            return array[i];
        }

        if (i > target) {
            return select(array, begin, i - 1, target);
        }

        return select(array, i + 1, end, target);
    }
}
