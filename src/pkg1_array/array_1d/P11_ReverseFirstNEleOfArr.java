package pkg1_array.array_1d;

import java.util.Arrays;

public class P11_ReverseFirstNEleOfArr {
    public static void main(String[] args) {
        int[]arr = {2,3,4,5,6};
        int n = 2;

        reverse(arr, n);
    }

    private static void reverse(int[]arr, int n){
        int count=0;
        int start=0;
        int end = arr.length-1;

        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
            count++;

            if (count==n) {
                System.out.println(Arrays.toString(arr));
                return;
            }

        }
    }
}
