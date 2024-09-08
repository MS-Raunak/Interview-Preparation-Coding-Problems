package pkg1_array.array_1d_sorting;

import java.util.Arrays;

/**
 * Quick Sort:
 * It is a divide and conquered problem.
 * Technique:
 * 1- suppose arr = [20, 22, 13, 5, 97]
 * 2- where Pivot element is the last element of the given arr which is 97
 * 3- Now placed all smallest element on the left side of pivot element
     and all largest element on the right side of pivot element
 * 4- Above 3rd step we are achieving in below code using partition method
 * 5- After that 1 element(pivot) got their actual index
 * 6 - Now two partitioned array beside pivot have to sort
 * 7- Now call the quickSort method recursively to sort the array
 *
 * Time Complexity Of QuickSort
 * In Worst Case
     O(n^2), because of
     worst case occurs when pivot ele always either be smallest or largest.
     The reason of worst case is Array is already sorted
 * In Average Case:
 * Average : O(nlogn)
 *
 */
public class QuickSort {

    //swapping
    public static void swap(int[]arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //Array Partitioning
    private static int partition(int[]arr, int lowIdx, int highIdx) {
       int pivot = arr[highIdx]; //suppose pivot element as last element of the array
        int i = lowIdx-1; //initially i point to the 0-1 means -1th index

        for (int j=lowIdx; j<highIdx; j++) {
            if (arr[j] < pivot){
                i++;
                swap(arr,i,j);
            }
        }
        i++;
        swap(arr, i, highIdx);
        return i; //here i is the pivotIdx
    }

    //Quick Sort in Ascending Order
    private static int[] quickSort(int[] arr, int lowIdx, int highIdx) {
        if (lowIdx < highIdx) {
            int pivotIdx = partition(arr, lowIdx, highIdx);
            quickSort(arr, lowIdx, pivotIdx - 1);
            quickSort(arr, pivotIdx + 1, highIdx);
        }
        return arr;
    }


    public static void main(String[] args) {
        int[]arr = {20, 22, 13, 5, 97};
        System.out.println("Array before sorting: " + Arrays.toString(arr));

        int n = arr.length;
        System.out.println("Array after sorting: " + Arrays.toString(quickSort(arr, 0, n-1)));
    }
}

/**
 * The functionality of above code
 * The swap method swaps two elements in the array.
 * The partition method partitions the array around a pivot element (here, the last element), placing smaller elements to the left and larger elements to the right.
 * The quickSort method is the main sorting function, which recursively sorts the array by partitioning it and sorting the subarrays.
 * In the main method, an array is initialized, and then the quickSort method is called to sort the array.
 */