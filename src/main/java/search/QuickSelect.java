package search;

import java.util.Arrays;

import sort.QuickSort;

public class QuickSelect {
    public static int select(int[] array, int target) {
        return select(Arrays.copyOf(array, array.length), 0, array.length - 1, target);
    }

    private static int select(int[] array, int begin, int end, int target) {
        if (begin > target || end < target) {
            return -1;
        }

        final int pivotIndex = QuickSort.partition(array, begin, end);
        if (pivotIndex == target) {
            return array[pivotIndex];
        }

        if (pivotIndex > target) {
            return select(array, begin, pivotIndex - 1, target);
        }

        return select(array, pivotIndex + 1, end, target);
    }
}
