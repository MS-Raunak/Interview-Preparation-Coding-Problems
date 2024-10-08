package pkg1_array.array_1d;

import java.util.Arrays;

/**
 *
 * arr:[1,2,3,4,5,6,7]
 * rotate array kth step in rightSide
 * Exp(optimized sol):
 * suppose k=3
 * step-1: reverse entire arr => 7,6,5,4,3,2,1
 * step-2: rotate first k elements => 5,6,7, [4,3,2,1
 * step-3:rotate last n-k elements => 5,6,7,[1,2,3,4
 * so final output = [5,6,7,1,2,3,4] after rotating 3 steps in right-side
 * T.C.:O(n) , S.C: O(1) bkg not taken any extra arr
 */
public class P23_RotateArr {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5,6,7};
        int k=3;
        bruteForceSol(arr, k); //rotating using bruteforce approach

        rotateArr(arr,k); //rotating using optimized approach
        System.out.println(Arrays.toString(arr));

    }

    //Bruteforce approach
    private static void bruteForceSol(int[] arr, int k) {
        int[] temp = new int[arr.length];
        //1,2,3,4,5,6,7

        //step-1: copy last k elements of arr in the beginning of temp
        int idx=0;
        for (int i= arr.length-k; i< arr.length; i++){
            temp[idx++] = arr[i];
        }

        //step-2: copy first arr.length-k elements in the temp after the step-1 elements
        for (int i=0; i< arr.length-k; i++){
            temp[idx++] = arr[i];
        }

        //final output
        System.out.println(Arrays.toString(temp));

    }

    //Optimized Approach
    private static void rotateArr(int[]arr,int k) {
        k = k% arr.length; //if arr size is less than k
        //step-1: reverse whole arr
        reverseArr(arr, 0, arr.length-1);
        //step-2: reverse first k elements after reverse whole arr
        reverseArr(arr, 0, k-1);
        reverseArr(arr, k, arr.length-1);

    }

    private static void reverseArr(int[] arr, int i, int j) {
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] =temp;
            i++;
            j--;
        }
    }
}
