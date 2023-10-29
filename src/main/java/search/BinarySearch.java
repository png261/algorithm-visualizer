package search;

public class BinarySearch {
    public static int search(int[] array, int target) {
        return search(array, 0, array.length - 1, target);
    }

    private static int search(int[] array, int begin, int end, int target) {
        if (begin >= end) {
            return -1;
        }

        final int mid = begin + (end - begin) / 2;
        if (array[mid] == target) {
            return mid;
        }

        if (array[mid] < target) {
            return search(array, begin, mid - 1, target);
        }

        return search(array, mid + 1, end, target);
    }
}
