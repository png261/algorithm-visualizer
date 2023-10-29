import sort.*;
import search.*;

public class Main {
    public static void main(String[] args) {
        int[] array = { 5, 4, 3, 2, 1 };
        System.out.println(BinarySearch.search(array, 3));
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
