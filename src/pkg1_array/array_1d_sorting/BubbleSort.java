package pkg1_array.array_1d_sorting;

import java.util.Arrays;

/**
 * Bubble Sorting:
 * Easiest sorting technique where each every elements perform comparison from their
 * right side element, if left side element is greater than right-side element the swap
 * both element to each other
 * Example:
 * Given Array: [20, 22, 13, 5, 97]
 * Sorted Array: [5, 13, 20, 22, 97]
 */
public class BubbleSort {
    //Bubble Sort in Ascending
    private static int[] bubbleSort(int[] arr) {
        for (int i=0; i< arr.length; i++) {
            for (int j=i+1; j< arr.length; j++) {
                if (arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    //Bubble Sort in Descending
    private static int[] bubbleSortDesc(int[] arr) {
        for (int i=0; i< arr.length; i++) {
            for (int j=i+1; j< arr.length; j++) {
                if (arr[j]>arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[]arr = {20, 22, 13, 5, 97};
        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.println("Sorted Array(Ascending): " + Arrays.toString(bubbleSort(arr)));
        System.out.println("Sorted Array(Descending): " + Arrays.toString(bubbleSortDesc(arr)));

    }

}
