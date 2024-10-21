package pkg3_recursion;

import java.util.Arrays;

//Reverse an array
public class P8_ReverseArr {
    public static void main(String[] args) {
        int[]arr = {1,4,6,7,12,9};
        reverse(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int i, int j) {
        if (i>j) return;

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        reverse(arr, i+1, j-1);

    }
}
