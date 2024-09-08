package pkg1_array.array_1d;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Write a function that takes two arrays as input and returns an array containing
 * elements that are common to both input arrays.
 *
 * Example:
 * input1: arr[1,2,3,4,6], input2: arr[7,2,3,6,4,5]
 * output: arr[2,3,4,6]
 */

public class P15_CommonElements {

    // finding common elements from two array
    private  static int[] commonElements(int[]arr1, int[]arr2){
        HashSet<Integer> set = new HashSet<>();

        for (int i=0; i<arr1.length; i++) {
            for (int j=0; j< arr2.length; j++) {
                if (arr1[i]==arr2[j]){
                    set.add(arr1[i]);
                }
            }
        }

        int[]ans = new int[set.size()];
        int i=0;
        for (int e: set) {
            ans[i++] = e;
        }


        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,6,2};
        int[] arr2 = {7,2,3,6,4,5};

        int[] ansArr = commonElements(arr1, arr2);

        System.out.println(Arrays.toString(ansArr));
    }
}
