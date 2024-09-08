package pkg1_array.array_1d;

import java.util.Arrays;

//Print all elements in reverse order
public class P10_ReverseArray {

    //Reverse an array
    private static void reverseArray(int[] arr) {
        int temp[] = new int[arr.length];
        int idx=0;
        for (int i= arr.length-1; i>=0; i--){
            temp[idx] = arr[i];
            idx++;
        }
        System.out.println(Arrays.toString(temp));
    }

    //Best Approach To Reverse an array: new array not required
    private static void reverse(int[]arr){
        int i=0;
        int j=arr.length-1;
        while (i<j){
            int temp=arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        //reverseArray(arr);
        reverse(arr);
    }
}
