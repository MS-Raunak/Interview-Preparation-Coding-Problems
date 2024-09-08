package pkg1_array.array_1d_searching;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Binary Search Algorithm
 * Condition:
 * - Array must be sorted
 * Algorithm:
 * - take two pointer start index and end index
 * - find mid-index with the help of above st and end index
 * - check whether the key and is equal to arr[mid] r not
 * - If equal then return mid index
 * - otherwise check whether the key is greater than arr[mid] or smaller
 * - If smaller then change the end index value and update by mid-1
 * - If greater then change the start index value and update by mid+1
 * - do above 6 step until st<=end
 */
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[]arr = {2, 12, 13, 15, 97};
        System.out.println("Given Array: " + Arrays.toString(arr));

        System.out.print("enter key(ele): ");
        int key = sc.nextInt();


        //int index = binSearch(arr, key);
        int index = binSearchRec(arr, key, 0, arr.length-1);

        if (index==-1)
            System.out.println("Element not found in given array");
        else System.out.println("Given element " + key + " is found at " + index + "th index");
    }

    //Binary Search Algorithm Using While Loop
    private static int binSearch(int[] arr, int key) {

        int stIdx=0;
        int endIdx = arr.length-1;

        while (stIdx<=endIdx){
            int mid = (stIdx+endIdx)/2;

            if (key == arr[mid] )
                return mid;

            else if (key < arr[mid] )
                endIdx=mid-1;

            else
                stIdx=mid+1;

        }
        return -1;
    }

    //Binary Search Algorithm Using Recursion
    private static int binSearchRec(int[] arr, int key, int st, int end) {
        if (st>end)
            return -1;

        int mid = (st+end)/2;

         if (key==arr[mid]) return mid;
         else if (key < arr[mid])
             return binSearchRec(arr,key,st,mid-1);
         else
             return binSearchRec(arr, key, mid+1, end);

    }
}
