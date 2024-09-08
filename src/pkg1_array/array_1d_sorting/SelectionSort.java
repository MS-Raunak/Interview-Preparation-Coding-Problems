package pkg1_array.array_1d_sorting;

import java.util.Arrays;

/**
 * Implements the selection sort algorithm by iterating over the array,
 * finding the smallest element, and swapping it with the first unsorted element.
 *
 * Step-1: Initially, the entire array is considered as the unsorted sub-array,
 * and the sorted sub-array is empty.
 *
 * Step-2: Find the smallest (or largest) element in the unsorted sub-array.
 * Step-3: Swap the smallest (or largest) element with the first element of the unsorted
 * sub-array, effectively moving it to the end of the sorted sub-array.
 *
 * Step-4: Move the boundary between the sorted and unsorted subarrays one position to
 * the right.
 * Step-5: Repeat steps 2-4 until the entire array is sorted.
 */
public class SelectionSort {

    //Selection Sort in Ascending
    private static int[] selectionSort(int[] arr) {
        for (int i=0; i< arr.length; i++) {
            int smallestEleIdx=i;//select ith element
            for (int j=i+1; j< arr.length; j++) {
                //comparison b/w ith ele and all elements of right-side
                if (arr[j]<arr[smallestEleIdx])
                    smallestEleIdx = j;

            }
            int temp = arr[i];
            arr[i] = arr[smallestEleIdx];
            arr[smallestEleIdx] = temp;
        }
        return arr;
    }

    //Selection Sort in Ascending
    private static int[] selectionSortDesc(int[] arr) {
        for (int i=0; i< arr.length; i++) {
            int smallestEleIdx=i;//select ith element
            for (int j=i+1; j< arr.length; j++) {
                //comparison b/w ith ele and all elements of right-side
                if (arr[j]>arr[smallestEleIdx])
                    smallestEleIdx = j;

            }
            int temp = arr[i];
            arr[i] = arr[smallestEleIdx];
            arr[smallestEleIdx] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[]arr = {20, 22, 13, 5, 97};
        System.out.println("Given Array: " + Arrays.toString(arr));
        System.out.println("Sorted Array: " + Arrays.toString(selectionSort(arr)));
        System.out.println("Sorted Array: " + Arrays.toString(selectionSortDesc(arr)));

    }

}
