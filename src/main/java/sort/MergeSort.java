package sort;

public class MergeSort {
    private static void merge(int[] array, int begin, int mid, int end) {
        final int leftSize = mid - begin + 1;
        final int rightSize = end - mid;
        int[] arrayLeft = new int[leftSize];
        int[] arrayRight = new int[rightSize];

        for (int i = 0; i < leftSize; ++i) {
            arrayLeft[i] = array[begin + i];
        }

        for (int i = 0; i < rightSize; ++i) {
            arrayRight[i] = array[mid + 1 + i];
        }

        int leftIndex = 0;
        int rightIndex = 0;
        int mergeIndex = begin;

        while ((leftIndex < leftSize) && (rightIndex < rightSize)) {
            if (arrayLeft[leftIndex] <= arrayRight[rightIndex]) {
                array[mergeIndex] = arrayLeft[leftIndex];
                ++leftIndex;
            } else {
                array[mergeIndex] = arrayRight[rightIndex];
                ++rightIndex;
            }
            ++mergeIndex;
        }

        while (leftIndex < leftSize) {
            array[mergeIndex] = arrayLeft[leftIndex];
            ++leftIndex;
            ++mergeIndex;
        }

        while (rightIndex < rightSize) {
            array[mergeIndex] = arrayRight[rightIndex];
            ++rightIndex;
            ++mergeIndex;
        }
    }

    public static void sort(int[] array) {
        sort(array, 0, array.length - 1);
    }

    public static void sort(int[] array, int begin, int end) {
        if (begin >= end) {
            return;
        }

        final int mid = begin + (end - begin) / 2;
        sort(array, begin, mid);
        sort(array, mid + 1, end);

        merge(array, begin, mid, end);
    }
}
