package pkg1_array.array_1d;

import java.util.Arrays;

/**
 * Merge 2 array in sorted order without taking third array
 * EX:
 * arr1 = {1,2,3,0,0,0}, m=3, length of arr1(by excluding 0)
 * arr2 = {2,5,6},       n=3, length of arr2
 * Expected OP: [1, 2, 2, 3, 5, 6]
 */
public class P17_Merge2ArrLeetcode {
    public static void main(String[] args) {
        int []arr1 = {1,2,3,0,0,0};
        int[]arr2 = {2,5,6};

        mergeArr(arr1,arr2,3,3);
    }

    private static void mergeArr(int[] arr1, int[] arr2, int m, int n) {
        int r1 = m-1; //last non-zero ele position in arr1
        int r2 = n-1; //last ele position in arr2
        int w =  (m+n)-1; //last ele position in arr1
        //r1 & r2 ptr read and compare the value from both the arrays and w ptr writes(merge) the ele in arr1

        while (w>=0){
            if (r1>=0 && r2>=0){
                arr1[w] = arr1[r1] < arr2[r2] ? arr2[r2--] : arr1[r1--];
            }
            else if (r1>=0){
                arr1[w] = arr1[r1--];
            }
            else {
                arr1[w] = arr2[r2--];
            }
            w--;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
