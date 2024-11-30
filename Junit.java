import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class SortingTests {
    @Test
    void testQuickSort() {
        int[] arr = {10, 7, 8, 9, 1, 5};
        QuickSort.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 5, 7, 8, 9, 10}, arr);
    }

    @Test
    void testMergeSort() {
        int[] arr = {12, 11, 13, 5, 6, 7};
        MergeSort.mergeSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{5, 6, 7, 11, 12, 13}, arr);
    }

    @Test
    void testBubbleSort() {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        BubbleSort.bubbleSort(arr);
        assertArrayEquals(new int[]{11, 12, 22, 25, 34, 64, 90}, arr);
    }
}