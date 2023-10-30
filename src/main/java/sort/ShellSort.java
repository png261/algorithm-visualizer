package sort;

public class ShellSort {
    public static void sort(int[] array) {
        int gap = 1;
        while (gap < array.length / 3) {
            gap = 3 * gap + 1;
        }

        for (; gap > 0; gap = gap / 3) {
            for (int i = gap; i < array.length; ++i) {
                int current = array[i];
                int j = i - gap;
                while (j >= 0 && array[j] > current) {
                    array[j + gap] = array[j];
                    j -= gap;
                }
                array[j + gap] = current;
            }
        }
    }
}
