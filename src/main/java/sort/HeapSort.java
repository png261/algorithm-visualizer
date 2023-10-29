package sort;

import static sort.SortUtils.*;

public class HeapSort {
    private static void heapify(int[] array, int i, int n) {
        final int leftChild = i * 2 + 1;
        final int rightChild = i * 2 + 2;
        int largest = i;

        if (leftChild < n && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        if (rightChild < n && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        if (largest != i) {
            swap(array, i, largest);
            heapify(array, largest, n);
        }
    }

    private static void buildHeap(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; --i) {
            heapify(array, i, array.length);
        }
    }

    public static void sort(int[] array) {
        buildHeap(array);
        for (int i = array.length - 1; i >= 0; --i) {
            swap(array, 0, i);
            heapify(array, 0, i);
        }
    }
}
