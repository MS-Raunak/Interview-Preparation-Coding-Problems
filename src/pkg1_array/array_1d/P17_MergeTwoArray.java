package pkg1_array.array_1d;

import java.util.Arrays;

public class P17_MergeTwoArray {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        int[]arr2 = {6,7,8,9,10};

        //merge(arr, arr2);
        int ans[] = mergeSorted(arr, arr2);
        System.out.println(Arrays.toString(ans));

    }

    //Merge two sorted array in sorted form
    public static int[] mergeSorted(int[] arr, int[] arr2) {
        int[] ans = new int[arr.length + arr2.length];

        int idx1 = 0;
        int idx2 = 0;
        int ansIdx = 0;

        //Merge Arrays:
        // * Iterate through both arrays simultaneously.
        while (idx1 < arr.length && idx2 < arr2.length) {
            if (arr[idx1] < arr2[idx2]) {
                ans[ansIdx] = arr[idx1];
                ansIdx++;
                idx1++;
            } else {
                ans[ansIdx] = arr2[idx2];
                ansIdx++;
                idx2++;
            }
        }

        //If any array has remaining elements, add them to the merged array.
        while (idx1 < arr.length) {
            ans[ansIdx] = arr[idx1];
            ansIdx++;
            idx1++;
        }
        while (idx2 < arr2.length) {
            ans[ansIdx] = arr2[idx2];
            ansIdx++;
            idx2++;
        }

        return ans;
    }



}


/**
 * Solution Explanation
 * Step-1: Initialize Variables:
 * Initialize three index variables for each array and one for the merged array.
 *
 * Step-2: Merge Arrays:
 * Iterate through both arrays simultaneously.
 * Compare elements at each index and add the smaller one to the merged array.
 *
 * Step-3:Handle Remaining Elements:
 * If any array has remaining elements, add them to the merged array.
 *
 * Step-4: Return Merged Array:
 * Return the merged array.
 */