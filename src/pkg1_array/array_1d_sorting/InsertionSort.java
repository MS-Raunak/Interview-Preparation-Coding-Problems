package pkg1_array.array_1d_sorting;

import java.util.Arrays;

/**
 * It works by iteratively selecting an unsorted element and placing it in its
 * correct position within the sorted portion of the array.
 *
 * In Simple, It takes current element from right-side and compare with each
 * ele of left side.
 *
 *STEPS:-
 * Start: Begin with the second element of the array,
 * assuming the first element is already sorted by default.
 *
 * Insertion: For each element in the unsorted portion of the array,
 * compare it to the elements in the sorted portion, moving from right to left.
 *
 * Shifting: If the current element is smaller than the element being compared in
 * the sorted portion, shift the larger element one position to the right.
 *
 * Insertion Point: Repeat step 3 until you find the correct position for the current
 * element in the sorted portion.
 *
 * Insert: Once the correct position is found, insert the current element into that
 * position.
 *
 * Repeat: Continue this process for each remaining element in the unsorted portion
 * until the entire array is sorted.
 *
 * End: The array is now sorted.
 *
 * Example:
 * Given Array: [20, 22, 13, 5, 97, 1, 7, 98]
 * Sorted Array: [1, 5, 7, 13, 20, 22, 97, 98]
 *
 */
public class InsertionSort {
    //Insertion Sort: In Ascending Order
    private static int[] insertionSort(int[] arr) {
        for (int i=1; i< arr.length; i++){
            int j=i;
            while (j >= 1){
                if (arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                j--;
            }
        }
        return arr;
    }

    //Insertion Sort: In Descending Order
    private static int[] insertionSortDesc(int[] arr) {
        for (int i=1; i< arr.length; i++){
            int j=i;
            while (j >= 1){
                if (arr[j] > arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                j--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[]arr = {20, 22, 13, 5, 97,1,7,98};
        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.println("Sorted Array(Ascending): " + Arrays.toString(insertionSort(arr)));
        System.out.println("Sorted Array(Descending): " + Arrays.toString(insertionSortDesc(arr)));

    }
}
