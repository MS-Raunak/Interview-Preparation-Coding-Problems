package pkg1_array.array_1d;

import java.util.Arrays;

public class P7_FirstDistinctAndCommonEle {

    //Find first distinct(unique) element
    public static void firstDistinctEle(int[]arr) {
        for (int i=0; i< arr.length; i++) {
            for (int j=i+1; j< arr.length; j++) {
                if (arr[i]!=arr[j]){
                    System.out.println(arr[i] + " is the first distinct element in given array");
                    return;
                }
            }
        }
    }

    //Find first common(repeated element)
    public static void firstCommon(int[]arr) {
        for (int i=0; i< arr.length; i++) {
            for (int j=i+1; j< arr.length; j++) {
                if (arr[i]==arr[j]){
                    System.out.println(arr[i] +" is the first common element in given array");
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[]arr = {2,4,8,12,3,23,12,8};
        System.out.println("Given Array: " + Arrays.toString(arr));

        firstDistinctEle(arr);
        firstCommon(arr);
    }
}
